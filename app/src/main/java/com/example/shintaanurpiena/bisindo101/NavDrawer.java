package com.example.shintaanurpiena.bisindo101;

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
import android.widget.ImageButton;
import android.widget.ImageView;

public class NavDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        final ImageView huruf = (ImageView) findViewById(R.id.huruf);
        huruf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hur=new Intent(NavDrawer.this,Huruf.class);
                startActivity(hur);
            }
        });

        ImageView angka = (ImageView)findViewById(R.id.angka);
        angka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ang=new Intent(NavDrawer.this,Angka.class);
                startActivity(ang);
            }
        });

        ImageView bulan = (ImageView)findViewById(R.id.bulan);
        ImageView hari = (ImageView)findViewById(R.id.hari);
        ImageView hewan = (ImageView)findViewById(R.id.hewan);
        ImageView keluarga = (ImageView)findViewById(R.id.keluarga);
        ImageView kota = (ImageView)findViewById(R.id.kota);
        ImageView olahraga = (ImageView)findViewById(R.id.olahraga);
        ImageView pekerjaan = (ImageView)findViewById(R.id.pekerjaan);
        ImageView perkenalan = (ImageView)findViewById(R.id.perkenalan);
        ImageView sifat = (ImageView)findViewById(R.id.sifat);
        ImageView tahun = (ImageView)findViewById(R.id.tahun);
        ImageView tempat = (ImageView)findViewById(R.id.tempat);
        ImageView transportasi = (ImageView)findViewById(R.id.transportasi);
        ImageView uang = (ImageView)findViewById(R.id.uang);
        ImageView waktu = (ImageView)findViewById(R.id.waktu);
        ImageView warna = (ImageView)findViewById(R.id.warna);



        bulan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bul=new Intent(NavDrawer.this,Bulan.class);
                startActivity(bul);
            }
        });

        hari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent har=new Intent(NavDrawer.this,Hari.class);
                startActivity(har);
            }
        });

        hewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hew=new Intent(NavDrawer.this,Hewan.class);
                startActivity(hew);
            }
        });

        keluarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kel=new Intent(NavDrawer.this,Keluarga.class);
                startActivity(kel);
            }
        });

        kota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kot=new Intent(NavDrawer.this,Kota.class);
                startActivity(kot);
            }
        });

        olahraga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ola=new Intent(NavDrawer.this,Olahraga.class);
                startActivity(ola);
            }
        });

        pekerjaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pek=new Intent(NavDrawer.this,Pekerjaan.class);
                startActivity(pek);
            }
        });

        perkenalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent per=new Intent(NavDrawer.this,Perkenalan.class);
                startActivity(per);
            }
        });

        sifat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sif=new Intent(NavDrawer.this,Sifat.class);
                startActivity(sif);
            }
        });

        tahun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tah=new Intent(NavDrawer.this,Tahun.class);
                startActivity(tah);
            }
        });

        tempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tem=new Intent(NavDrawer.this,Tempat.class);
                startActivity(tem);
            }
        });

        transportasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tra=new Intent(NavDrawer.this,Transportasi.class);
                startActivity(tra);
            }
        });

        uang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uan=new Intent(NavDrawer.this,Uang.class);
                startActivity(uan);
            }
        });

        waktu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wak=new Intent(NavDrawer.this,Waktu.class);
                startActivity(wak);
            }
        });

        warna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent war=new Intent(NavDrawer.this,Warna.class);
                startActivity(war);
            }
        });

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_tentang) {

            Intent tent1 = new Intent(getApplicationContext(),Tentang.class);

            startActivity(tent1);


        } else if (id == R.id.nav_pengaturan) {

            Intent peng = new Intent(getApplicationContext(),Pengaturan.class);

            startActivity(peng);

        } else if (id == R.id.nav_keluar) {
                    finish();
                    System.exit(0);
                }


                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
                }
}
