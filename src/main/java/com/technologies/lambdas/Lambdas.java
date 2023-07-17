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

    //TODO: A FUNCTIONAL INTERFACE IS AN INTERFACE WITH ONLY ONE ABSTRACT METHOD
    //TODO: A LAMBDA CAN ONLY BE USED IN THE CONTEXT OF A FUNCTIONAL INTERFACE, IF AN INTERFACE HAS MORE THAN ONE ABSTRACT METHOD, YOU CAN"T USE A LAMBDA FOR IT.
    //TODO: SUMMARILY, A LAMBDA IS A SHORTCUT TO DEFINING AN IMPLEMENTATION OF A FUNCTIONAL INTERFACE.
}
