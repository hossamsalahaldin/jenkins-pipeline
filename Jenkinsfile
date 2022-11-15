pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
               echo 'Cloning the repo...'
               withMaven(maven : 'maven-3.8.6'){
                    sh 'mvn clone -X https://github.com/hossamsalahaldin/jenkins-pipeline.git'
               }
              
            }
        }
        stage('Build') {
            steps {
              echo 'building repo ...'
              withMaven(maven : 'maven-3.8.6'){
                  sh 'mvn clean install'   
              }
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
