package com.technologies.exceptions;

public class CustomExceptions {
    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(3);
    }

    private static int validateAge(int age) throws AgeLessThanZeroException {
        if (age < 0){
            throw new AgeLessThanZeroException();
        }
    }
}
