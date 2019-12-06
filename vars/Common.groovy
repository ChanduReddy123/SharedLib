#!/usr/bin/env groovy

def warning(message) {
    //echo "WARNING: ${message}"
    println "this is in warning method"
    println(message)
}


def getEnvironment(branch){
    println("given branch is $branch ${branch}");
    if(branch == 'master'){
        return 'Prod'
    }
    else if(branch == 'Develop'){
        return 'Dev'
    }
    else if(branch == 'Staging'){
        return 'Stg'
    }
}

def getDeploymentIP(branch){
    if(branch == 'master'){
        return '1.2.3.4'
    }
    else if(branch == 'Develop'){
        return '5.6.7.8'
    }
    else if(branch == 'Staging'){
        return '3.4.5.6'
    }
}