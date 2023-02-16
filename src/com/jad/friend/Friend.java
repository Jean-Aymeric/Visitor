package com.jad.friend;

import com.jad.Visited;
import com.jad.Visitor;

public class Friend implements Visited {
    public void drinkBeers() {
        System.out.println("Youpi !!! De la mousse !");
    }

    public void playConsole() {
        System.out.println("Je vais te poutrer !");
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
