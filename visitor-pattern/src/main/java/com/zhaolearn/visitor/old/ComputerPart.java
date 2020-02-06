package com.zhaolearn.visitor.old;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
