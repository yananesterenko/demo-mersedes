pipeline{
   agent any
   stages {

       stage('Scm checkout') {
            steps {
                git credentialsId: 'github-cred', url: 'https://github.com/yananesterenko/demo-mersedes'
            }
       }
       stage('Mvn Compile'){
            steps {
               def mvnHome = tool name: 'Maven', type: 'maven'
               def mvnCMD = "${mvnHome}/bin/mvn"
               sh "${mvnCMD} clean compile -DskipTests=true"
           }
       }
        stage('Mvn Package'){
            steps {
               def mvnHome = tool name: 'Maven', type: 'maven'
               def mvnCMD = "${mvnHome}/bin/mvn"
               sh "${mvnCMD} package -DskipTests=true"
            }
       }
       stage("Docker build Image") {
            steps {
                sh "docker build -t  yana20200212/demomerc ."
            }
       }
        stage("Docker push Image") {
            steps {
               withCredentials([string(credentialsId: 'docker-pwd2', variable: 'dockerHubPwd')]) {
               sh "docker login -u yana20200212 -p ${dockerHubPwd}"
               sh 'docker push yana20200212/demomerc:latest'
                }
           }
        }
   }
}