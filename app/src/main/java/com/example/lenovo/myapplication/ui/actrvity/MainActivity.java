package com.example.lenovo.myapplication.ui.actrvity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.lenovo.myapplication.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toobar;
    private DrawerLayout draw;
    private NavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, draw, toobar, R.string.open, R.string.close);
        toggle.syncState();
        draw.addDrawerListener(toggle);
        View headerView = nav.getHeaderView(0);
        headerView.setOnClickListener(MainActivity.this);
        nav.setNavigationItemSelectedListener(this);
        nav.setItemIconTintList(null);


    }

    private void initView() {
        toobar = (Toolbar) findViewById(R.id.toobar);
        draw = (DrawerLayout) findViewById(R.id.draw);
        nav = (NavigationView) findViewById(R.id.nav);
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
