package spring_introduction;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.*;

public class Basics {
    public static void main(String[] args) {

        Student student1 = new Student(18, "Kirill", 8);
        Student student2 = new Student(22, "Vlad", 7);
        Student student3 = new Student(30, "Eugene", 5);

        Student student4 = new Student(18, "Kirill", 8);

        Map<Student, Integer> map = new HashMap<>();

        map.put(student1, 1);
        map.put(student2, 2);
        map.put(student3, 3);

        for(Map.Entry<Student,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey());
        }







    }
}

class Student {
    private int age;
    private String name;
    private int grade;

    public Student(int age, String name, int grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && grade == student.grade && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, grade);
    }
}