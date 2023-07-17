package com.technologies.annotations;

@VeryImportant //custom annotation
public class Cat {
    String name;
    int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void talk (){
        System.out.println("meow !");
    }
    public void eat(){
        System.out.println("Munch !");
    }
}
