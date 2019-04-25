package com.hrsshuvo.newone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class jdasnav extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Button bonolota,kuri,gas,haowa,ami,hay,buno,abarasibo,banglarmukh,akashesatti,jatrii,tumii,nabik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jdasnav);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button bonolota = findViewById(R.id.bonolota);
        Button kuri = findViewById(R.id.kuri);
        Button gas = findViewById(R.id.gas);
        Button haowa = findViewById(R.id.haowa);
        Button ami = findViewById(R.id.ami);
        Button hay = findViewById(R.id.hay);
        Button buno = findViewById(R.id.buno);
        Button abarasibo = findViewById(R.id.abarasibo);
        Button banglarmukh = findViewById(R.id.banglarmukh);
        Button akashesatti = findViewById(R.id.akashesatti);
        Button jatrii = findViewById(R.id.jatrii);
        Button tumii = findViewById(R.id.tumii);
        final Button nabik = findViewById(R.id.nabik);

        nabik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this, com.hrsshuvo.newone.nabik.class));
            }
        });

        tumii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this,TUMI.class));
            }
        });

        jatrii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this,jatri.class));
            }
        });

        akashesatti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this,akashesattitara.class));
            }
        });

        banglarmukh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this,banglarmukhamidekhechi.class));
            }
        });

        abarasibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this,abarasibefire.class));
            }
        });

        buno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this,bunohas.class));
            }
        });

        hay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this,haycil.class));
            }
        });

        ami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this,amijodi.class));
            }
        });

        haowa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this, com.hrsshuvo.newone.haowa.class));
            }
        });

        gas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this, com.hrsshuvo.newone.gas.class));
            }
        });

        kuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this,kuribochorpore.class));
            }
        });

        bonolota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(jdasnav.this,bonolotasen.class));
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
