pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: 'b9ebc014-afc9-4e4e-a263-d267da09aa06', keyFileVariable: 'KEYFILE', passphraseVariable: 'PASSPHRASE', usernameVariable: 'USERNAME')]) {
                    sh 'echo $KEYFILE > out2.txt'
                    sh "echo >> out2.txt"
                    sh 'echo $PASSPHRASE : $USERNAME >> out2.txt'
                    sh 'cat out2.txt'
                    archiveArtifacts artifacts: '*.txt'
                    echo '${NSECRET}'
                }

                sh 'mvn clean verify'
            }
        }
    }
}