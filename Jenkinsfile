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
    tools {
    	maven 'maven 3.8.1'
  	}
    stages {
		
		stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn clean install"
            }
        }
		stage("Package") {
			steps {
				withDockerRegistry([credentialsId: 'acr-credentials', url: "http://${registryUrl}"]) {
					sh """
						WEB_IMAGE_NAME="${env.ACR_LOGINSERVER}/gs-spring-boot:kube${env.BUILD_NUMBER}"
						docker build -t \${WEB_IMAGE_NAME} ./
						docker push \${WEB_IMAGE_NAME}
					"""
				}
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
 