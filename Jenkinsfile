pipeline {
    
    agent any

    stages {
        stage('Git Pull stage') {
            steps {
                git url: 'https://github.com/sivanich9/Calculator',
                    branch: 'main'
            }
        }
        stage('Maven test'){
            steps{
                script{
                    sh 'mvn clean test'            
                } 
            }
        }
        stage('Maven Build'){
            steps{
                script{
                    sh 'mvn clean install'            
                } 
            }
        }    
        stage('Docker Build Image'){
            steps{
                script{
                     sh 'sudo docker build -t sivani4/calculator:latest .'
                }
            }
        }
        stage('Push Docker Image'){
            steps{
                script{
                    withDockerRegistry([ credentialsId: "DockerJenkins", url: "" ]) 
                    {
                        sh 'sudo docker push sivani4/calculator:latest'
                    }
                }
            }
        }
    }
}    




