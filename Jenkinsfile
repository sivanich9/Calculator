pipeline {
    
    agent any

    stages {
        stage('Git Pull stage') {
            steps {
                git 'https://github.com/sivanich9/Calculator'
            }
        }
        stage('Maven Build'){
            steps{
                script{
                    sh 'mvn clean install'            
                } 
            }
        }
        stage('Maven test'){
            steps{
                script{
                    sh 'mvn clean test'            
                } 
            }
        }
        stage('Docker Build Image')
        {
            steps{
                script{
                    imageName = docker.build "sivani4/calculator:latest"
                }
            }
        }
        stage('Push Docker Image')
        {
            steps{
                script{
                    docker.withRegistry("", 'sivani4/calculator' ){
                        imageName.push()
                    }
                }
            }
        }
    }
}    
