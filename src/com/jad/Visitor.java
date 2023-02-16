package com.jad;

import com.jad.company.Company;
import com.jad.friend.Friend;
import com.jad.paramour.Paramour;

public interface Visitor {
    void visit(Company visited);
    void visit(Friend visited);
    void visit(Paramour visited);
}
