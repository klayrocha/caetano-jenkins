pipeline {
    agent any
    stages {
        stage('Build Application'){
            steps {
                bat 'mvn clean package'
            }
        }    
        stage('Deploy Application'){
            steps {
                deploy adapters: [tomcat8(credentialsId: 'Login_TomCat', path: '', url: 'http://localhost:8001/')], contextPath: 'caetano-jenkins', war: 'target/caetano-jenkins-0.0.1-SNAPSHOT.war'
            }
        }  
    }
    post {
        always {
            bat 'echo fim !'
        }
    }
}
