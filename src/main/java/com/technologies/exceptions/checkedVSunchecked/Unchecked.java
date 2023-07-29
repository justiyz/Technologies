package com.technologies.exceptions.checkedVSunchecked;


class Unchecked {

    public static void main(String[] args) {

        String name = null;
        printLength(name);
    }

    private static void printLength(String s) {
        try {
            System.out.println(s.length());
        } catch (NullPointerException npe) {
            System.out.println("String cannot be null");
        }

    }
}
