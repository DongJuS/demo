package com.example.demo;

public class UserVO {
    private int id;
    private String age;
    private String name;

    public UserVO(int id, String age, String name) {
        id = this.id;
        age = this.age;
        name = this.name;
    }

    public int id() {
        return id;
    }
    public int getId(int id){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}