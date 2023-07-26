package com.example.stream;

import com.example.stream.iterate.NumbersGenerator;
import com.example.stream.lambda.*;
import com.example.stream.person.People;

public class StreamMain {
    public static void main(String[] args) {
        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);
    }
}



