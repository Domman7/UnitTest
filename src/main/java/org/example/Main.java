package org.example;

import javax.management.InstanceNotFoundException;


public class Main {


    public static void main(String[] args) throws InstanceNotFoundException {
        try {
            SimpleUnitFactory factory = new SimpleUnitFactory();
            UnitController barracks = new UnitController(factory);
            //UnitController barracks = new UnitController(null);
            //for InstanceNotFoundException
            barracks.orderUnit(UnitType.WARRIOR);
            barracks.orderUnit(UnitType.ARCHER);
            //barracks.orderUnit(UnitType.MAGE);
            //for IllegalArgumentException
        }
        catch (InstanceNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}


class Unit {
    void setPosition() {}
    void setTrack() {}
}

class Warrior extends Unit {
    @Override
    public String toString(){
        return "Warrior";
    }
}
class Archer extends Unit {
    @Override
    public String toString(){
        return "Archer";
    }
}

enum UnitType {
    WARRIOR,
    ARCHER,
    MAGE
}
