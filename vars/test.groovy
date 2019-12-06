def call(branch){
  def list= []
  if(branch == 'master'){
    list[0] = 'prod'
    list[1] = getIP(branch)
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
