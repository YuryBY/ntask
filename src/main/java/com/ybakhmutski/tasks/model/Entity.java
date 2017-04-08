package com.ybakhmutski.tasks.model;

/**
 * Created by Yury_Bakhmutski on 4/8/2017.
 */
public abstract class Entity {

    int id;

    String title;

    public Entity(String title) {
        id++;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}


