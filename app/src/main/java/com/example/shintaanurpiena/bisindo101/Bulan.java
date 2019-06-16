package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Bulan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulan);

        ImageView buljan = (ImageView) findViewById(R.id.januari);
        buljan.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.januarii);
                ImageView imgjan = (ImageView) myDialog.findViewById(R.id.januarigif);
                ImageView jan_close = (ImageView) myDialog.findViewById(R.id.januariclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.januari)
                        //PENGATURAN CACHE
                        .into(imgjan);
                jan_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView bulfeb = (ImageView) findViewById(R.id.februari);
        bulfeb.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.februarii);
                ImageView imgfeb = (ImageView) myDialog.findViewById(R.id.februarigif);
                ImageView feb_close = (ImageView) myDialog.findViewById(R.id.februariclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.februari)
                        //PENGATURAN CACHE
                        .into(imgfeb);
                feb_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView bulmar = (ImageView) findViewById(R.id.maret);
        bulmar.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.marett);
                ImageView imgmar = (ImageView) myDialog.findViewById(R.id.maretgif);
                ImageView mar_close = (ImageView) myDialog.findViewById(R.id.maretclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.maret)
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

        ImageView bulapr = (ImageView) findViewById(R.id.april);
        bulapr.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.aprill);
                ImageView imgapr = (ImageView) myDialog.findViewById(R.id.aprilgif);
                ImageView apr_close = (ImageView) myDialog.findViewById(R.id.aprilclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.april)
                        //PENGATURAN CACHE
                        .into(imgapr);
                apr_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView bulmei = (ImageView) findViewById(R.id.mei);
        bulmei.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.meii);
                ImageView imgmei = (ImageView) myDialog.findViewById(R.id.meigif);
                ImageView mei_close = (ImageView) myDialog.findViewById(R.id.meiclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.mei)
                        //PENGATURAN CACHE
                        .into(imgmei);
                mei_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView buljun = (ImageView) findViewById(R.id.juni);
        buljun.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.junii);
                ImageView imgjun = (ImageView) myDialog.findViewById(R.id.junigif);
                ImageView jun_close = (ImageView) myDialog.findViewById(R.id.juniclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.juni)
                        //PENGATURAN CACHE
                        .into(imgjun);
                jun_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView buljul = (ImageView) findViewById(R.id.juli);
        buljul.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.julii);
                ImageView imgjul = (ImageView) myDialog.findViewById(R.id.juligif);
                ImageView jul_close = (ImageView) myDialog.findViewById(R.id.juliclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.juli)
                        //PENGATURAN CACHE
                        .into(imgjul);
                jul_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView bulags = (ImageView) findViewById(R.id.agustus);
        bulags.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.agustuss);
                ImageView imgags = (ImageView) myDialog.findViewById(R.id.agustusgif);
                ImageView ags_close = (ImageView) myDialog.findViewById(R.id.agustusclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.agustus)
                        //PENGATURAN CACHE
                        .into(imgags);
                ags_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView bulsep = (ImageView) findViewById(R.id.september);
        bulsep.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.septemberr);
                ImageView imgsep = (ImageView) myDialog.findViewById(R.id.septembergif);
                ImageView sep_close = (ImageView) myDialog.findViewById(R.id.septemberclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.september)
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

        ImageView bulokt = (ImageView) findViewById(R.id.oktober);
        bulokt.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.oktoberr);
                ImageView imgokt = (ImageView) myDialog.findViewById(R.id.oktobergif);
                ImageView okt_close = (ImageView) myDialog.findViewById(R.id.oktoberclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.oktober)
                        //PENGATURAN CACHE
                        .into(imgokt);
                okt_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView bulnov = (ImageView) findViewById(R.id.november);
        bulnov.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.novemberr);
                ImageView imgnov = (ImageView) myDialog.findViewById(R.id.novembergif);
                ImageView nov_close = (ImageView) myDialog.findViewById(R.id.novemberclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.november)
                        //PENGATURAN CACHE
                        .into(imgnov);
                nov_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView buldes = (ImageView) findViewById(R.id.desember);
        buldes.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Bulan.this);
                myDialog.setContentView(R.layout.desemberr);
                ImageView imgdes = (ImageView) myDialog.findViewById(R.id.desembergif);
                ImageView des_close = (ImageView) myDialog.findViewById(R.id.desemberclose);
                Glide.with(Bulan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.desember)
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
    }
}
