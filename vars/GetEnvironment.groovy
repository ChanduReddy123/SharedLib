def call(){
  return getEnvironment()
}

def  getEnvironment(){
  def branch = "master"
    def envdetails = [:]
    if(branch == "master"){
        envdetails['dbname'] = "ProdDBName"
        envdetails['endpoint'] = "ProdDBEndPoint"
        envdetails['password'] = "ProdDBPassword"
        envdetails['username'] = "ProdDBUserName"
        envdetails['port'] = "masterdbport"
        envdetails['bcpoint'] = "ProdBCEndPoint"
        envdetails['pem'] = "pemfile"
        envdetails['IP'] = "Beta"
        
        return envdetails
    }
    else if(branch == "dev"){
        envdetails['dbname'] = "DevDBName"
        envdetails['endpoint'] = "DevDBEndPoint"
        envdetails['password'] = "DevDBPassword"
        envdetails['username'] = "DevDBUserName"
        envdetails['port'] = "devdbport"
        envdetails['bcpoint'] = "DevBCEndPoint"
        envdetails['pem'] = "pemfile"
        envdetails['IP'] = "DevIp"
        return envdetails
    }
    else if(branch == "stage"){
        envdetails['dbname'] = "StgDBName"
        envdetails['endpoint'] = "StgDBEndPoint"
        envdetails['password'] = "StgDBPassword"
        envdetails['username'] = "ProdDBUserName"
        envdetails['port'] = "stagedbport"
        envdetails['bcpoint'] = "StgBCEndPoint"
        envdetails['pem'] = "pemfile"
        envdetails['IP'] = "StgIp"
        return envdetails
    }
  else{
    return envdetails
  }
    
}


///def branch = getBranch()
//def env = getEnvironment(branch)
//println(env.endpoint)
//println(env.dbname)
