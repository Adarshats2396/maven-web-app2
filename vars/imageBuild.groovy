def call() {
   sh "docker build -t ${Image_Tag} ."
}
