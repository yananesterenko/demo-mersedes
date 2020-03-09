pipeline{
   stages {
       stage('Scm checkout') {
           git credentialsId: 'github-cred', url: 'https://github.com/yananesterenko/demo-mersedes'
       }
       stage('Mvn Compile'){
           def mvnHome = tool name: 'Maven', type: 'maven'
           def mvnCMD = "${mvnHome}/bin/mvn"
           sh "${mvnCMD} clean compile -DskipTests=true"
       }
        stage('Mvn Package'){
           def mvnHome = tool name: 'Maven', type: 'maven'
           def mvnCMD = "${mvnHome}/bin/mvn"
           sh "${mvnCMD} package -DskipTests=true"
       }
       stage("Docker build Image") {
           sh "docker build -t  yana20200212/demomerc ."
       }
        stage("Docker push Image") {
           withCredentials([string(credentialsId: 'docker-pwd2', variable: 'dockerHubPwd')]) {
           sh "docker login -u yana20200212 -p ${dockerHubPwd}"
           sh 'docker push yana20200212/demomerc:latest'
           }
        }
   }
}