package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Waktu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waktu);

        ImageView wakbes = (ImageView) findViewById(R.id.besok);
        wakbes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.besokk);
                ImageView imgbes = (ImageView) myDialog.findViewById(R.id.besokgif);
                ImageView bes_close = (ImageView) myDialog.findViewById(R.id.besokclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.besok)
                        //PENGATURAN CACHE
                        .into(imgbes);
                bes_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView wakdul = (ImageView) findViewById(R.id.dulu);
        wakdul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.duluu);
                ImageView imgdul = (ImageView) myDialog.findViewById(R.id.dulugif);
                ImageView dul_close = (ImageView) myDialog.findViewById(R.id.duluclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.dulu)
                        //PENGATURAN CACHE
                        .into(imgdul);
                dul_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView wakdet = (ImageView) findViewById(R.id.detik);
        wakdet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.detikk);
                ImageView imgdet = (ImageView) myDialog.findViewById(R.id.detikgif);
                ImageView det_close = (ImageView) myDialog.findViewById(R.id.detikclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.detik)
                        //PENGATURAN CACHE
                        .into(imgdet);
                det_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView wakjam = (ImageView) findViewById(R.id.jam);
        wakjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.jamm);
                ImageView imgjam = (ImageView) myDialog.findViewById(R.id.jamgif);
                ImageView jam_close = (ImageView) myDialog.findViewById(R.id.jamclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.jam)
                        //PENGATURAN CACHE
                        .into(imgjam);
                jam_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView wakkem = (ImageView) findViewById(R.id.kemarin);
        wakkem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.kemarinn);
                ImageView imgkem = (ImageView) myDialog.findViewById(R.id.kemaringif);
                ImageView kem_close = (ImageView) myDialog.findViewById(R.id.kemarinclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kemarin)
                        //PENGATURAN CACHE
                        .into(imgkem);
                kem_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView waklus = (ImageView) findViewById(R.id.lusa);
        waklus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.lusaa);
                ImageView imglus = (ImageView) myDialog.findViewById(R.id.lusagif);
                ImageView lus_close = (ImageView) myDialog.findViewById(R.id.lusaclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.lusa)
                        //PENGATURAN CACHE
                        .into(imglus);
                lus_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView wakmal = (ImageView) findViewById(R.id.malam);
        wakmal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.malamm);
                ImageView imgmal = (ImageView) myDialog.findViewById(R.id.malamgif);
                ImageView mal_close = (ImageView) myDialog.findViewById(R.id.malamclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.malam)
                        //PENGATURAN CACHE
                        .into(imgmal);
                mal_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView wakmen = (ImageView) findViewById(R.id.menit);
        wakmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.menitt);
                ImageView imgmen = (ImageView) myDialog.findViewById(R.id.menitgif);
                ImageView men_close = (ImageView) myDialog.findViewById(R.id.menitclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.menit)
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

        ImageView wakpag = (ImageView) findViewById(R.id.pagi);
        wakpag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.pagii);
                ImageView imgpag = (ImageView) myDialog.findViewById(R.id.pagigif);
                ImageView pag_close = (ImageView) myDialog.findViewById(R.id.pagiclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.pagi)
                        //PENGATURAN CACHE
                        .into(imgpag);
                pag_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView waksia = (ImageView) findViewById(R.id.siang);
        waksia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.siangg);
                ImageView imgsia = (ImageView) myDialog.findViewById(R.id.sianggif);
                ImageView sia_close = (ImageView) myDialog.findViewById(R.id.siangclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.siang)
                        //PENGATURAN CACHE
                        .into(imgsia);
                sia_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView waksor = (ImageView) findViewById(R.id.sore);
        waksor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.soree);
                ImageView imgsor = (ImageView) myDialog.findViewById(R.id.soregif);
                ImageView sor_close = (ImageView) myDialog.findViewById(R.id.soreclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sore)
                        //PENGATURAN CACHE
                        .into(imgsor);
                sor_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView waktad = (ImageView) findViewById(R.id.tadi);
        waktad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Waktu.this);
                myDialog.setContentView(R.layout.tadii);
                ImageView imgtad = (ImageView) myDialog.findViewById(R.id.tadigif);
                ImageView tad_close = (ImageView) myDialog.findViewById(R.id.tadiclose);
                Glide.with(Waktu.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tadi)
                        //PENGATURAN CACHE
                        .into(imgtad);
                tad_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        final ImageView waktuclose = (ImageView) findViewById(R.id.waktu_close);
        waktuclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
