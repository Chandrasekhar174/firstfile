package org.example.MyObject;

public class Mail {

    private String name;
    private int age;


    public Mail(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
