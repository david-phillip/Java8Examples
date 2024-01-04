package learn.java.data;

import java.util.List;

public class Student {

    private String name;
    private int age;
    private List<String> activities;

    private float grade;

    public Student(String name, int age, List<String> activities, float grade) {
        this.name = name;
        this.age = age;
        this.activities = activities;
        this.grade = grade;
    }

    public Student() {

    }

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", activities=" + activities +
                '}';
    }
}
