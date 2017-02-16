package org.webdevelopment.javaintro;

/**
 * Created by makn on 08-02-2017.
 */

public class Animal {


    private String name; //an object of type string
    private int age; //simple type, not object.

    public Animal(){}; //good idea to have an empty constructor

    public Animal(String name)
    {
        this.name = name;
    }

    public String getType() { return "animal";}
    public String getName() { return name;}

    @Override
    public String toString() {
        return name+" is of type "+getType();
    }

    public void updateAnimal(String name) {
        this.name = name;
    }
    public void updateAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() { return age;}


}
