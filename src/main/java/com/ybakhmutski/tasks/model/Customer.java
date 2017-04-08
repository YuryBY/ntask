package com.ybakhmutski.tasks.model;

/**
 * Created by Yury_Bakhmutski on 4/8/2017.
 */
public class Customer extends Entity {

    private RentUnit rentUnit;

    public Customer(String name) {
        super(name);
    }

    public Customer(String name, RentUnit rentUnit) {
        super(name);
        this.rentUnit = rentUnit;
    }

    public RentUnit getRentUnit() {
        return rentUnit;
    }

    public String getName() {
        return super.getTitle();
    }
}
