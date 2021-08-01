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
					echo "+++++++++++++++++++++++++++++++++++++++"
					echo "${ACR_LOGINSERVER}"
					echo "${BUILD_NUMBER}"
					echo "${ACR_ID} "
					WEB_IMAGE_NAME="/gs-spring-boot:kube"
					echo "${WEB_IMAGE_NAME}"
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
 