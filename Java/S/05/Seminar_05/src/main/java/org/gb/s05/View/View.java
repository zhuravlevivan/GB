package org.gb.s05.View;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public double getValue(String msg) {
        System.out.print("Enter value " + msg + " > ");
        return scanner.nextDouble();
    }

    public short getChoice() {
        System.out.println("Choice operation:");
        System.out.println("\t1. Summation");
        System.out.println("\t2. Subtraction");
        System.out.println("\t3. Multiply");
        System.out.println("\t4. Division");
        return scanner.nextShort();
    }
}
