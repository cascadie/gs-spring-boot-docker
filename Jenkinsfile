pipeline {
     agent any
     
        environment {
        //once you create ACR in Azure cloud, use that here
        registryName = "myFirstContainerRegistry111"
        //- update your credentials ID after creating credentials for connecting to ACR
        registryCredential = 'ACR'
        dockerImage = ''
        registryUrl = 'myfirstcontainerregistry111.azurecr.io'
    }
    
    stages {

		stage("Build") {
			steps {
				sh """
					echo "aaaaaaaaaaaaaaaaaaa"
					WEB_IMAGE_NAME="${env.ACR_LOGINSERVER}/gs-spring-boot:kube${env.BUILD_NUMBER}"
					echo $WEB_IMAGE_NAME
				"""
			}
		}
		stage("Deploy") {
			steps {
				sh """
					echo "deploy"
				"""
			}
		}
	}
 }
 