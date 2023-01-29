package org.gb.s05;

import org.gb.s05.Model.model_Summation;
import org.gb.s05.Presenter.Presenter;
import org.gb.s05.View.View;

public class Main {
    public static void main(String[] args) {
        Presenter p = new Presenter(new model_Summation(), new View());
        p.run();
    }
}