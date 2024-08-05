package com.ohgiraffers.chap06.section02;

public class StudentDTO {
    int grade;
    int classroom;
    String name;
    int kor;
    int eng;
    int math;

    public StudentDTO() {}

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void getInformation(){
        System.out.print("Grade : " + grade +" | ");
        System.out.print("Classroom : " + classroom+" | ");
        System.out.print("Name : " + name+" | ");
        System.out.print("Kor : " + kor+" | ");
        System.out.print("Eng : " + eng+" | ");
        System.out.print("Math : " + math+" |");
        System.out.println("Average : "+(kor+eng+math)/3);
    }
}
