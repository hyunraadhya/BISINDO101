package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Kalimat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimat);

        ImageView kalan = (ImageView) findViewById(R.id.anbuha);
        kalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kalimat.this);
                myDialog.setContentView(R.layout.anbuhaa);
                ImageView imgan = (ImageView) myDialog.findViewById(R.id.anbuhagif);
                ImageView an_close = (ImageView) myDialog.findViewById(R.id.anbuhaclose);
                Glide.with(Kalimat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ultah)
                        //PENGATURAN CACHE
                        .into(imgan);
                an_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kalkot = (ImageView) findViewById(R.id.kotaol);
        kalkot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kalimat.this);
                myDialog.setContentView(R.layout.kotaoll);
                ImageView imgkot = (ImageView) myDialog.findViewById(R.id.kotaolgif);
                ImageView kot_close = (ImageView) myDialog.findViewById(R.id.kotaolclose);
                Glide.with(Kalimat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.pertandingan)
                        //PENGATURAN CACHE
                        .into(imgkot);
                kot_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kaltra = (ImageView) findViewById(R.id.trawar);
        kaltra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kalimat.this);
                myDialog.setContentView(R.layout.trawarr);
                ImageView imgtra = (ImageView) myDialog.findViewById(R.id.trawargif);
                ImageView tra_close = (ImageView) myDialog.findViewById(R.id.trawarclose);
                Glide.with(Kalimat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tabrakan)
                        //PENGATURAN CACHE
                        .into(imgtra);
                tra_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kalkep = (ImageView) findViewById(R.id.kepete);
        kalkep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kalimat.this);
                myDialog.setContentView(R.layout.kepetee);
                ImageView imgkep = (ImageView) myDialog.findViewById(R.id.kepetegif);
                ImageView kep_close = (ImageView) myDialog.findViewById(R.id.kepeteclose);
                Glide.with(Kalimat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kerten)
                        //PENGATURAN CACHE
                        .into(imgkep);
                kep_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kalkote = (ImageView) findViewById(R.id.kote);
        kalkote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kalimat.this);
                myDialog.setContentView(R.layout.kotee);
                ImageView imgkote = (ImageView) myDialog.findViewById(R.id.kotegif);
                ImageView kote_close = (ImageView) myDialog.findViewById(R.id.koteclose);
                Glide.with(Kalimat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.paragon)
                        //PENGATURAN CACHE
                        .into(imgkote);
                kote_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        final ImageView kalimatclose = (ImageView) findViewById(R.id.kalimat_close);
        kalimatclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
