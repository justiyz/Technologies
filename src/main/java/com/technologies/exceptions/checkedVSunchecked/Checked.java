package com.technologies.exceptions.checkedVSunchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {
    public static void main(String[] args) {

        readfile("myFile.txt");
    }

    //A CHECKED EXCEPTION ARE EXCEPTIONS THAT JAVA MAKES YOU DEAL WITH AT COMPILE TIME.

    private static void readfile(String fileName){
        //TO HANDLE AN UNCHECKED EXCEPTION, YOU EITHER USE A TRY-CATCH BLOCK OR YOU SURROUND THE METHOD WITH A "THROWS" STATEMENT
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
