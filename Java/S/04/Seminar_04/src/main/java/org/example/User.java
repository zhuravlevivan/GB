package org.example;

public class User <T, V> {
    private T name;
    private V age;


    User(T name, V age){
        this.name = name;
        this.age = age;
    }

    void showInfo(){
        System.out.println("User created!" + " Name: " + this.name + ". Age: " + this.age);

    }

}
