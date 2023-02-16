package com.jad;

import com.jad.company.Company;
import com.jad.friend.Friend;
import com.jad.paramour.Paramour;

public class Jad implements Visitor{
    void visitFriend(Friend friend) {
        friend.drinkBeers();
        friend.playConsole();
    }

    void visitCompany(Company company) {
        company.goCoffeeMachine();
        company.work();
        company.goCoffeeMachine();
    }

    void visitParamour(Paramour paramour) {
        paramour.talk();
        System.out.println("Je t'ai appporté des fleurs.");
    }

    @Override
    public void visit(final Company visited) {
        visitCompany(visited);
    }

    @Override
    public void visit(final Friend visited) {
        visitFriend(visited);
    }

    @Override
    public void visit(final Paramour visited) {
        visitParamour(visited);
    }
}
