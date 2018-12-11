package com.zhaolearn.visitor;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestVisitor {

    @Test
    public void appTestVisitor() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
        System.out.println("---------------------");
        ComputerPart computer2 = new Computer();
        computer2.accept(new ComputerPartDisplay2Visitor());
    }
}
