package oop_praktikum.id.ac.polinema;

public class student {
    private String name;
    private String studentid;
    private double gpa;

    student(String name, String studentid, double gpa){
        this.name = name;
        this.studentid = studentid;
        this.gpa = gpa;
    }

    public String describe(){
        return name + " ( " + studentid + " , GPA : " + gpa + " )";
    }
}
