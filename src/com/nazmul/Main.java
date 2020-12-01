package com.nazmul;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student firstStudent = new Student();
        firstStudent.firstName = "Android";
        firstStudent.lastName = "Studio";
        System.out.println(firstStudent.firstName + firstStudent.lastName);
        StudentWithConstructor studentWithConstructor = new StudentWithConstructor("Java", "Basic");
        System.out.println(studentWithConstructor.lastName);
        int[] numbers = new int[10];
        numbers[1] = 23;
        System.out.println(numbers[1]);
        ArrayList<Student> students = new ArrayList<>();
        students.add(firstStudent);
        System.out.println(students);
    }
}
