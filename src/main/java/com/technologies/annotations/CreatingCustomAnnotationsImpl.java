package com.technologies.annotations;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Slf4j
public class CreatingCustomAnnotationsImpl {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("Billy");

        //THIS CHECKS FOR THE PRESENCE OF AN THE @CustomAnnotationForClassesAndMethods IN A CLASS
        if (cat.getClass().isAnnotationPresent(CustomAnnotationForClassesAndMethods.class)) {
            System.out.println("Very important is present");
        } else {
            System.out.println("Very important is not present");
        }

        //THIS LOOPS OVER THE METHODS OF THE CAT CLASS AND INVOKES/PRINTS OUT THE METHOD IMPLEMENTATION WITH THE @CustomAnnotationForMethods
        for (Method method : cat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomAnnotationForMethods.class)) {
                method.invoke(cat);
            }
        }

        //THIS LOOPS OVER THE FIELDS OF THE CAT CLASS AND PRINTS OUT THE VALUE OF THE FIELD WITH THE @CustomAnnotationForFields
        for (Field field : cat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(CustomAnnotationForFields.class)) {
                Object objectValue = field.get(cat);
                if (objectValue instanceof String stringValue) {
                    System.out.println(stringValue.toUpperCase());
                }
//                System.out.println(objectValue.toString().toUpperCase(Locale.ROOT));
            }
        }


    }
}
