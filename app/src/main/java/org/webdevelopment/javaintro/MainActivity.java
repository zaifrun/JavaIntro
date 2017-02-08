package org.webdevelopment.javaintro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    public void basicTypes()
    {
        int a = 10;
        float f = 10.0f;
        boolean signedIn = false;
        byte b = 100;
        long l = 1000000;
        double d = 10.0d;
        //each also have an object verson - fx.
        Integer i = new Integer(10);
    }

    public void stringsAndArrays()
    {
        String firstName = "Martin";
        //same as String firstName = new String("Martin");
        String lastName = " Knudsen";
        String fullname = firstName+lastName;
        String[] names = {"Martin","Peter","Thomas"};
        int j = lastName.length();
        String p = names[1];

        int counter = 2;
        if (counter>1)
        { /*do something*/ }
        else
        { /* do something else */}
        for (String name : names) {
            System.out.println(name);
        }
        for (int i = 0; i<names.length; i++)
        { /* same thing */ }
        counter = 3;
        String value;
        switch (counter)
        {
            case 1: value = "1";
                break;
            case 2: value = "2";
                break;
            default:
                value = "0";
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animal fido = new Animal("Fido");
    }
}
