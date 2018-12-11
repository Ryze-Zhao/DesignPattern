package com.zhaolearn.visitor;

public class ComputerPartDisplay2Visitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) { System.out.println("NoComputer"); }
    @Override
    public void visit(Mouse mouse) { System.out.println("NoMouse"); }
    @Override
    public void visit(Keyboard keyboard) { System.out.println("NoKeyboard"); }
    @Override
    public void visit(Monitor monitor) { System.out.println("NoMonitor"); }
}
