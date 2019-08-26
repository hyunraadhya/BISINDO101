package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Warna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warna);

        ImageView warabu = (ImageView) findViewById(R.id.abu);
        warabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.abuu);
                ImageView imgabu = (ImageView) myDialog.findViewById(R.id.abugif);
                ImageView abu_close = (ImageView) myDialog.findViewById(R.id.abuclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.abu)
                        //PENGATURAN CACHE
                        .into(imgabu);
                abu_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warbir = (ImageView) findViewById(R.id.biru);
        warbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.biruu);
                ImageView imgbir = (ImageView) myDialog.findViewById(R.id.birugif);
                ImageView bir_close = (ImageView) myDialog.findViewById(R.id.biruclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.biru)
                        //PENGATURAN CACHE
                        .into(imgbir);
                bir_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warcok = (ImageView) findViewById(R.id.coklat);
        warcok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.coklatt);
                ImageView imgcok = (ImageView) myDialog.findViewById(R.id.cokelatgif);
                ImageView cok_close = (ImageView) myDialog.findViewById(R.id.cokelatclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.coklat)
                        //PENGATURAN CACHE
                        .into(imgcok);
                cok_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warema = (ImageView) findViewById(R.id.emas);
        warema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.emass);
                ImageView imgema = (ImageView) myDialog.findViewById(R.id.emasgif);
                ImageView ema_close = (ImageView) myDialog.findViewById(R.id.emasclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.emas)
                        //PENGATURAN CACHE
                        .into(imgema);
                ema_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warhij = (ImageView) findViewById(R.id.hijau);
        warhij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.hijauu);
                ImageView imghij = (ImageView) myDialog.findViewById(R.id.hijaugif);
                ImageView hij_close = (ImageView) myDialog.findViewById(R.id.hijauclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.hijau)
                        //PENGATURAN CACHE
                        .into(imghij);
                hij_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warhit = (ImageView) findViewById(R.id.hitam);
        warhit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.hitamm);
                ImageView imghit = (ImageView) myDialog.findViewById(R.id.hitamgif);
                ImageView hit_close = (ImageView) myDialog.findViewById(R.id.hitamclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.hitam)
                        //PENGATURAN CACHE
                        .into(imghit);
                hit_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warkun = (ImageView) findViewById(R.id.kuning);
        warkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.kuningg);
                ImageView imgkun = (ImageView) myDialog.findViewById(R.id.kuninggif);
                ImageView kun_close = (ImageView) myDialog.findViewById(R.id.kuningclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kuning)
                        //PENGATURAN CACHE
                        .into(imgkun);
                kun_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warmer = (ImageView) findViewById(R.id.merah);
        warmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.merahh);
                ImageView imgmer = (ImageView) myDialog.findViewById(R.id.merahgif);
                ImageView mer_close = (ImageView) myDialog.findViewById(R.id.merahclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.merah)
                        //PENGATURAN CACHE
                        .into(imgmer);
                mer_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warore = (ImageView) findViewById(R.id.oren);
        warore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.orenn);
                ImageView imgore = (ImageView) myDialog.findViewById(R.id.orengif);
                ImageView ore_close = (ImageView) myDialog.findViewById(R.id.orenclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.oranye)
                        //PENGATURAN CACHE
                        .into(imgore);
                ore_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warpin = (ImageView) findViewById(R.id.pink);
        warpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.pinkk);
                ImageView imgpin = (ImageView) myDialog.findViewById(R.id.pinkgif);
                ImageView pin_close = (ImageView) myDialog.findViewById(R.id.pinkclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.pink)
                        //PENGATURAN CACHE
                        .into(imgpin);
                pin_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warput = (ImageView) findViewById(R.id.putih);
        warput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.putihh);
                ImageView imgput = (ImageView) myDialog.findViewById(R.id.putihgif);
                ImageView put_close = (ImageView) myDialog.findViewById(R.id.putihclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.putih)
                        //PENGATURAN CACHE
                        .into(imgput);
                put_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warung = (ImageView) findViewById(R.id.ungu);
        warung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.unguu);
                ImageView imgung = (ImageView) myDialog.findViewById(R.id.ungugif);
                ImageView ung_close = (ImageView) myDialog.findViewById(R.id.unguclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ungu)
                        //PENGATURAN CACHE
                        .into(imgung);
                ung_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView warwar = (ImageView) findViewById(R.id.warnaa);
        warwar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Warna.this);
                myDialog.setContentView(R.layout.warnaaaa);
                ImageView imgwar = (ImageView) myDialog.findViewById(R.id.warnaagif);
                ImageView war_close = (ImageView) myDialog.findViewById(R.id.warnaaclose);
                Glide.with(Warna.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.warna)
                        //PENGATURAN CACHE
                        .into(imgwar);
                war_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        final ImageView warnaclose = (ImageView) findViewById(R.id.warna_close);
        warnaclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
