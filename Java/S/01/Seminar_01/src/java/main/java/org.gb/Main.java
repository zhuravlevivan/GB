package org.gb;

public class Main {
    public static void main(String[] args) {
        Father father = new Father("FatherName SecondFatherName",
                "15.01.1987",
                "MSK",
                "Russia",
                "ChildName");

        Child child = new Child("ChildName ChildSecondName",
                "12.02.2011",
                "MSK",
                "Russia");

        father.fatherInfo();
        child.childInfo();

    }
}