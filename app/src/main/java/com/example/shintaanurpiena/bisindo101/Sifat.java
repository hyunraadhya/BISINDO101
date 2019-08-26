package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Sifat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifat);

        ImageView sifbah = (ImageView) findViewById(R.id.bahagia);
        sifbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.bahagiaa);
                ImageView imgbah = (ImageView) myDialog.findViewById(R.id.bahagiagif);
                ImageView bah_close = (ImageView) myDialog.findViewById(R.id.bahagiaclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bahagia)
                        //PENGATURAN CACHE
                        .into(imgbah);
                bah_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifbai = (ImageView) findViewById(R.id.baik);
        sifbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.baikk);
                ImageView imgbai = (ImageView) myDialog.findViewById(R.id.baikgif);
                ImageView bai_close = (ImageView) myDialog.findViewById(R.id.baikclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.baik)
                        //PENGATURAN CACHE
                        .into(imgbai);
                bai_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifbod = (ImageView) findViewById(R.id.bodoh);
        sifbod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.bodohh);
                ImageView imgbod = (ImageView) myDialog.findViewById(R.id.bodohgif);
                ImageView bod_close = (ImageView) myDialog.findViewById(R.id.bodohclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bodoh)
                        //PENGATURAN CACHE
                        .into(imgbod);
                bod_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifcem = (ImageView) findViewById(R.id.cemburu);
        sifcem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.cemburuu);
                ImageView imgcem = (ImageView) myDialog.findViewById(R.id.cemburugif);
                ImageView cem_close = (ImageView) myDialog.findViewById(R.id.cemburuclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.cemburu)
                        //PENGATURAN CACHE
                        .into(imgcem);
                cem_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifdia = (ImageView) findViewById(R.id.diam);
        sifdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.diamm);
                ImageView imgdia = (ImageView) myDialog.findViewById(R.id.diamgif);
                ImageView dia_close = (ImageView) myDialog.findViewById(R.id.diamclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.diam)
                        //PENGATURAN CACHE
                        .into(imgdia);
                dia_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifemo = (ImageView) findViewById(R.id.emosi);
        sifemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.emosii);
                ImageView imgemo = (ImageView) myDialog.findViewById(R.id.emosigif);
                ImageView emo_close = (ImageView) myDialog.findViewById(R.id.emosiclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.emosi)
                        //PENGATURAN CACHE
                        .into(imgemo);
                emo_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });


        ImageView sifjah = (ImageView) findViewById(R.id.jahat);
        sifjah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.jahatt);
                ImageView imgjah = (ImageView) myDialog.findViewById(R.id.jahatgif);
                ImageView jah_close = (ImageView) myDialog.findViewById(R.id.jahatclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.jahat)
                        //PENGATURAN CACHE
                        .into(imgjah);
                jah_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifkal = (ImageView) findViewById(R.id.kalah);
        sifkal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.kalahh);
                ImageView imgkal = (ImageView) myDialog.findViewById(R.id.kalahgif);
                ImageView kal_close = (ImageView) myDialog.findViewById(R.id.kalahclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kalah)
                        //PENGATURAN CACHE
                        .into(imgkal);
                kal_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifmar = (ImageView) findViewById(R.id.marah);
        sifmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.marahh);
                ImageView imgmar = (ImageView) myDialog.findViewById(R.id.marahgif);
                ImageView mar_close = (ImageView) myDialog.findViewById(R.id.marahclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.marah)
                        //PENGATURAN CACHE
                        .into(imgmar);
                mar_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifmen = (ImageView) findViewById(R.id.menang);
        sifmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.menangg);
                ImageView imgmen = (ImageView) myDialog.findViewById(R.id.menanggif);
                ImageView men_close = (ImageView) myDialog.findViewById(R.id.menangclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.menang)
                        //PENGATURAN CACHE
                        .into(imgmen);
                men_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifpen = (ImageView) findViewById(R.id.pengecut);
        sifpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.pengecutt);
                ImageView imgpen = (ImageView) myDialog.findViewById(R.id.pengecutgif);
                ImageView pen_close = (ImageView) myDialog.findViewById(R.id.pengecutclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.pengecut)
                        //PENGATURAN CACHE
                        .into(imgpen);
                pen_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifpin = (ImageView) findViewById(R.id.pintar);
        sifpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.pintarr);
                ImageView imgpin = (ImageView) myDialog.findViewById(R.id.pintargif);
                ImageView pin_close = (ImageView) myDialog.findViewById(R.id.pintarclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.pintar)
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

        ImageView sifram = (ImageView) findViewById(R.id.ramah);
        sifram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.ramahh);
                ImageView imgram = (ImageView) myDialog.findViewById(R.id.ramahgif);
                ImageView ram_close = (ImageView) myDialog.findViewById(R.id.ramahclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ramah)
                        //PENGATURAN CACHE
                        .into(imgram);
                ram_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifsed = (ImageView) findViewById(R.id.sedih);
        sifsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.sedihh);
                ImageView imgsed = (ImageView) myDialog.findViewById(R.id.sedihgif);
                ImageView sed_close = (ImageView) myDialog.findViewById(R.id.sedihclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sedih)
                        //PENGATURAN CACHE
                        .into(imgsed);
                sed_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifsem = (ImageView) findViewById(R.id.semangat);
        sifsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.semangatt);
                ImageView imgsem = (ImageView) myDialog.findViewById(R.id.semangatgif);
                ImageView sem_close = (ImageView) myDialog.findViewById(R.id.semangatclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.semangat)
                        //PENGATURAN CACHE
                        .into(imgsem);
                sem_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView sifsen = (ImageView) findViewById(R.id.senang);
        sifsen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Sifat.this);
                myDialog.setContentView(R.layout.senangg);
                ImageView imgsen = (ImageView) myDialog.findViewById(R.id.senanggif);
                ImageView sen_close = (ImageView) myDialog.findViewById(R.id.senangclose);
                Glide.with(Sifat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.senang)
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

        final ImageView sifatclose = (ImageView) findViewById(R.id.sifat_close);
        sifatclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}