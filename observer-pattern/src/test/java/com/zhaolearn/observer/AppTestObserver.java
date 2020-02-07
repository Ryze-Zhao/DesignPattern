package com.zhaolearn.observer;

import static org.junit.Assert.assertTrue;

import com.zhaolearn.observer.old.BinaryObserver;
import com.zhaolearn.observer.old.HexaObserver;
import com.zhaolearn.observer.old.OctalObserver;
import com.zhaolearn.observer.old.Subject;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTestObserver{
    @Test
    public void appTestObserver() {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
