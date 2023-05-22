package org.example;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class SimpleUnitFactoryTest {
    private SimpleUnitFactory factory;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("");
        System.out.println("Before SimpleUnitFactoryTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("");
        System.out.println("After SimpleUnitFactoryTest");
    }

    @Before
    public void initTest() {
        System.out.println("");
        System.out.println("initTest()");
        factory = new SimpleUnitFactory();
    }

    @After
    public void afterTest() {
        System.out.println("afterTest()");
        factory = null;
    }

    @Test
    public void testCreateArcher() throws Exception {
        System.out.println("testCreateArcher()");
        Unit unit = new Archer();
        Unit res = factory.createUnit(UnitType.ARCHER);
        assertEquals(unit.toString(), res.toString());
    }

    @Test
    public void testCreateWarrior() throws Exception {
        System.out.println("testCreateWarrior()");
        Unit unit = new Warrior();
        Unit res = factory.createUnit(UnitType.WARRIOR);
        assertEquals(unit.toString(), res.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createUnitWithException() {
        System.out.println("createUnitWithException()");
        factory.createUnit(UnitType.MAGE);
    }
}
