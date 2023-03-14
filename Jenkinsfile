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
    }
}    
