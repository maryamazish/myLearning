package com.azish.designpattern.behavioral.visitor.visitor;

import com.azish.designpattern.behavioral.visitor.Book;
import com.azish.designpattern.behavioral.visitor.Fruit;

public interface ShoppingCartVisitor
{

    int visit(Book book);
    int visit(Fruit fruit);
}
