def call() {
   withCredentials([string(credentialsId: 'fis_new', variable: 'fis')]) {
                       sh 'docker login -u adarshgowda676@gmail.com slkgroup.jfrog.io -p ${fis}'
                       sh "docker push ${Image_Tag}"
}
