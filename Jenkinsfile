@Library('my-shared-library') _

pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Adityamahamuni07/jenkins-shared-library.git',
                    credentialsId: 'github-token'
            }
        }

        stage('Maven Build') {
            steps {
                mavenBuild()
            }
        }

        stage('Docker Build') {
            steps {
                dockerBuild('aditya9023/jenkins-maven-demo', '23')
            }
        }
    }
}
