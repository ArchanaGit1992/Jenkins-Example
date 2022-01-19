pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                withMaven(maven : 'Maven 3.8.1'){
                    sh 'mvn clean compile'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                 withMaven(maven : 'Maven 3.8.1'){
                    sh 'mvn test'
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                 withMaven(maven : 'Maven 3.8.1'){
                    sh 'mvn deploy'
                }
            }
        }
    }
}
