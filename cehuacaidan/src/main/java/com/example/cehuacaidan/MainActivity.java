package com.example.cehuacaidan;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NavigationView na;
    private DrawerLayout drwa;
    private Toolbar toober;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drwa, toober, R.string.open, R.string.close);
        toggle.syncState();
        drwa.addDrawerListener(toggle);
        View headerView = na.getHeaderView(0);
        headerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        na.setItemIconTintList(null);
    }

    private void initView() {
        na = (NavigationView) findViewById(R.id.na);
        drwa = (DrawerLayout) findViewById(R.id.drwa);

        toober = (Toolbar) findViewById(R.id.toober);
    }
}
