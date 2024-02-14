package main;

import domain.Student;

public class Main {
    public static void main(String[] args){
        Student studentOne = new Student(23379, "Tony", "NTAHE");
        Student studentTwo = new Student(3440, "nana", "hio");
        studentTwo.setFirstname("hally");
        System.out.println("studentone  name are: " +studentOne.firstName +" "+studentOne.lastName);
        
    }
}
