#!/usr/bin/env groovy

def info(String call,String params){
    println call
    if(call == 'warning'){
        println call
        warning(params)
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