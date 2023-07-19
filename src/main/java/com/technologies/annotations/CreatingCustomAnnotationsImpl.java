package com.technologies.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingCustomAnnotationsImpl {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("Billy");

        //THIS CHECKS FOR THE PRESENCE OF AN ANNOTATION
        if (cat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("Very important is present");
        } else {
            System.out.println("Very important is not present");
        }



    }
}
