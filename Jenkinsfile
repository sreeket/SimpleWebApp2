node {
   stage('Preparation') {
      git 'https://github.com/sreeket/SimpleWebApp2.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}