pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                withCredentials([usernameColonPassword(credentialsId: '7f563f16-0fce-4dbf-b35e-0e379cf219f1', variable: 'USERPASS')]) { {
                    sh 'echo $USERPASS > out2.txt'
                    sh 'cat out2.txt'
                    archiveArtifacts artifacts: '*.txt'
                    echo '${USERPASS}'
                }

                sh 'mvn clean verify'
            }
        }
    }
}