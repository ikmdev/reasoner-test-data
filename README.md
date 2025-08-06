# Reasoner Test Data

Builds maven test data artifacts for SNOMED and other data sources that are not open source licensed.

## Building and Running

Requires Java 24.
Requires Maven 3.9.11
Requires Git

To build on Unix/Linux/OSX: `./mvnw clean install`

On Windows: `./mvnw.cmd clean install`

Building test data artifacts is skipped by default.

To build test data artifacts:

```
./mvnw clean install -DskipTestDataBuild=false
```

### SNOMED Test Data

The snomed-test-data module packages data in the SNOMED release format with the following conventions:
* The base directory is `${user.home}/data/snomed`
* The release directory is the release archive filename e.g. `SnomedCT_InternationalRF2_PRODUCTION_20190731T120000Z`
* The included files are those in `Snapshot/Terminology`

To package a different SNOMED release, create a new sub-module similar to an existing one and change the edition property:
* `<snomed.edition>SnomedCT_InternationalRF2_PRODUCTION_20190731T120000Z</snomed.edition>`

To package a full release, set the `snomed.path property` as follows:
* `<snomed.path>${snomed.edition}/Full/Terminology</snomed.path>`


These artifacts are used for integration testing in the [IKM Elk Reasoner project](https://github.com/ikmdev/ikm-reasoner)

### Tinkar Test Data

The tinkar-reasoner-test-data module packages test dbs for testing tinkar reasoner service implementations.

### SNOMED CT Data Maven plugin

Currently depends on the snapshot version of the plugins in [snomed-ct-data/plugin](https://github.com/ikmdev/snomed-ct-data)

### Tinkar Test Data SNOMED db

To build the tinkar starter data and a tinkar db for SNOMED activate the testDataBuild profile.

```
mvn clean install -PtestDataBuild
```


### Team Ownership - Product Owner

Data Team - Eric Mays (External) <emays@mays-systems.com>

## Issues and Contributions
Technical and non-technical issues can be reported to the [Issue Tracker](https://github.com/ikmdev/reasoner-test-data/issues).

Contributions can be submitted via pull requests. Please check the [contribution guide](doc/how-to-contribute.md) for more details.
