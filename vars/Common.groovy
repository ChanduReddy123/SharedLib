#!/usr/bin/env groovy
def info(message){
    String data = message
    echo "INFO: ${message}"
    warning(data)
}
def warning(message) {
    echo "WARNING: ${message}"
}