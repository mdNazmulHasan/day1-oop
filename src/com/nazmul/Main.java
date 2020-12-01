package com.nazmul;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student firstStudent = new Student();
        firstStudent.firstName = "Android";
        firstStudent.lastName = "Studio";
        System.out.println(firstStudent.firstName + firstStudent.lastName);
        StudentWithConstructor studentWithConstructor = new StudentWithConstructor("Java", "Basic");
        System.out.println(studentWithConstructor.lastName);
    }
}
