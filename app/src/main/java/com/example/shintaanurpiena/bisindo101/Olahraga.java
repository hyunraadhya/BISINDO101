package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Olahraga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olahraga);

        ImageView olgbad = (ImageView) findViewById(R.id.badminton);
        olgbad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.badmintonn);
                ImageView imgbad = (ImageView) myDialog.findViewById(R.id.badmintongif);
                ImageView bad_close = (ImageView) myDialog.findViewById(R.id.badmintonclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.badminton)
                        //PENGATURAN CACHE
                        .into(imgbad);
                bad_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView olgfit = (ImageView) findViewById(R.id.fitnes);
        olgfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.fitness);
                ImageView imgfit = (ImageView) myDialog.findViewById(R.id.fitnesgif);
                ImageView fit_close = (ImageView) myDialog.findViewById(R.id.fitnesclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.fitnes)
                        //PENGATURAN CACHE
                        .into(imgfit);
                fit_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView olgfut = (ImageView) findViewById(R.id.futsal);
        olgfut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.futsall);
                ImageView imgfut = (ImageView) myDialog.findViewById(R.id.futsalgif);
                ImageView fut_close = (ImageView) myDialog.findViewById(R.id.futsalclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.futsal)
                        //PENGATURAN CACHE
                        .into(imgfut);
                fut_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView olglar = (ImageView) findViewById(R.id.lari);
        olglar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.larii);
                ImageView imglar = (ImageView) myDialog.findViewById(R.id.larigif);
                ImageView lar_close = (ImageView) myDialog.findViewById(R.id.lariclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.lari)
                        //PENGATURAN CACHE
                        .into(imglar);
                lar_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView olglom = (ImageView) findViewById(R.id.lompat);
        olglom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.lompatt);
                ImageView imglom = (ImageView) myDialog.findViewById(R.id.lompatgif);
                ImageView lom_close = (ImageView) myDialog.findViewById(R.id.lompatclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.lompat_jauh)
                        //PENGATURAN CACHE
                        .into(imglom);
                lom_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView olgpan = (ImageView) findViewById(R.id.panah);
        olgpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.panahh);
                ImageView imgpan = (ImageView) myDialog.findViewById(R.id.panahgif);
                ImageView pan_close = (ImageView) myDialog.findViewById(R.id.panahclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.panah)
                        //PENGATURAN CACHE
                        .into(imgpan);
                pan_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView olgren = (ImageView) findViewById(R.id.renang);
        olgren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.renangg);
                ImageView imgren = (ImageView) myDialog.findViewById(R.id.renanggif);
                ImageView ren_close = (ImageView) myDialog.findViewById(R.id.renangclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.renang)
                        //PENGATURAN CACHE
                        .into(imgren);
                ren_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView olgsep = (ImageView) findViewById(R.id.sepak);
        olgsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.sepakk);
                ImageView imgsep = (ImageView) myDialog.findViewById(R.id.sepakgif);
                ImageView sep_close = (ImageView) myDialog.findViewById(R.id.sepakclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sepak_bola)
                        //PENGATURAN CACHE
                        .into(imgsep);
                sep_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView olgtem = (ImageView) findViewById(R.id.tembak);
        olgtem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.tembakk);
                ImageView imgtem = (ImageView) myDialog.findViewById(R.id.tembakgif);
                ImageView tem_close = (ImageView) myDialog.findViewById(R.id.tembakclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tembak)
                        //PENGATURAN CACHE
                        .into(imgtem);
                tem_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView olgten = (ImageView) findViewById(R.id.tenis);
        olgten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.teniss);
                ImageView imgten = (ImageView) myDialog.findViewById(R.id.tenisgif);
                ImageView ten_close = (ImageView) myDialog.findViewById(R.id.tenisclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tenis)
                        //PENGATURAN CACHE
                        .into(imgten);
                ten_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView olgtol = (ImageView) findViewById(R.id.tolak);
        olgtol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.tolakk);
                ImageView imgtol = (ImageView) myDialog.findViewById(R.id.tolakgif);
                ImageView tol_close = (ImageView) myDialog.findViewById(R.id.tolakclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tolak_peluru)
                        //PENGATURAN CACHE
                        .into(imgtol);
                tol_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView olgvol = (ImageView) findViewById(R.id.voli);
        olgvol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Olahraga.this);
                myDialog.setContentView(R.layout.volii);
                ImageView imgvol = (ImageView) myDialog.findViewById(R.id.voligif);
                ImageView vol_close = (ImageView) myDialog.findViewById(R.id.voliclose);
                Glide.with(Olahraga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.voli)
                        //PENGATURAN CACHE
                        .into(imgvol);
                vol_close.setOnClickListener(new View.OnClickListener() {
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
