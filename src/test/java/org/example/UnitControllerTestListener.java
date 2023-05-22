package org.example;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class UnitControllerTestListener extends RunListener{
    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("UnitControllerTestListener - test started: " + description);
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("UnitControllerTestListener - test failure " + failure);
    }
}
