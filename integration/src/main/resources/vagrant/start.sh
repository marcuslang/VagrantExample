#!/bin/bash
cd "$(dirname "$0")" #set current dir as working dir

cp ././../../../../../simple-service/target/simple-service-1.0-SNAPSHOT.jar . #doogy hack, improve this

vagrant up