package com.example.amahler4096.projecttracker;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Tomato on 12/13/2016.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity
{
        // Variable to hold a fragment:
    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
            // Get the fragment manager:
        FragmentManager fm = getSupportFragmentManager();
            // Connect the fragment to the fragment view:
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
            // If the fragment is null, create it:
        if (fragment == null) {
                // Create the fragment:
            fragment = createFragment();
                // Bind it to the fragment view:
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }

    }
}
