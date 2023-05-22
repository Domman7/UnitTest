package org.example;

import javax.management.InstanceNotFoundException;

public class UnitController {
    private final SimpleUnitFactory unitFactory;
    public UnitController(SimpleUnitFactory unitFactory) throws InstanceNotFoundException {
        if(unitFactory == null)
            throw new InstanceNotFoundException("This factory is not available");
        this.unitFactory = unitFactory;
    }

    public UnitController(){
        unitFactory = null;
    }

    public Unit orderUnit(UnitType type) {
        Unit unit = unitFactory.createUnit(type);
        unit.setPosition();
        unit.setTrack();
        System.out.println("Юнит нанят!");
        return unit;
    }
}
