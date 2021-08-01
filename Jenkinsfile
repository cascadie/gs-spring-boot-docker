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
					WEB_IMAGE_NAME="${ACR_LOGINSERVER}/gs-spring-boot:kube${BUILD_NUMBER}"
					docker build -t $WEB_IMAGE_NAME ./gs-spring-boot
					docker login ${ACR_LOGINSERVER} -u ${ACR_ID} -p ${ACR_PASSWORD}
					docker push $WEB_IMAGE_NAME
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
 