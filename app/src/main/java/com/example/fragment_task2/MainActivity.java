package com.example.fragment_task2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        f1= recylerview
        f2= textview
        */

        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // In landscape

            fragment2 f2=new fragment2();
            fragment1 f1=new fragment1();
            getSupportFragmentManager().beginTransaction().add(R.id.container, f2).commit();
            getSupportFragmentManager().beginTransaction().add(R.id.container, f1).commit();

        } else {
            // In portrait
            fragment1 fragment=new fragment1();

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            transaction.replace(R.id.container, fragment);
            transaction.addToBackStack(null);

            transaction.commit();
        }


    }
}