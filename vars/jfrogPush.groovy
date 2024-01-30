def call() {
   withCredentials([string(credentialsId: 'github', variable: 'fis')]) {
                       sh 'docker login -u adarshgowda676@gmail.com adarsha.jfrog.io -p ${fis}'
                       sh "docker push ${Image_Tag}"
}
