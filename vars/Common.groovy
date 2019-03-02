#!/usr/bin/env groovy


import org.TestingClass
def info(String call,String params){
    //println call
    println "creating the object for testingclass"
    def testing = new TestingClass()
    println testing
    testing.Method1()
    
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