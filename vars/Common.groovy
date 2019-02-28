#!/usr/bin/env groovy

String test="chandu"
def info(String message){
    println test
    test="reddy"
    println "this is after changing the value "+test
    String data = message
    data = "you have entered "+data
    println data;
    
}
def warning(message) {
    echo "WARNING: ${message}"
}