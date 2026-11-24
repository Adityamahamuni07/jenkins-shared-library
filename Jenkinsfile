@Library('my-shared-library') _

pipeline {
    agent any

    stages {

        stage('Welcome') {
            steps {
                hello()
            }
        }

        stage('Build') {
            steps {
                echo 'Building application...'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing application...'
            }
        }
    }
}
