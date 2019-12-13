def call(){
  return getEnvironment()
}

def  getEnvironment(){
  def branch = "${BRANCH_NAME}"
    def envdetails = [:]
    if(branch == "master"){
        envdetails['dbname'] = "masterdb"
        envdetails['endpoint'] = "masterendpoint"
        envdetails['password'] = "masterpassword"
        envdetails['username'] = "masterdbusername"
        envdetails['port'] = "masterdbport"
        envdetails['bcpoint'] = "masterbcpoint"
        envdetails['pem'] = "pemfile"
        envdetails['IP'] = "ProdIp"
        
        return envdetails
    }
    else if(branch == "dev"){
        envdetails['dbname'] = "devdb"
        envdetails['endpoint'] = "devendpoint"
        envdetails['password'] = "devpassword"
        envdetails['username'] = "devdbusername"
        envdetails['port'] = "devdbport"
        envdetails['bcpoint'] = "devbcpoint"
        envdetails['pem'] = "pemfile"
        envdetails['IP'] = "DevIp"
        return envdetails
    }
    else if(branch == "stage"){
        envdetails['dbname'] = "stagedb"
        envdetails['endpoint'] = "stageendpoint"
        envdetails['password'] = "stagepassword"
        envdetails['username'] = "stagedbusername"
        envdetails['port'] = "stagedbport"
        envdetails['bcpoint'] = "stagebcpoint"
        envdetails['pem'] = "pemfile"
        envdetails['IP'] = "stageIp"
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
