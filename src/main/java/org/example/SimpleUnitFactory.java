package org.example;

public class SimpleUnitFactory {
    public Unit createUnit (UnitType type) {
        Unit unit = null;


        switch (type) {
            case WARRIOR:
                unit= new Warrior();
                break;
            case ARCHER:
                unit = new Archer();
                break;
            default:
                throw new IllegalArgumentException("Invalid type");
        }
        return unit;
    }
}
