package com.technologies.annotations;

@VeryImportant //custom annotation
public class Cat {
    String name;
    int age;

    public Cat(String name){
        this.name = name;
    }

    @RunImmediately
    public void talk (){
        System.out.println("meow !");
    }
    public void eat(){
        System.out.println("Munch !");
    }
}
