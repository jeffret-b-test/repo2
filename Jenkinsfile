pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                withCredentials([string(credentialsId: 'gcp3', variable: 'NSECRET')]) {
                    sh 'echo $NSECRET > out2.txt'
                    sh 'cat out2.txt'
                    archiveArtifacts artifacts: '*.txt'
                    echo '${NSECRET}'
                }

                sh 'mvn clean verify'
            }
        }
    }
}