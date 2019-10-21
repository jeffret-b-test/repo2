pipeline {
    agent { 'master' }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean verify'
            }
        }
    }
}