package com.jad;

import com.jad.company.Company;
import com.jad.friend.Friend;
import com.jad.paramour.Paramour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Jad jad = new Jad();
        ArrayList<Visited> bidules = new ArrayList<>();

        for (int i = 0; i < 10; i ++) {
            bidules.add(new Company());
            bidules.add(new Friend());
            bidules.add(new Paramour());
        }

        for(Visited visited : bidules) {
            visited.accept(jad);
        }
    }
}
