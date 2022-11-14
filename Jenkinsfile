pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
               echo 'Cloning the repo...'
               sh 'mvn clone https://github.com/hossamsalahaldin/jenkins-pipeline.git'
            }
        }
        stage('Build') {
            steps {
              echo 'building repo ...'
              sh 'mvn clean install'
            }
        }
        stage('Run'){
            steps{
                echo 'Running java app'
                sh 'java -jar\'$WORKSPACE\'/target/jenkins-tutorial-0.0.1-SNAPSHOT.jar\'&'
            }
        }
    }
}
