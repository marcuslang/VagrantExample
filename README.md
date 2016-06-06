# VagrantExample
Example project for a maven driven test with Vagrant

## module integration
In phase 'Integration' Maven starts a Vagrant instance and starts a test against a microservice. 

1. pre-integration-test: 
* Start Vagrant VM
* Install Java
* Start microservice on port 7081
    
2. integration-test:
* run a test against the rest interface of the microservice    

3. post-integration-test:
* Shutdown Vagrant VM


## module simple-service
A simple microservice for the tests with Vagrant.