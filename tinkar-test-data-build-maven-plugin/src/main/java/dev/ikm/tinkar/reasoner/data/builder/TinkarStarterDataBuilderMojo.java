package dev.ikm.tinkar.reasoner.data.builder;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import dev.ikm.tinkar.sandbox.TinkarStarterData;

@Mojo(name = "tinkar-starter-data-build")
public class TinkarStarterDataBuilderMojo extends AbstractMojo {

	@Parameter(property = "tinkar-starter-data-build.dataStoreDir")
	private String dataStoreDir;

	@Parameter(property = "tinkar-starter-data-build.exportFile")
	private String exportFile;

	public void execute() throws MojoExecutionException {
		getLog().info("Data store: " + dataStoreDir);
		getLog().info("Export file: " + exportFile);
		String[] args = { dataStoreDir, exportFile };
		TinkarStarterData.main(args);
	}

}
