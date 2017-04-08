package com.ybakhmutski.tasks.model;

import java.math.BigDecimal;

/**
 * Created by Yury_Bakhmutski on 4/8/2017.
 */
public class SportEquipment extends Entity {

    BigDecimal price;

    public SportEquipment(String title) {
        super(title);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
