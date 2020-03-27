package com.azish.designpattern.behavioral.visitor;

import com.azish.designpattern.behavioral.visitor.visitor.ShoppingCartVisitor;

public interface ItemElement
{
    public int accept(ShoppingCartVisitor visitor);
}
