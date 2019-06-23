package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Pekerjaan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pekerjaan);

        ImageView pekars = (ImageView) findViewById(R.id.arsitek);
        pekars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.arsitekk);
                ImageView imgars = (ImageView) myDialog.findViewById(R.id.arsitekgif);
                ImageView ars_close = (ImageView) myDialog.findViewById(R.id.arsitekclose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.arsitek)
                        //PENGATURAN CACHE
                        .into(imgars);
                ars_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView pekbup = (ImageView) findViewById(R.id.bupati);
        pekbup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.bupatii);
                ImageView imgbup = (ImageView) myDialog.findViewById(R.id.bupatigif);
                ImageView bup_close = (ImageView) myDialog.findViewById(R.id.bupaticlose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bupati)
                        //PENGATURAN CACHE
                        .into(imgbup);
                bup_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView pekdok = (ImageView) findViewById(R.id.dokter);
        pekdok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.dokterr);
                ImageView imgdok = (ImageView) myDialog.findViewById(R.id.doktergif);
                ImageView dok_close = (ImageView) myDialog.findViewById(R.id.dokterclose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.dokter)
                        //PENGATURAN CACHE
                        .into(imgdok);
                dok_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView pekdos = (ImageView) findViewById(R.id.dosen);
        pekdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.dosenn);
                ImageView imgdos = (ImageView) myDialog.findViewById(R.id.dosengif);
                ImageView dos_close = (ImageView) myDialog.findViewById(R.id.dosenclose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.dosen)
                        //PENGATURAN CACHE
                        .into(imgdos);
                dos_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView pekgur = (ImageView) findViewById(R.id.guru);
        pekgur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.guruu);
                ImageView imggur = (ImageView) myDialog.findViewById(R.id.gurugif);
                ImageView gur_close = (ImageView) myDialog.findViewById(R.id.guruclose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.guru)
                        //PENGATURAN CACHE
                        .into(imggur);
                gur_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView pekpem = (ImageView) findViewById(R.id.pembantu);
        pekpem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.pembantuu);
                ImageView imgpem = (ImageView) myDialog.findViewById(R.id.pembantugif);
                ImageView pem_close = (ImageView) myDialog.findViewById(R.id.pembantuclose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.pembantu)
                        //PENGATURAN CACHE
                        .into(imgpem);
                pem_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView pekper = (ImageView) findViewById(R.id.perawat);
        pekper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.perawatt);
                ImageView imgper = (ImageView) myDialog.findViewById(R.id.perawatgif);
                ImageView per_close = (ImageView) myDialog.findViewById(R.id.perawatclose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.perawat)
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

        ImageView pekpol = (ImageView) findViewById(R.id.polisi);
        pekpol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.polisii);
                ImageView imgpol = (ImageView) myDialog.findViewById(R.id.polisigif);
                ImageView pol_close = (ImageView) myDialog.findViewById(R.id.polisiclose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.polisi)
                        //PENGATURAN CACHE
                        .into(imgpol);
                pol_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView pekpre = (ImageView) findViewById(R.id.presiden);
        pekpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.presidenn);
                ImageView imgpre = (ImageView) myDialog.findViewById(R.id.presidengif);
                ImageView pre_close = (ImageView) myDialog.findViewById(R.id.presidenclose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.presiden)
                        //PENGATURAN CACHE
                        .into(imgpre);
                pre_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView peksat = (ImageView) findViewById(R.id.satpam);
        peksat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.satpamm);
                ImageView imgsat = (ImageView) myDialog.findViewById(R.id.satpamgif);
                ImageView sat_close = (ImageView) myDialog.findViewById(R.id.satpamclose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.satpam)
                        //PENGATURAN CACHE
                        .into(imgsat);
                sat_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView pekten = (ImageView) findViewById(R.id.tentara);
        pekten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.tentaraa);
                ImageView imgten = (ImageView) myDialog.findViewById(R.id.tentaragif);
                ImageView ten_close = (ImageView) myDialog.findViewById(R.id.tentaraclose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tentara)
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

        ImageView pekwal = (ImageView) findViewById(R.id.walikota);
        pekwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Pekerjaan.this);
                myDialog.setContentView(R.layout.walikotaa);
                ImageView imgwal = (ImageView) myDialog.findViewById(R.id.walikotagif);
                ImageView wal_close = (ImageView) myDialog.findViewById(R.id.walikotaclose);
                Glide.with(Pekerjaan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.walikota)
                        //PENGATURAN CACHE
                        .into(imgwal);
                wal_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        final ImageView pekerjaanclose = (ImageView) findViewById(R.id.pekerjaan_close);
        pekerjaanclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
