# Tinkar Reasoner Test Data

## Reasoner test data artifacts

Packages test dbs for testing reasoner service implementations.

Each db is packaged in a project where the root directory and db directory are specified as properties. There is a common assembly descriptor in the parent.

For example:

	<artifactId>reasoner-test-data-snomed-us-20200901</artifactId>
	<version>2024.05.02</version>
	<packaging>pom</packaging>

	<properties>
		<data.dir>${user.home}/SolorTest</data.dir>
		<data>SnomedCT_US_20200901_SpinedArray-20240502</data>
	</properties>
