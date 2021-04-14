package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLayout);
        textView = findViewById(R.id.textView);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        PhysicsTest physicsTest = new PhysicsTest();
        for (TestExample p: physicsTest.getTests()) {
            tabLayout.addTab(tabLayout.newTab().setText("Ays"));
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(getApplicationContext(), "onTabSelected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
//                Toast.makeText(getApplicationContext(), "onTabUnselected", Toast.LENGTH_LONG).show();
                textView.setText("onTabUnselected");
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
//                Toast.makeText(getApplicationContext(), "onTabReselected", Toast.LENGTH_LONG).show();
                textView.append(tab.getPosition()+"");
            }
        });
    }
}