package org.webdevelopment.javaintro;

/**
 * Created by makn on 09-02-2017.
 */

public class Bird extends Animal implements Flying {

    @Override
    public void fly() {
        //do stuff
    }

    @Override
    public void land() {
        //do stuff
    }

    public String getType() { return "bird";}
    private boolean migrates;

    public Bird(String name)
    {
        super(name);
    }

    public boolean getMigrates()
    {
        return migrates;
    }

    public void setMigrates(boolean migrates)
    {
        this.migrates = migrates;
    }



}
