#!/usr/bin/env groovy
package org.foo

class testing{
    String test="testing"
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
}