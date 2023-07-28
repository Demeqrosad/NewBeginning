package com.example.exception.main;

import com.example.exception.io.FileReader;
import com.example.exception.io.FileReaderException;

public class ExceptionModuleRunner {
    public static void main(String args[]){

        FileReader fileReader = new FileReader();
        try{
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
