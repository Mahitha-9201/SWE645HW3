pipeline {
    agent any
    tools {
        // Replace 'JDK17' with the name you've given to your JDK installation in Jenkins' Global Tool Configuration
        jdk 'JDK17'
    }
    environment {
        DOCKERHUB_CREDENTIALS = credentials('dockerhub')
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
                sh 'docker build -t mahitha9201/studentsurvey:latest .'
            }
        }
        stage('Login') {
            steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }
        stage('Push image to Docker Hub') {
            steps {
                sh 'docker push mahitha9201/studentsurvey:latest'
            }
        }
        stage('Deploying on Kubernetes') {
            steps {
                // Set the correct context for your Kubernetes cluster
                sh 'kubectl config use-context swe645hw3'
                // Update the image in your deployment
                sh 'kubectl set image deployment/swe645deployment container-0=mahitha9201/studentsurvey:latest -n default'
                // Restart the deployment to apply the changes
                sh 'kubectl rollout restart deploy swe645deployment -n default'
            }
        }
    }
    post {
        always {
            sh 'docker logout'
        }
    }
}
