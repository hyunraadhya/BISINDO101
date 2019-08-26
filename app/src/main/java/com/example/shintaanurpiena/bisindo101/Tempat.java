package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Tempat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempat);

        ImageView temapo = (ImageView) findViewById(R.id.apotek);
        temapo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.apotekk);
                ImageView imgapo = (ImageView) myDialog.findViewById(R.id.apotekgif);
                ImageView apo_close = (ImageView) myDialog.findViewById(R.id.apotekclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.apotek)
                        //PENGATURAN CACHE
                        .into(imgapo);
                apo_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView temban = (ImageView) findViewById(R.id.bank);
        temban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.bankk);
                ImageView imgban = (ImageView) myDialog.findViewById(R.id.bankgif);
                ImageView ban_close = (ImageView) myDialog.findViewById(R.id.bankclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bank)
                        //PENGATURAN CACHE
                        .into(imgban);
                ban_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView temben = (ImageView) findViewById(R.id.bengkel);
        temben.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.bengkell);
                ImageView imgben = (ImageView) myDialog.findViewById(R.id.bengkelgif);
                ImageView ben_close = (ImageView) myDialog.findViewById(R.id.bengkelclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bengkel)
                        //PENGATURAN CACHE
                        .into(imgben);
                ben_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView temdes = (ImageView) findViewById(R.id.desa);
        temdes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.desaa);
                ImageView imgdes = (ImageView) myDialog.findViewById(R.id.desagif);
                ImageView des_close = (ImageView) myDialog.findViewById(R.id.desaclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.desa)
                        //PENGATURAN CACHE
                        .into(imgdes);
                des_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView temged = (ImageView) findViewById(R.id.gedung);
        temged.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.gedungg);
                ImageView imgged = (ImageView) myDialog.findViewById(R.id.gedunggif);
                ImageView ged_close = (ImageView) myDialog.findViewById(R.id.gedungclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.gedung)
                        //PENGATURAN CACHE
                        .into(imgged);
                ged_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView temkam = (ImageView) findViewById(R.id.kampung);
        temkam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.kampungg);
                ImageView imgkam = (ImageView) myDialog.findViewById(R.id.kampunggif);
                ImageView kam_close = (ImageView) myDialog.findViewById(R.id.kampungclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kampung)
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

        ImageView temkan = (ImageView) findViewById(R.id.kantor);
        temkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.kantorr);
                ImageView imgkan = (ImageView) myDialog.findViewById(R.id.kantorgif);
                ImageView kan_close = (ImageView) myDialog.findViewById(R.id.kantorclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kantor)
                        //PENGATURAN CACHE
                        .into(imgkan);
                kan_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView temlap = (ImageView) findViewById(R.id.lapangan);
        temlap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.lapangann);
                ImageView imglap = (ImageView) myDialog.findViewById(R.id.lapangangif);
                ImageView lap_close = (ImageView) myDialog.findViewById(R.id.lapanganclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.lapangan)
                        //PENGATURAN CACHE
                        .into(imglap);
                lap_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView temmal = (ImageView) findViewById(R.id.mall);
        temmal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.malll);
                ImageView imgmal = (ImageView) myDialog.findViewById(R.id.mallgif);
                ImageView mal_close = (ImageView) myDialog.findViewById(R.id.mallclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.mall)
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

        ImageView tempas = (ImageView) findViewById(R.id.pasar);
        tempas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.pasarr);
                ImageView imgpas = (ImageView) myDialog.findViewById(R.id.pasargif);
                ImageView pas_close = (ImageView) myDialog.findViewById(R.id.pasarclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.pasar)
                        //PENGATURAN CACHE
                        .into(imgpas);
                pas_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView temrum = (ImageView) findViewById(R.id.rumah);
        temrum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.rumahh);
                ImageView imgrum = (ImageView) myDialog.findViewById(R.id.rumahgif);
                ImageView rum_close = (ImageView) myDialog.findViewById(R.id.rumahclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.rumah)
                        //PENGATURAN CACHE
                        .into(imgrum);
                rum_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView temsek = (ImageView) findViewById(R.id.sekolah);
        temsek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.sekolahh);
                ImageView imgsek = (ImageView) myDialog.findViewById(R.id.sekolahgif);
                ImageView sek_close = (ImageView) myDialog.findViewById(R.id.sekolahclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sekolah)
                        //PENGATURAN CACHE
                        .into(imgsek);
                sek_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView temtok = (ImageView) findViewById(R.id.toko);
        temtok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.tokoo);
                ImageView imgtok = (ImageView) myDialog.findViewById(R.id.tokogif);
                ImageView tok_close = (ImageView) myDialog.findViewById(R.id.tokoclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.toko)
                        //PENGATURAN CACHE
                        .into(imgtok);
                tok_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView temwar = (ImageView) findViewById(R.id.warung);
        temwar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tempat.this);
                myDialog.setContentView(R.layout.warungg);
                ImageView imgwar = (ImageView) myDialog.findViewById(R.id.warunggif);
                ImageView war_close = (ImageView) myDialog.findViewById(R.id.warungclose);
                Glide.with(Tempat.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.warung)
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

        final ImageView tempattclose = (ImageView) findViewById(R.id.tempat_close);
        tempattclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
