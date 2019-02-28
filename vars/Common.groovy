#!/usr/bin/env groovy
def call(message){
    String data = this.message
    echo "INFO: ${message}"
    warning(data)
}
def warning(message) {
    echo "WARNING: ${message}"
}