package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Transportasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportasi);

        ImageView trabaj = (ImageView) findViewById(R.id.bajaj);
        trabaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.bajajj);
                ImageView imgbaj = (ImageView) myDialog.findViewById(R.id.bajajgif);
                ImageView baj_close = (ImageView) myDialog.findViewById(R.id.bajajclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bajaj)
                        //PENGATURAN CACHE
                        .into(imgbaj);
                baj_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView trabec = (ImageView) findViewById(R.id.becak);
        trabec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.becakk);
                ImageView imgbec = (ImageView) myDialog.findViewById(R.id.becakgif);
                ImageView bec_close = (ImageView) myDialog.findViewById(R.id.becakclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.becak)
                        //PENGATURAN CACHE
                        .into(imgbec);
                bec_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView trabis = (ImageView) findViewById(R.id.bis);
        trabis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.biss);
                ImageView imgbis = (ImageView) myDialog.findViewById(R.id.bisgif);
                ImageView bis_close = (ImageView) myDialog.findViewById(R.id.bisclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bis)
                        //PENGATURAN CACHE
                        .into(imgbis);
                bis_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tragoj = (ImageView) findViewById(R.id.gojek);
        tragoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.gojekk);
                ImageView imggoj = (ImageView) myDialog.findViewById(R.id.gojekgif);
                ImageView goj_close = (ImageView) myDialog.findViewById(R.id.gojekclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.gojek)
                        //PENGATURAN CACHE
                        .into(imggoj);
                goj_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tragra = (ImageView) findViewById(R.id.grab);
        tragra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.grabb);
                ImageView imggra = (ImageView) myDialog.findViewById(R.id.grabgif);
                ImageView gra_close = (ImageView) myDialog.findViewById(R.id.grabclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.grab)
                        //PENGATURAN CACHE
                        .into(imggra);
                gra_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView trahel = (ImageView) findViewById(R.id.helikopter);
        trahel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.helikopterr);
                ImageView imghel = (ImageView) myDialog.findViewById(R.id.helikoptergif);
                ImageView hel_close = (ImageView) myDialog.findViewById(R.id.helikopterclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.helikopter)
                        //PENGATURAN CACHE
                        .into(imghel);
                hel_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView trakap = (ImageView) findViewById(R.id.kapal);
        trakap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.kapall);
                ImageView imgkap = (ImageView) myDialog.findViewById(R.id.kapalgif);
                ImageView kap_close = (ImageView) myDialog.findViewById(R.id.kapalclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kapal)
                        //PENGATURAN CACHE
                        .into(imgkap);
                kap_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView traker = (ImageView) findViewById(R.id.kereta);
        traker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.keretaa);
                ImageView imgker = (ImageView) myDialog.findViewById(R.id.keretagif);
                ImageView ker_close = (ImageView) myDialog.findViewById(R.id.keretaclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kereta)
                        //PENGATURAN CACHE
                        .into(imgker);
                ker_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView trakrl = (ImageView) findViewById(R.id.krl);
        trakrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.krll);
                ImageView imgkrl = (ImageView) myDialog.findViewById(R.id.krlgif);
                ImageView krl_close = (ImageView) myDialog.findViewById(R.id.krlclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.krl)
                        //PENGATURAN CACHE
                        .into(imgkrl);
                krl_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tramob = (ImageView) findViewById(R.id.mobil);
        tramob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.mobill);
                ImageView imgmob = (ImageView) myDialog.findViewById(R.id.mobilgif);
                ImageView mob_close = (ImageView) myDialog.findViewById(R.id.mobilclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.mobil)
                        //PENGATURAN CACHE
                        .into(imgmob);
                mob_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tramot = (ImageView) findViewById(R.id.motor);
        tramot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.motorr);
                ImageView imgmot = (ImageView) myDialog.findViewById(R.id.motorgif);
                ImageView mot_close = (ImageView) myDialog.findViewById(R.id.motorclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.motor)
                        //PENGATURAN CACHE
                        .into(imgmot);
                mot_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView trapes = (ImageView) findViewById(R.id.pesawat);
        trapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.pesawatt);
                ImageView imgpes = (ImageView) myDialog.findViewById(R.id.pesawatgif);
                ImageView pes_close = (ImageView) myDialog.findViewById(R.id.pesawatclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.pesawat)
                        //PENGATURAN CACHE
                        .into(imgpes);
                pes_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView trapik = (ImageView) findViewById(R.id.pickup);
        trapik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.pickupp);
                ImageView imgpik = (ImageView) myDialog.findViewById(R.id.pickupgif);
                ImageView pik_close = (ImageView) myDialog.findViewById(R.id.pickupclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.pikap)
                        //PENGATURAN CACHE
                        .into(imgpik);
                pik_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView trasep = (ImageView) findViewById(R.id.sepeda);
        trasep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.sepedaa);
                ImageView imgsep = (ImageView) myDialog.findViewById(R.id.sepedagif);
                ImageView sep_close = (ImageView) myDialog.findViewById(R.id.sepedaclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sepeda)
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

        ImageView tratan = (ImageView) findViewById(R.id.tank);
        tratan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.tankk);
                ImageView imgtank = (ImageView) myDialog.findViewById(R.id.tankgif);
                ImageView tank_close = (ImageView) myDialog.findViewById(R.id.tankclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tank)
                        //PENGATURAN CACHE
                        .into(imgtank);
                tank_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tratru = (ImageView) findViewById(R.id.truk);
        tratru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Transportasi.this);
                myDialog.setContentView(R.layout.trukk);
                ImageView imgtru = (ImageView) myDialog.findViewById(R.id.trukgif);
                ImageView tru_close = (ImageView) myDialog.findViewById(R.id.trukclose);
                Glide.with(Transportasi.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.truk)
                        //PENGATURAN CACHE
                        .into(imgtru);
                tru_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        final ImageView transportasiclose = (ImageView) findViewById(R.id.transportasi_close);
        transportasiclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
