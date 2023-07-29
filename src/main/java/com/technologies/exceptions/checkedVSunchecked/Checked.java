package com.technologies.exceptions.checkedVSunchecked;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Checked {
    public static void main(String[] args) {

        readfile("myFile.txt");
    }

    //A CHECKED EXCEPTION ARE EXCEPTIONS THAT JAVA MAKES YOU DEAL WITH AT COMPILE TIME.

    private static void readfile(String fileName){
        //TO HANDLE A CHECKED EXCEPTION, YOU EITHER USE A TRY-CATCH BLOCK OR YOU DECLARE THAT YOU THROW IT WITH A "THROWS" STATEMENT IN YOUR METHOD SIGNATURE.
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
