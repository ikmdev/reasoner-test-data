# Reasoner Test Data

Builds maven test data artifacts for SNOMED and other data sources that are not open source licensed.

## Getting Started

Required for running this:

1. Download and install Open JDK Java 21


## Building and Running

Follow the steps below to build and run Komet on your local machine:

1. Clone the repository from GitHub to your local machine

2. Change local directory to cloned repo location

3. Enter the following command to build the application:

Building test data artifacts is skipped by default.

To build test data artifacts:

```bash
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