package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Kota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kota);

        ImageView kotace = (ImageView) findViewById(R.id.aceh);
        kotace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.acehh);
                ImageView imgace = (ImageView) myDialog.findViewById(R.id.acehgif);
                ImageView ace_close = (ImageView) myDialog.findViewById(R.id.acehclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.aceh)
                        //PENGATURAN CACHE
                        .into(imgace);
                ace_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotbal = (ImageView) findViewById(R.id.bali);
        kotbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.balii);
                ImageView imgbal = (ImageView) myDialog.findViewById(R.id.baligif);
                ImageView bal_close = (ImageView) myDialog.findViewById(R.id.baliclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bali)
                        //PENGATURAN CACHE
                        .into(imgbal);
                bal_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotban = (ImageView) findViewById(R.id.bandung);
        kotban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.bandungg);
                ImageView imgban = (ImageView) myDialog.findViewById(R.id.bandunggif);
                ImageView ban_close = (ImageView) myDialog.findViewById(R.id.bandungclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bandung)
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

        ImageView kotbay = (ImageView) findViewById(R.id.banyuwangi);
        kotbay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.banyuwangii);
                ImageView imgbay = (ImageView) myDialog.findViewById(R.id.banyuwangigif);
                ImageView bay_close = (ImageView) myDialog.findViewById(R.id.banyuwangiclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.banyuwangi)
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

        ImageView kotbek = (ImageView) findViewById(R.id.bekasi);
        kotbek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.bekasii);
                ImageView imgbek = (ImageView) myDialog.findViewById(R.id.bekasigif);
                ImageView bek_close = (ImageView) myDialog.findViewById(R.id.bekasiclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bekasi)
                        //PENGATURAN CACHE
                        .into(imgbek);
                bek_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotdep = (ImageView) findViewById(R.id.depok);
        kotdep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.depokk);
                ImageView imgdep = (ImageView) myDialog.findViewById(R.id.depokgif);
                ImageView dep_close = (ImageView) myDialog.findViewById(R.id.depokclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.depok)
                        //PENGATURAN CACHE
                        .into(imgdep);
                dep_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotjak = (ImageView) findViewById(R.id.jakarta);
        kotjak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.jakartaa);
                ImageView imgjak = (ImageView) myDialog.findViewById(R.id.jakartagif);
                ImageView jak_close = (ImageView) myDialog.findViewById(R.id.jakartaclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.jakarta)
                        //PENGATURAN CACHE
                        .into(imgjak);
                jak_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotjam = (ImageView) findViewById(R.id.jambi);
        kotjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.jambii);
                ImageView imgjam = (ImageView) myDialog.findViewById(R.id.jambigif);
                ImageView jam_close = (ImageView) myDialog.findViewById(R.id.jambiclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.jambi)
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

        ImageView kotkar = (ImageView) findViewById(R.id.karanganyar);
        kotkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.karanganyarr);
                ImageView imgkar = (ImageView) myDialog.findViewById(R.id.karanganyargif);
                ImageView kar_close = (ImageView) myDialog.findViewById(R.id.karanganyarclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.karanganyar)
                        //PENGATURAN CACHE
                        .into(imgkar);
                kar_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotkla = (ImageView) findViewById(R.id.klaten);
        kotkla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.klatenn);
                ImageView imgkla = (ImageView) myDialog.findViewById(R.id.klatengif);
                ImageView kla_close = (ImageView) myDialog.findViewById(R.id.klatenclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.klaten)
                        //PENGATURAN CACHE
                        .into(imgkla);
                kla_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotlam = (ImageView) findViewById(R.id.lampung);
        kotlam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.lampungg);
                ImageView imglam = (ImageView) myDialog.findViewById(R.id.lampunggif);
                ImageView lam_close = (ImageView) myDialog.findViewById(R.id.lampungclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.lampung)
                        //PENGATURAN CACHE
                        .into(imglam);
                lam_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotlom = (ImageView) findViewById(R.id.lombok);
        kotlom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.lombokk);
                ImageView imglom = (ImageView) myDialog.findViewById(R.id.lombokgif);
                ImageView lom_close = (ImageView) myDialog.findViewById(R.id.lombokclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.lombok)
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

        ImageView kotmak = (ImageView) findViewById(R.id.makassar);
        kotmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.makassarr);
                ImageView imgmak = (ImageView) myDialog.findViewById(R.id.makassargif);
                ImageView mak_close = (ImageView) myDialog.findViewById(R.id.makassarclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.makassar)
                        //PENGATURAN CACHE
                        .into(imgmak);
                mak_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotman = (ImageView) findViewById(R.id.manado);
        kotman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.manadoo);
                ImageView imgman = (ImageView) myDialog.findViewById(R.id.manadogif);
                ImageView man_close = (ImageView) myDialog.findViewById(R.id.manadoclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.manado)
                        //PENGATURAN CACHE
                        .into(imgman);
                man_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotsol = (ImageView) findViewById(R.id.solo);
        kotsol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.soloo);
                ImageView imgsol = (ImageView) myDialog.findViewById(R.id.sologif);
                ImageView sol_close = (ImageView) myDialog.findViewById(R.id.soloclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.solo)
                        //PENGATURAN CACHE
                        .into(imgsol);
                sol_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotsra = (ImageView) findViewById(R.id.sragen);
        kotsra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.sragenn);
                ImageView imgsra = (ImageView) myDialog.findViewById(R.id.sragengif);
                ImageView sra_close = (ImageView) myDialog.findViewById(R.id.sragenclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sragen)
                        //PENGATURAN CACHE
                        .into(imgsra);
                sra_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotsuk = (ImageView) findViewById(R.id.sukoharjo);
        kotsuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.sukoharjoo);
                ImageView imgsuk = (ImageView) myDialog.findViewById(R.id.sukoharjogif);
                ImageView suk_close = (ImageView) myDialog.findViewById(R.id.sukoharjoclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sukoharjo)
                        //PENGATURAN CACHE
                        .into(imgsuk);
                suk_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotwon = (ImageView) findViewById(R.id.wonogiri);
        kotwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.wonogirii);
                ImageView imgwon = (ImageView) myDialog.findViewById(R.id.wonogirigif);
                ImageView won_close = (ImageView) myDialog.findViewById(R.id.wonogiriclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.wonogiri)
                        //PENGATURAN CACHE
                        .into(imgwon);
                won_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView kotyog = (ImageView) findViewById(R.id.yogyakarta);
        kotyog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Kota.this);
                myDialog.setContentView(R.layout.yogyakartaa);
                ImageView imgyog = (ImageView) myDialog.findViewById(R.id.yogyakartagif);
                ImageView yog_close = (ImageView) myDialog.findViewById(R.id.yogyakartaclose);
                Glide.with(Kota.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.yogyakarta)
                        //PENGATURAN CACHE
                        .into(imgyog);
                yog_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        final ImageView kotaclose = (ImageView) findViewById(R.id.kota_close);
        kotaclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
