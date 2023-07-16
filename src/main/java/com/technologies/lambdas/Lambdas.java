package com.technologies.lambdas;

//Lambdas in Java can be used along with certain types of interfaces
public class Lambdas {

    public static void main(String[] args) {

        Printable lambdaPrintable = (suffix) -> System.out.println("meow");
        printThing(lambdaPrintable);

    }

    static void printThing(Printable printable) {
        printable.print("!");
    }
}
