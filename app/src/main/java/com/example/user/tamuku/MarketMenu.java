package com.example.user.tamuku;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MarketMenu extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private Button buttonBurger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_menu);


        mDrawerLayout= (DrawerLayout) findViewById(R.id.drawer_layout);
        buttonBurger=(Button)findViewById(R.id.buttonBurger);
    }

    public void openDrawer(View view){
        mDrawerLayout.openDrawer(Gravity.START);
    }

}
