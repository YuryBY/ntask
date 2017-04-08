package com.ybakhmutski.tasks.model;

/**
 * Created by Yury_Bakhmutski on 4/8/2017.
 */
public class RentUnit {
    private SportEquipment[] units;
    private final static int INITIAL_CAPACITY = 10;

    public RentUnit() {
        units = new SportEquipment[INITIAL_CAPACITY];
    }

    public RentUnit(SportEquipment[] rentUnits) {
        this.units = rentUnits;
    }

    public void addUnit(SportEquipment unit) {
        for (int i = 0; i < units.length; i++) {
            if (units[i] == null) {
                units[i] = unit;
                return;
            }
            if (i == units.length) {
                SportEquipment[] increasedUnits = new SportEquipment[i + INITIAL_CAPACITY/2];
                System.arraycopy(units, 0, increasedUnits, 0, units.length);
                units = increasedUnits;
                units[i] = unit;
            }
        }
    }

    public void removeUnit(SportEquipment unit) {
        //TODO implement
    }

    public SportEquipment[] getUnits() {
        return units;
    }

}
