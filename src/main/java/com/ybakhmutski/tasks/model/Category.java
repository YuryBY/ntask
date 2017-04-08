package com.ybakhmutski.tasks.model;

import java.util.List;

/**
 * Created by Yury_Bakhmutski on 4/8/2017.
 */
public class Category extends Entity {

    private List<SportEquipment> items;

    public Category(String title) {
        super(title);
    }

    public Category(String title, List<SportEquipment> items) {
        super(title);
        this.items = items;
    }

    public List<SportEquipment> getItems() {
        return items;
    }
}
