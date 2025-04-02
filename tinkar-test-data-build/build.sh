#!/bin/bash

mvn tidy:pom

cd tinkar-test-data-build-snomed-intl-20240701
mvn clean install -Dmaven.build.cache.enabled=false -PtestDataBuild
cd ..

cd tinkar-test-data-build-snomed-intl-20250101
mvn clean install -Dmaven.build.cache.enabled=false -PtestDataBuild
cd ..

cd tinkar-test-data-build-snomed-us-20240901
mvn clean install -Dmaven.build.cache.enabled=false -PtestDataBuild
cd ..

cd tinkar-test-data-build-snomed-us-20250301
mvn clean install -Dmaven.build.cache.enabled=false -PtestDataBuild
cd ..
