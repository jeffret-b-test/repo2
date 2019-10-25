pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                withCredentials([usernameColonPassword(credentialsId: '3307507d-fa2a-4064-a815-444ff3e212b0', variable: 'USERPASS')]) {
                    sh 'echo $USERPASS > out2.txt'
                    sh 'cat out2.txt'
                    archiveArtifacts artifacts: '*.txt'
                    echo '${USERPASS}'
                }
                echo 'maybe not completely different -- no trademark violation'
                sh 'mvn clean verify'
            }
        }
    }
}