def call(branch){
  if(branch == 'master'){
    def list = getIP(branch)
    return list
  }
}

def getIP(branch){
  if(branch == 'master'){
    return '1.2.3.4';
  }
  if(branch == 'stg'){
    return '4.5.6.7';
  }
}
