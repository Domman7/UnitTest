package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("start MainTest class");
        Result results = JUnitCore.runClasses(SimpleUnitFactoryTest.class);
        for (Failure failure : results.getFailures()) {
            System.out.println("Тест не пройден: " + failure);
        }

        System.out.println("");
        System.out.println("Second example in MainTest");
        JUnitCore core = new JUnitCore();
        core.addListener(new SimpleUnitFactoryTestListener());
        core.run(SimpleUnitFactoryTest.class);

        results = JUnitCore.runClasses(UnitController.class);
        for (Failure failure : results.getFailures()) {
            System.out.println("Тест не пройден: " + failure);
        }

        System.out.println("");
        System.out.println("Second example in MainTest");
        core = new JUnitCore();
        core.addListener(new UnitControllerTestListener());
        core.run(UnitController.class);

//        System.out.println("");
//        System.out.println("Third example in MainTest");
//
//        Result resultThird = JUnitCore.runClasses(SuiteTestClass.class);
//        for (Failure failure : resultThird.getFailures()) {
//            System.out.println("Тест не пройден: " + failure);
//        }
    }
}
