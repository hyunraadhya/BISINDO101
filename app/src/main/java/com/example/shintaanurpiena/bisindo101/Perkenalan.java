package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Perkenalan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkenalan);

        ImageView peraku = (ImageView) findViewById(R.id.aku);
        peraku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.akuu);
                ImageView imgaku = (ImageView) myDialog.findViewById(R.id.akugif);
                ImageView aku_close = (ImageView) myDialog.findViewById(R.id.akuclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.aku)
                        //PENGATURAN CACHE
                        .into(imgaku);
                aku_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView perapa = (ImageView) findViewById(R.id.apa);
        perapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.apaa);
                ImageView imgapa = (ImageView) myDialog.findViewById(R.id.apagif);
                ImageView apa_close = (ImageView) myDialog.findViewById(R.id.apaclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.apa)
                        //PENGATURAN CACHE
                        .into(imgapa);
                apa_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView perdia = (ImageView) findViewById(R.id.dia);
        perdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.diaa);
                ImageView imgdia = (ImageView) myDialog.findViewById(R.id.diagif);
                ImageView dia_close = (ImageView) myDialog.findViewById(R.id.diaclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.dia)
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

        ImageView perdim = (ImageView) findViewById(R.id.dimana);
        perdim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.dimanaa);
                ImageView imgdim = (ImageView) myDialog.findViewById(R.id.dimanagif);
                ImageView dim_close = (ImageView) myDialog.findViewById(R.id.dimanaclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.dimana)
                        //PENGATURAN CACHE
                        .into(imgdim);
                dim_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView perkal = (ImageView) findViewById(R.id.kalian);
        perkal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.kaliann);
                ImageView imgkal = (ImageView) myDialog.findViewById(R.id.kaliangif);
                ImageView kal_close = (ImageView) myDialog.findViewById(R.id.kalianclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kalian)
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

        ImageView perkai = (ImageView) findViewById(R.id.kami);
        perkai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.kamii);
                ImageView imgkai = (ImageView) myDialog.findViewById(R.id.kamigif);
                ImageView kai_close = (ImageView) myDialog.findViewById(R.id.kamiclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kami)
                        //PENGATURAN CACHE
                        .into(imgkai);
                kai_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView perkau = (ImageView) findViewById(R.id.kamu);
        perkau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.kamuu);
                ImageView imgkau = (ImageView) myDialog.findViewById(R.id.kamugif);
                ImageView kau_close = (ImageView) myDialog.findViewById(R.id.kamuclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kamu)
                        //PENGATURAN CACHE
                        .into(imgkau);
                kau_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView perkit = (ImageView) findViewById(R.id.kita);
        perkit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.kitaa);
                ImageView imgkit = (ImageView) myDialog.findViewById(R.id.kitagif);
                ImageView kit_close = (ImageView) myDialog.findViewById(R.id.kitaclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kita)
                        //PENGATURAN CACHE
                        .into(imgkit);
                kit_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView permer = (ImageView) findViewById(R.id.mereka);
        permer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.merekaa);
                ImageView imgmer = (ImageView) myDialog.findViewById(R.id.merekagif);
                ImageView mer_close = (ImageView) myDialog.findViewById(R.id.merekaclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.mereka)
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

        ImageView pernam = (ImageView) findViewById(R.id.nama);
        pernam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.namaa);
                ImageView imgnam = (ImageView) myDialog.findViewById(R.id.namagif);
                ImageView nam_close = (ImageView) myDialog.findViewById(R.id.namaclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.nama)
                        //PENGATURAN CACHE
                        .into(imgnam);
                nam_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView perper = (ImageView) findViewById(R.id.perkenalann);
        perper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.perkenalann);
                ImageView imgper = (ImageView) myDialog.findViewById(R.id.perkenalangif);
                ImageView per_close = (ImageView) myDialog.findViewById(R.id.perkenalanclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.perkenalan)
                        //PENGATURAN CACHE
                        .into(imgper);
                per_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView persiap = (ImageView) findViewById(R.id.siapa);
        persiap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Perkenalan.this);
                myDialog.setContentView(R.layout.siapa);
                ImageView imgsiap = (ImageView) myDialog.findViewById(R.id.siapagif);
                ImageView siap_close = (ImageView) myDialog.findViewById(R.id.siapaclose);
                Glide.with(Perkenalan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.siapa)
                        //PENGATURAN CACHE
                        .into(imgsiap);
                siap_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        final ImageView perkenalanclose = (ImageView) findViewById(R.id.perkenalan_close);
        perkenalanclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
