package com.jad.company;

import com.jad.Visited;
import com.jad.Visitor;

public class Company implements Visited {
    public void work() {
        System.out.println("Bonjour les collègues ! aujourd'hui je vais bosser super hard.");
    }

    public void goCoffeeMachine() {
        System.out.println("Non merci pas de sucre pour moi.");
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
