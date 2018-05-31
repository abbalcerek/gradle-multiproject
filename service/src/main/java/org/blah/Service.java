package org.blah;

public class Service {

    public String hello() {
        return "hello world from service and from + " + Utils.hello();
    }

}