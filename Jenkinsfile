pipeline {
   agent any
   environment {
       // Optional environment variables
       APP_ENV = 'dev'
   }
   stages {
       stage('Clone') {
           steps {
              git branch: 'main',
               url: 'https://github.com/Sovit12/jenkins_pipeline_demo.git'
           }
       }
       stage('Build') {
           steps {
               echo 'Building the project...'
              bat 'mvn clean install' 
           }
       }
       stage('Test') {
           steps {
               echo 'Running tests...'
               bat 'mvn test' 
           }
       }
      stage('Deploy') {
           steps {
               echo "Deploying to ${env.APP_ENV} environment..."
               // Your deployment logic here
           }
       }
   }
   post {
       success {
           emailext (
               subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
               body: "Good news! Build succeeded.\n\n${env.BUILD_URL}",
               to: "sovitpattnaik2018@gmail.com"
           )
       }
       failure {
           emailext (
               subject: "FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
               body: "Uh-oh. Build failed.\n\n${env.BUILD_URL}",
               to: "sovitpattnaik2018@gmail.com"
           )
       }
   }

}
