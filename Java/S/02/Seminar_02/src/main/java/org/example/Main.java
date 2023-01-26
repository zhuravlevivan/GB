package org.example;

public class Main {
    public static void main(String[] args) {

        Father father = new Father("FatherName SecondFatherName",
                "15.01.1987",
                "MSK",
                "Russia");

        Father father2 = new Father();
        Father father3 = new Father("Ivan", "01.01.1980", "SPB", "Russia");

        Child child = new Child("ChildName ChildSecondName",
                "12.02.2011",
                "MSK",
                "Russia");

        Child child2 = new Child();
        Child child3 = new Child();


//        father.getInfo();
//        father2.getInfo();
//        father3.getInfo();
//        child.getInfo();
//        child2.getInfo();
//        child3.getInfo();

    }
}