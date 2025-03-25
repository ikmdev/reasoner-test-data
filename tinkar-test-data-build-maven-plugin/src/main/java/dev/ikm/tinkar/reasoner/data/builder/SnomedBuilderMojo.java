package dev.ikm.tinkar.reasoner.data.builder;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import dev.ikm.snomedct.entitytransformer.SnomedTransformer;
import dev.ikm.tinkar.common.service.CachingService;

@Mojo(name = "snomed-build")
public class SnomedBuilderMojo extends AbstractMojo {

	@Parameter(property = "snomed-build.dataStoreDir")
	private String dataStoreDir;

	@Parameter(property = "snomed-build.dataSourceDir")
	private String dataSourceDir;

	@Parameter(property = "snomed-build.controllerName", defaultValue = "Open SpinedArrayStore")
	private String controllerName;

	public void execute() throws MojoExecutionException {
		Path data_source_dir_full = Paths.get(dataSourceDir, "/Full/Terminology");
		getLog().info("Data store: " + dataStoreDir);
		getLog().info("Data source dir: " + dataSourceDir);
		getLog().info("Data source full terminology: " + data_source_dir_full);
		getLog().info("Controller name: " + controllerName);
		CachingService.clearAll();
		SnomedTransformer snomedTransformer = new SnomedTransformer();
		snomedTransformer
				.transformFile(Paths.get(dataStoreDir).toFile(), data_source_dir_full.toFile(),
				controllerName);
	}

}
