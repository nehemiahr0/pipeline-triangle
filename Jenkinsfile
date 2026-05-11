pipeline {
    agent any
    
    tools {
        maven 'Maven 3' 
    }

    stages {
        stage('git checkout') {
            steps {
                git branch: 'main', 
                    credentialsId: '2cbb2299-092c-473d-8928-a91297b35837',
                    url: 'https://github.com/nehemiahr0/pipeline-triangle.git'
            }
        }

        stage('Build the application') {
            steps {
                // Remplacement de sh par bat
                bat "mvn clean install"
            }
        }
        
        stage('UnitTestExecution'){
             steps{
                 // Remplacement de sh par bat
                 bat 'mvn test'
             }
        }

        stage('Build Docker Image') {
            steps {
                // Utilise ton nom d'utilisateur DockerHub pour le tag
                bat "docker build -t nehemiahr0/pipeline-triangle:latest ."
            }
        }
        
        stage('Push Image to DockerHub'){
            steps {
                 // On utilise 'usernamePassword' au lieu de 'string'
                 withCredentials([usernamePassword(credentialsId: '68746942-45cf-45e4-9768-9ea197523964', 
                usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                 // On utilise les variables générées pour se connecter
                 bat "docker login -u %DOCKER_USER% -p %DOCKER_PASS%"
                 bat "docker push nehemiahr0/pipeline-triangle:latest"
                }
            }
        }
    }
}