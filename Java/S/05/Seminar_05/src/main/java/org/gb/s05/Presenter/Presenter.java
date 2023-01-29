package org.gb.s05.Presenter;

import org.gb.s05.Model.*;
import org.gb.s05.View.View;

public class Presenter {
    View view;
    model_Calc modelCalc;

    double x;
    double y;

    public Presenter(model_Calc m, View v) {
        this.modelCalc = m;
        this.view = v;
    }

    public void buttonClick() {
        x = (view.getValue("X"));
        y = (view.getValue("Y"));
    }

    public void run() {
        int choice = view.getChoice();
        this.buttonClick();
        switch (choice) {
            case 1 -> System.out.println("Result of Summation = " + new model_Summation().result(x, y));
            case 2 -> System.out.println("Result of Subtraction = " + new model_Subtraction().result(x, y));
            case 3 -> System.out.println("Result of Multiply = " + new model_Multiply().result(x, y));
            case 4 -> System.out.println("Result of Division = " + new model_Division().result(x, y));
        }
    }

}
