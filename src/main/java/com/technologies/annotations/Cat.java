package com.technologies.annotations;

@CustomAnnotationForClassesAndMethods //custom annotation
public class Cat {

    @CustomAnnotationForFields
    String name;
    int age;

    public Cat(String name) {
        this.name = name;
    }

    @CustomAnnotationForMethods
    public void talk() {
        System.out.println("meow !");
    }

    public void eat() {
        System.out.println("Munch !");
    }
}
