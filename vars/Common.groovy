#!/usr/bin/env groovy
class chandu{
    def chandu(){
        println 'this is in chandu class'
    }
}


def info(String call,String params){
    println call
    if(call == 'warning'){
        println call
        warning(params)
    }
    if(call == 'testing'){
        testing(params)
    }
    
}
def warning(message) {
    //echo "WARNING: ${message}"
    println "this is in warning method"
    println(message)
}

def testing(testing)
{
    println "this is in testing method "
    println 'testing'
}