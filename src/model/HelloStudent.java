package model;

public class HelloStudent {
    public static void main(String[] args) {
        Student student = new Student("alvar","23","男", "007");
        System.out.println("姓名："+student.name+", 年龄："+student.age+"， 性别："+student.sex+"， 学号："+student.id);
    }
}
