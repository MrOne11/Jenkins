node{
  stage('SCM Checkout'){
    git 'https://github.com/MrOne11/Jenkins'
    
  }
  stage('Test'){
     def mvnHome =tool name: 'mvn', type: 'maven'
    sh "${mvnHome}/bin/mvn test"
  }
  stage('Compile&Package'){
     def mvnHome =tool name: 'mvn', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
  stage('Email notification'){
    mail bcc: '', body: '''Hi Welcome to jenkins email alerts
Thanks
Marouane''', cc: '', from: '', replyTo: '', subject: 'Jenkins job', to: 'marouane.abdell@gmail.com'
  }
  
  stage('Slack Notification'){
    slackSend baseUrl: 'https://hooks.slack.com/services/', 
      channel: 'jenkins-demo-pipeline', color: 'good',
      message: 'Welcome to Jenkins Pipeline',
      teamDomain: 'Abdellah', 
      tokenCredentialId: 'slack-demo'

  }
  
}
