pipeline {
    agent any

    stages {
//         stage('Clone') {
//             steps {
//                 withMaven(maven : 'maven-3.8.6'){
//                     sh 'mvn clone https://github.com/hossamsalahaldin/jenkins-pipeline.git'
//                 }
//             }
//         }
        stage('Build') {
            steps {
                withMaven(maven : 'maven-3.8.6'){
                     sh 'mvn clean install'
                }
               
            }
        }
        stage('Run'){
            steps{
                sh 'java -jar $WORKSPACE\'/target/jenkins-tutorial-0.0.1-SNAPSHOT.jar\''&
            }
        }
    }
}
