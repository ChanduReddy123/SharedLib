#!/usr/bin/env groovy
def info(String message){
    String data = message
    data = "you have entered "+data
    println data;
}
def warning(message) {
    echo "WARNING: ${message}"
}