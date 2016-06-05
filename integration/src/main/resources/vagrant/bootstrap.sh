#!/usr/bin/env bash
echo installing necessary stuff
# use update if you want to have the newest things
# apt-get update
apt-get install python-software-properties -y
add-apt-repository ppa:openjdk-r/ppa -y
apt-get update
apt-get install -y openjdk-8-jdk ansible

java -jar /vagrant/simple-service-1.0-SNAPSHOT.jar
