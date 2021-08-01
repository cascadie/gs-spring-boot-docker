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
					WEB_IMAGE_NAME="${env.ACR_LOGINSERVER}/gs-spring-boot:kube${env.BUILD_NUMBER}"
					docker build -t ${env.WEB_IMAGE_NAME} ./gs-spring-boot
					docker login ${env.ACR_LOGINSERVER} -u ${env.ACR_ID} -p ${env.ACR_PASSWORD}
					docker push ${env.WEB_IMAGE_NAME}
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
 