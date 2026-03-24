package stu1;

public class Student1 {

    String name;
    int marks;

    public Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getResult() {

        if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        Student1 s1 = new Student1("Mani", 80);
        Student1 s2 = new Student1("Ram", 20);

        System.out.println(s1.name + " Result: " + s1.getResult());
        System.out.println(s2.name + " Result: " + s2.getResult());
    }
}