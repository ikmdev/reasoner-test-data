# Reasoner Test Data

Builds maven test data artifacts for SNOMED and other data sources that are not open source licensed.

## Building and Running

Requires Java 21. Clone the repo, change to the cloned repo location.

Unix/Linux/OSX:

```
./mvnw clean install
```

Windows:

```
./mvnw.cmd clean install
```

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

These artifacts are used for integration testing in the [IKM Elk Reasoner project](https://github.com/ikmdev/ikm-reasoner)

### Tinkar Test Data

The tinkar-reasoner-test-data module packages test dbs for testing tinkar reasoner service implementations.

## Issues and Contributions

Technical and non-technical issues can be reported to the GitHub Issue Tracker.

Contributions can be submitted via pull requests. Please check the [contribution guide](doc/how-to-contribute.md) for more details.

### Team Ownership - Product Owner

Data Team - Eric Mays (External) <emays@mays-systems.com>