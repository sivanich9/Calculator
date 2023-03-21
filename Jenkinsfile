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
                     sh 'docker build -t sivani4/calculator:latest .'
                }
            }
        }
        stage('Push Docker Image'){
            steps{
                script{
                    withDockerRegistry([ credentialsId: "dockercred", url: "" ]) 
                    {
                        sh 'docker push sivani4/calculator:latest'
                    }
                }
            }
        }      
        stage("Ansible deploy") {
            steps {
                script {
                    // sh "ssh-keygen -t rsa"
                    // sh "ssh-copy-id  sivani@localhost"
                    // ansiblePlaybook disableHostKeyChecking: true, installation: 'ansible_1', inventory: 'inventory', playbook: 'p2.yml'
                    sh "/usr/bin/pip3 install docker"
                    sh "ansible-playbook p2.yml -i inventory"
                }
            }
        }
    }
}    

