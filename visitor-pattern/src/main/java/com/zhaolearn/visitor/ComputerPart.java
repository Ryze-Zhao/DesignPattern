package com.zhaolearn.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
