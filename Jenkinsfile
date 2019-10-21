pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean verify'
            }
        }
    }
}