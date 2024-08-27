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

    public String getInformation(){
        return ("Grade : " + grade +" | "+"Classroom : " + classroom+" | "+"Name : " + name+" | "+"Kor : " + kor+" | "+"Eng : " + eng+" | "+"Math : " + math+" | "+"Average : "+(kor+eng+math)/3);
    }
}
