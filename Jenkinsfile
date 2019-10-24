pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                withCredentials([string(credentialsId: '7ab2198b-69a1-4833-8f05-0f74bdcc5bde', variable: 'NSECRET')]) {
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