package org.example;

public class Main {
    public static void main(String[] args) {
    User<String, Integer> user1 = new User<>("Ivan", 24);
    User<Integer, Integer> user2 = new User<>(13,44);
    User<Double, Float>user3 = new User<>(0.3, 23.4f);

    user1.showInfo();
    user2.showInfo();
    user3.showInfo();
    }
}