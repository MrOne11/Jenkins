node{
  stage('SCM Checkout'){
    git 'https://github.com/MrOne11/Jenkins'
    
  }
  stage('Test'){
     def mvnHome =tool name: 'mvn', type: 'maven'
    sh "${mvnHome}/bin/mvn test"
  }
}
