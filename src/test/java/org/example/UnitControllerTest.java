package org.example;

import org.junit.*;

import javax.management.InstanceNotFoundException;

import static org.junit.Assert.assertEquals;

public class UnitControllerTest {
    private UnitController controller;
    private SimpleUnitFactory factory;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("");
        System.out.println("Before UnitControllerTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("");
        System.out.println("After UnitControllerTest.class");
    }

    @Before
    public void initTest() throws InstanceNotFoundException {
        System.out.println("");
        System.out.println("initTest()");
        factory = new SimpleUnitFactory();
        controller = new UnitController(factory);
    }

    @After
    public void afterTest() {
        System.out.println("afterTest()");
        factory = null;
        controller = null;
    }

    @Test
    public void testOrderArcher() throws Exception {
        System.out.println("testOrderArcher()");
        Unit unit = new Archer();
        Unit res = controller.orderUnit(UnitType.ARCHER);
        assertEquals(unit.toString(), res.toString());
    }

    @Test
    public void testOrderWarrior() throws Exception {
        System.out.println("testOrderArcher()");
        Unit unit = new Warrior();
        Unit res = controller.orderUnit(UnitType.WARRIOR);
        assertEquals(unit.toString(), res.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createUnitWithException() {
        System.out.println("createUnitWithException()");
        controller.orderUnit(UnitType.MAGE);
    }
}
