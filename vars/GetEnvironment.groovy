def call(branch){
  if(branch == 'master'){
    def list = getIP(branch)
    return list
  }
}