#!/usr/bin/env groovy

def info(String call,String params){
    if(call == 'warning'){
        warning(params)
    }
    
}
def warning(message) {
    //echo "WARNING: ${message}"
    println(message)
}