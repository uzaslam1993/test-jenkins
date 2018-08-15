package com.example.uzairaslam.collapsingtabswithrecyclerviewexample;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tabLayout = findViewById(R.id.tablayout);
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_launcher_background));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_launcher_background));
//        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_launcher_background));
        BlankFragment blankFragment = new BlankFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container,blankFragment).commit();


    }
}
