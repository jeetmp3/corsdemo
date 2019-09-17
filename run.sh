#!/usr/bin/env bash
rm -rf ./run-app
mvn clean package
mkdir ./run-app
cp -rf ./target/CorsDemo.war ./run-app/ROOT.war
cp -rf ./config.properties ./run-app/config.properties
docker run -it --rm --name tomcat -p 8888:8080 -v "$(pwd)/run-app":/usr/local/tomcat/webapps/ tomcat:7
