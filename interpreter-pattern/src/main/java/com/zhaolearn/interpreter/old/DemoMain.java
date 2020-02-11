package com.zhaolearn.interpreter.old;
/**
 *
 *  事例中，因为解释器经常用于 SQL 解析、符号处理引擎等，所以这里模拟类似SQL的And和Or操作。
 * @author: HeHaoZhao
 * @date: 2020/2/11 16:12
 */
public class DemoMain {
    public static void main(String[] args) {
        Expression or = getOrExpression();
        Expression and = getAndExpression();
        System.out.println("OR---AB" + or.interpret("A"));
        System.out.println("AND---CD" + and.interpret("C D"));
    }
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
}
