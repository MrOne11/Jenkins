node{
  stage('SCM Checkout'){
    git 'https://github.com/MrOne11/Jenkins'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
