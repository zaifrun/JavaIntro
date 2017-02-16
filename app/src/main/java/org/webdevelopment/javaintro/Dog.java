package org.webdevelopment.javaintro;

/**
 * Created by makn on 09-02-2017.
 */

public class Dog extends Animal {

    final int NR_OF_LEGS = 4;

    @Override
    public String getType() { return "dog";}

    public Dog(String name)
    {
        super(name);
    }

}
