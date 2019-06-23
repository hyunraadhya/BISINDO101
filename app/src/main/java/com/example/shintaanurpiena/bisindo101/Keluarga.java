package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Keluarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keluarga);

        ImageView kelbap = (ImageView) findViewById(R.id.bapak);
        kelbap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Keluarga.this);
                myDialog.setContentView(R.layout.bapakk);
                ImageView imgbap = (ImageView) myDialog.findViewById(R.id.bapakgif);
                ImageView bap_close = (ImageView) myDialog.findViewById(R.id.bapakclose);
                Glide.with(Keluarga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bapak)
                        //PENGATURAN CACHE
                        .into(imgbap);
                bap_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kelibu = (ImageView) findViewById(R.id.ibu);
        kelibu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Keluarga.this);
                myDialog.setContentView(R.layout.ibuu);
                ImageView imgibu = (ImageView) myDialog.findViewById(R.id.ibugif);
                ImageView ibu_close = (ImageView) myDialog.findViewById(R.id.ibuclose);
                Glide.with(Keluarga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ibu)
                        //PENGATURAN CACHE
                        .into(imgibu);
                ibu_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kelkek = (ImageView) findViewById(R.id.kakek);
        kelkek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Keluarga.this);
                myDialog.setContentView(R.layout.kakekk);
                ImageView imgkek = (ImageView) myDialog.findViewById(R.id.kakekgif);
                ImageView kek_close = (ImageView) myDialog.findViewById(R.id.kakekclose);
                Glide.with(Keluarga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kakek)
                        //PENGATURAN CACHE
                        .into(imgkek);
                kek_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kelnek = (ImageView) findViewById(R.id.nenek);
        kelnek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Keluarga.this);
                myDialog.setContentView(R.layout.nenekk);
                ImageView imgnek = (ImageView) myDialog.findViewById(R.id.nenekgif);
                ImageView nek_close = (ImageView) myDialog.findViewById(R.id.nenekclose);
                Glide.with(Keluarga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.nenek)
                        //PENGATURAN CACHE
                        .into(imgnek);
                nek_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kellak = (ImageView) findViewById(R.id.laki);
        kellak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Keluarga.this);
                myDialog.setContentView(R.layout.lakii);
                ImageView imglak = (ImageView) myDialog.findViewById(R.id.lakigif);
                ImageView lak_close = (ImageView) myDialog.findViewById(R.id.lakiclose);
                Glide.with(Keluarga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.lakilaki)
                        //PENGATURAN CACHE
                        .into(imglak);
                lak_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kelper = (ImageView) findViewById(R.id.perempuan);
        kelper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Keluarga.this);
                myDialog.setContentView(R.layout.perempuann);
                ImageView imgper = (ImageView) myDialog.findViewById(R.id.perempuangif);
                ImageView per_close = (ImageView) myDialog.findViewById(R.id.perempuanclose);
                Glide.with(Keluarga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.perempuan)
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

        ImageView kelank = (ImageView) findViewById(R.id.anak);
        kelank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Keluarga.this);
                myDialog.setContentView(R.layout.anakk);
                ImageView imgank = (ImageView) myDialog.findViewById(R.id.anakgif);
                ImageView ank_close = (ImageView) myDialog.findViewById(R.id.anakclose);
                Glide.with(Keluarga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.anak)
                        //PENGATURAN CACHE
                        .into(imgank);
                ank_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kelankk = (ImageView) findViewById(R.id.anakkk);
        kelankk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Keluarga.this);
                myDialog.setContentView(R.layout.anakkk);
                ImageView imgankkk = (ImageView) myDialog.findViewById(R.id.anakkkgif);
                ImageView ankkk_close = (ImageView) myDialog.findViewById(R.id.anakkkclose);
                Glide.with(Keluarga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.anakanak)
                        //PENGATURAN CACHE
                        .into(imgankkk);
                ankkk_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kelbay = (ImageView) findViewById(R.id.bayi);
        kelbay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Keluarga.this);
                myDialog.setContentView(R.layout.bayii);
                ImageView imgbay = (ImageView) myDialog.findViewById(R.id.bayigif);
                ImageView bay_close = (ImageView) myDialog.findViewById(R.id.bayiclose);
                Glide.with(Keluarga.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bayi)
                        //PENGATURAN CACHE
                        .into(imgbay);
                bay_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        final ImageView keluargaclose = (ImageView) findViewById(R.id.keluarga_close);
        keluargaclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
