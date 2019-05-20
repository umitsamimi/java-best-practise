package com.tr.umitsamimi.advice.accessobject;

public class Student {
    private final Integer studentNo; //NO Setter
    private final String studentName; //NO Setter

    public Student(Integer studentNo, String studentName){
        this.studentName = studentName;
        this.studentNo = studentNo;
    }

    public Integer getStudentNo() {
        return studentNo;
    }


    public String getStudentName() {
        return studentName;
    }
}

