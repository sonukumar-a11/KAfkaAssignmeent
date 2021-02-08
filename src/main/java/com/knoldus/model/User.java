package com.knoldus.model;

public class User {
   // {"id":"1","name":"some_name","age":"24","course":"BTech."}

    private String id;
    private String name;
    private int age;
    private String course;

    public User()
    {}

    public User(String id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String toString() {
        return "User{" +
                "Id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
