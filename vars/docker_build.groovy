def call(string ProjectName, string ImageTag, string DockerHubUser){
  sh "docker build -t ${dockerhubuser}/${ProjectName}:${ImageTag} ."
} 
