pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                echo 'maybe not completely different -- no trademark violation'
                sh 'mvn clean verify'
            }
        }
        stage('scm checkout') {
            steps {
                scm checkout
            }
        }
    }
}