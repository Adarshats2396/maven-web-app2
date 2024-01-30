def call() {
     withCredentials([usernameColonPassword(credentialsId: 'guthub', variable: 'fis')]) {
           sh 'docker login -u adarshgowda676@gmail.com slkgroup.jfrog.io -p ${fis}'
           sh "docker push ${Image_Tag}"
}
