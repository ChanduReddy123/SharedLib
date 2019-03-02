#!/usr/bin/env groovy

def info(String message){
    if(message == 'warning'){
        warning('called')
    }
    
}
def warning(message) {
    //echo "WARNING: ${message}"
    println(message)
}