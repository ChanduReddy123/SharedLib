#!/usr/bin/env groovy


//import src.org.TestingClass
def info(String call,String params){
    //println call
    println "creating the object for testingclass"
    def testing = new chandu()
    println testing
    testing.TestChandu()
    
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

class chandu{
    def chandu(){

    }
    public def TestChandu()
    {
        println "this is in chandu class and Test chandu method"
    }
}