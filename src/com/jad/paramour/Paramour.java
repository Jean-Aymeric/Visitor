package com.jad.paramour;

import com.jad.Visited;
import com.jad.Visitor;

public class Paramour implements Visited {
    public void talk() {
        System.out.println("Quand est-ce que tu quittes ta femme ?");
    }


    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
