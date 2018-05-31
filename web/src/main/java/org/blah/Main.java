package org.blah;

public class Main {

    private static Service service = new Service();

    public static void main(String[] args) {

        System.out.println("hello world from web");
        System.out.println(service.hello());
        System.out.println(Utils.hello());

    }

}