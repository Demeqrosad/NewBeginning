package com.example.patterns.prototype;

public class Prototype<T> implements Cloneable {
    @Override
    public T clone() throws CloneNotSupportedException {
        return (T)super.clone();
    }
}

