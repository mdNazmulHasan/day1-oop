package com.nazmul;
//Learn how to create Class and its Object
public class Student {
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
