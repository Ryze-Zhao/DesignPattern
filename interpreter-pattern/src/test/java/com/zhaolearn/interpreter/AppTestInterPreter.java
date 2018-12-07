package com.zhaolearn.interpreter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTestInterPreter {
    //规则：或
    public static Expression getOrExpression(){
        Expression robert = new TerminalExpression("A");
        Expression john = new TerminalExpression("B");
        return new OrExpression(robert, john);
    }
    //规则：且
    public static Expression getAndExpression(){
        Expression julie = new TerminalExpression("C");
        Expression married = new TerminalExpression("D");
        return new AndExpression(julie, married);
    }
    @Test
    public void appTestInterPreter() {
        Expression or = getOrExpression();
        Expression and = getAndExpression();
        System.out.println("OR---AB" + or.interpret("A"));
        System.out.println("AND---CD" + and.interpret("C D"));
    }
}
