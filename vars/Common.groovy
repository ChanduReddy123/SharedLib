#!/usr/bin/env groovy

def info(String message){
    println "this is after changing the value "+message
    String data = "you have entered "+message
    println data;
    
}
def warning(message) {
    //echo "WARNING: ${message}"
    println(message)
}