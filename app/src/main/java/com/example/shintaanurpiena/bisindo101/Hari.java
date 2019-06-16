package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Hari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hari);

        ImageView harsen = (ImageView) findViewById(R.id.senin);
        harsen.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hari.this);
                myDialog.setContentView(R.layout.seninn);
                ImageView imgsen = (ImageView) myDialog.findViewById(R.id.seningif);
                ImageView sen_close = (ImageView) myDialog.findViewById(R.id.seninclose);
                Glide.with(Hari.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.senin)
                        //PENGATURAN CACHE
                        .into(imgsen);
               sen_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView harsel = (ImageView) findViewById(R.id.selasa);
        harsel.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hari.this);
                myDialog.setContentView(R.layout.selasaa);
                ImageView imgsel = (ImageView) myDialog.findViewById(R.id.selasagif);
                ImageView sel_close = (ImageView) myDialog.findViewById(R.id.selasaclose);
                Glide.with(Hari.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.selasa)
                        //PENGATURAN CACHE
                        .into(imgsel);
                sel_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView harrab = (ImageView) findViewById(R.id.rabu);
        harrab.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hari.this);
                myDialog.setContentView(R.layout.rabuu);
                ImageView imgrab = (ImageView) myDialog.findViewById(R.id.rabugif);
                ImageView rab_close = (ImageView) myDialog.findViewById(R.id.rabuclose);
                Glide.with(Hari.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.rabu)
                        //PENGATURAN CACHE
                        .into(imgrab);
                rab_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView harkam = (ImageView) findViewById(R.id.kamis);
        harkam.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hari.this);
                myDialog.setContentView(R.layout.kamiss);
                ImageView imgkam = (ImageView) myDialog.findViewById(R.id.kamisgif);
                ImageView kam_close = (ImageView) myDialog.findViewById(R.id.kamisclose);
                Glide.with(Hari.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kamis)
                        //PENGATURAN CACHE
                        .into(imgkam);
                kam_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView harjum = (ImageView) findViewById(R.id.jumat);
        harjum.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hari.this);
                myDialog.setContentView(R.layout.jumatt);
                ImageView imgjum = (ImageView) myDialog.findViewById(R.id.jumatgif);
                ImageView jum_close = (ImageView) myDialog.findViewById(R.id.jumatclose);
                Glide.with(Hari.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.jumat)
                        //PENGATURAN CACHE
                        .into(imgjum);
                jum_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView harsab = (ImageView) findViewById(R.id.sabtu);
        harsab.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hari.this);
                myDialog.setContentView(R.layout.sabtuu);
                ImageView imgsab = (ImageView) myDialog.findViewById(R.id.sabtugif);
                ImageView sab_close = (ImageView) myDialog.findViewById(R.id.sabtuclose);
                Glide.with(Hari.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sabtu)
                        //PENGATURAN CACHE
                        .into(imgsab);
                sab_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView harmin = (ImageView) findViewById(R.id.minggu);
        harmin.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hari.this);
                myDialog.setContentView(R.layout.mingguu);
                ImageView imgmin = (ImageView) myDialog.findViewById(R.id.minggugif);
                ImageView min_close = (ImageView) myDialog.findViewById(R.id.mingguclose);
                Glide.with(Hari.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.minggu)
                        //PENGATURAN CACHE
                        .into(imgmin);
                min_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });
    }
}
