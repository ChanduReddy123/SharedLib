#!/usr/bin/env groovy


import org.TestingClass



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
    Testingclass Help = new TestingClass()
    
    println "this is in testing method "
    println 'testing'
}

class chandu{
    def chandu(){

    }
    public TestChandu()
    {
        println "this is in chandu class and Test chandu method"
    }
}
