package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Hewan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        ImageView hewanj = (ImageView) findViewById(R.id.anjing);
        hewanj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.anjingg);
                ImageView imganj = (ImageView) myDialog.findViewById(R.id.anjinggif);
                ImageView anj_close = (ImageView) myDialog.findViewById(R.id.anjingclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.anjing)
                        //PENGATURAN CACHE
                        .into(imganj);
                anj_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewaya = (ImageView) findViewById(R.id.ayam);
        hewaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.ayamm);
                ImageView imgaya = (ImageView) myDialog.findViewById(R.id.ayamgif);
                ImageView aya_close = (ImageView) myDialog.findViewById(R.id.ayamclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ayam)
                        //PENGATURAN CACHE
                        .into(imgaya);
                aya_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewbab = (ImageView) findViewById(R.id.babi);
        hewbab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.babii);
                ImageView imgbab = (ImageView) myDialog.findViewById(R.id.babigif);
                ImageView bab_close = (ImageView) myDialog.findViewById(R.id.babiclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.babi)
                        //PENGATURAN CACHE
                        .into(imgbab);
                bab_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewbeb = (ImageView) findViewById(R.id.bebek);
        hewbeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.bebekk);
                ImageView imgbeb = (ImageView) myDialog.findViewById(R.id.bebekgif);
                ImageView beb_close = (ImageView) myDialog.findViewById(R.id.bebekclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.bebek)
                        //PENGATURAN CACHE
                        .into(imgbeb);
                beb_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewbuy = (ImageView) findViewById(R.id.buaya);
        hewbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.buayaa);
                ImageView imgbuy = (ImageView) myDialog.findViewById(R.id.buayagif);
                ImageView buy_close = (ImageView) myDialog.findViewById(R.id.buayaclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.buaya)
                        //PENGATURAN CACHE
                        .into(imgbuy);
                buy_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewbur = (ImageView) findViewById(R.id.burung);
        hewbur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.burungg);
                ImageView imgbur = (ImageView) myDialog.findViewById(R.id.burunggif);
                ImageView bur_close = (ImageView) myDialog.findViewById(R.id.burungclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.burung)
                        //PENGATURAN CACHE
                        .into(imgbur);
                bur_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewcac = (ImageView) findViewById(R.id.cacing);
        hewcac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.cacingg);
                ImageView imgcac = (ImageView) myDialog.findViewById(R.id.cacinggif);
                ImageView cac_close = (ImageView) myDialog.findViewById(R.id.cacingclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.cacing)
                        //PENGATURAN CACHE
                        .into(imgcac);
                cac_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewcum = (ImageView) findViewById(R.id.cumi);
        hewcum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.cumii);
                ImageView imgcum = (ImageView) myDialog.findViewById(R.id.cumigif);
                ImageView cum_close = (ImageView) myDialog.findViewById(R.id.cumiclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.cumicumi)
                        //PENGATURAN CACHE
                        .into(imgcum);
                cum_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewgaj = (ImageView) findViewById(R.id.gajah);
        hewgaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.gajahh);
                ImageView imggaj = (ImageView) myDialog.findViewById(R.id.gajahgif);
                ImageView gaj_close = (ImageView) myDialog.findViewById(R.id.gajahclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.gajah)
                        //PENGATURAN CACHE
                        .into(imggaj);
                gaj_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewgur = (ImageView) findViewById(R.id.gurita);
        hewgur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.guritaa);
                ImageView imggur = (ImageView) myDialog.findViewById(R.id.guritagif);
                ImageView gur_close = (ImageView) myDialog.findViewById(R.id.guritaclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.gurita)
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

        ImageView hewhar = (ImageView) findViewById(R.id.harimau);
        hewhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.harimauu);
                ImageView imghar = (ImageView) myDialog.findViewById(R.id.harimaugif);
                ImageView har_close = (ImageView) myDialog.findViewById(R.id.harimauclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.harimau)
                        //PENGATURAN CACHE
                        .into(imghar);
                har_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewika = (ImageView) findViewById(R.id.ikan);
        hewika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.ikann);
                ImageView imgika = (ImageView) myDialog.findViewById(R.id.ikangif);
                ImageView ika_close = (ImageView) myDialog.findViewById(R.id.ikanclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ikan)
                        //PENGATURAN CACHE
                        .into(imgika);
                ika_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewjer = (ImageView) findViewById(R.id.jerapah);
        hewjer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.jerapahh);
                ImageView imgjer = (ImageView) myDialog.findViewById(R.id.jerapahgif);
                ImageView jer_close = (ImageView) myDialog.findViewById(R.id.jerapahclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.jerapah)
                        //PENGATURAN CACHE
                        .into(imgjer);
                jer_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewkam = (ImageView) findViewById(R.id.kambing);
        hewkam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.kambingg);
                ImageView imgkam = (ImageView) myDialog.findViewById(R.id.kambinggif);
                ImageView kam_close = (ImageView) myDialog.findViewById(R.id.kambingclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kambing)
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

        ImageView hewkat = (ImageView) findViewById(R.id.katak);
        hewkat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.katakk);
                ImageView imgkat = (ImageView) myDialog.findViewById(R.id.katakgif);
                ImageView kat_close = (ImageView) myDialog.findViewById(R.id.katakclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.katak)
                        //PENGATURAN CACHE
                        .into(imgkat);
                kat_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewkel = (ImageView) findViewById(R.id.kelinci);
        hewkel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.kelincii);
                ImageView imgkel = (ImageView) myDialog.findViewById(R.id.kelincigif);
                ImageView kel_close = (ImageView) myDialog.findViewById(R.id.kelinciclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kelinci)
                        //PENGATURAN CACHE
                        .into(imgkel);
                kel_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewkuc = (ImageView) findViewById(R.id.kucing);
        hewkuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.kucingg);
                ImageView imgkuc = (ImageView) myDialog.findViewById(R.id.kucinggif);
                ImageView kuc_close = (ImageView) myDialog.findViewById(R.id.kucingclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kucing)
                        //PENGATURAN CACHE
                        .into(imgkuc);
                kuc_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewkud = (ImageView) findViewById(R.id.kuda);
        hewkud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.kudaa);
                ImageView imgkud = (ImageView) myDialog.findViewById(R.id.kudagif);
                ImageView kud_close = (ImageView) myDialog.findViewById(R.id.kudaclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.kuda)
                        //PENGATURAN CACHE
                        .into(imgkud);
                kud_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewmon = (ImageView) findViewById(R.id.monyet);
        hewmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.monyett);
                ImageView imgmon = (ImageView) myDialog.findViewById(R.id.monyetgif);
                ImageView mon_close = (ImageView) myDialog.findViewById(R.id.monyetclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.monyet)
                        //PENGATURAN CACHE
                        .into(imgmon);
                mon_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewnya = (ImageView) findViewById(R.id.nyamuk);
        hewnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.nyamukk);
                ImageView imgnya = (ImageView) myDialog.findViewById(R.id.nyamukgif);
                ImageView nya_close = (ImageView) myDialog.findViewById(R.id.nyamukclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.nyamuk)
                        //PENGATURAN CACHE
                        .into(imgnya);
                nya_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewrus = (ImageView) findViewById(R.id.rusa);
        hewrus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.rusaa);
                ImageView imgrus = (ImageView) myDialog.findViewById(R.id.rusagif);
                ImageView rus_close = (ImageView) myDialog.findViewById(R.id.rusaclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.rusa)
                        //PENGATURAN CACHE
                        .into(imgrus);
                rus_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewsap = (ImageView) findViewById(R.id.sapi);
        hewsap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.sapii);
                ImageView imgsap = (ImageView) myDialog.findViewById(R.id.sapigif);
                ImageView sap_close = (ImageView) myDialog.findViewById(R.id.sapiclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sapi)
                        //PENGATURAN CACHE
                        .into(imgsap);
                sap_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewsin = (ImageView) findViewById(R.id.singa);
        hewsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.singaa);
                ImageView imgsin = (ImageView) myDialog.findViewById(R.id.singagif);
                ImageView sin_close = (ImageView) myDialog.findViewById(R.id.singaclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.singa)
                        //PENGATURAN CACHE
                        .into(imgsin);
                sin_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewtik = (ImageView) findViewById(R.id.tikus);
        hewtik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.babii);
                ImageView imgtik = (ImageView) myDialog.findViewById(R.id.tikusgif);
                ImageView tik_close = (ImageView) myDialog.findViewById(R.id.tikusclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tikus)
                        //PENGATURAN CACHE
                        .into(imgtik);
                tik_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewulr = (ImageView) findViewById(R.id.ular);
        hewulr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.ularr);
                ImageView imgulr = (ImageView) myDialog.findViewById(R.id.ulargif);
                ImageView ulr_close = (ImageView) myDialog.findViewById(R.id.ularclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ular)
                        //PENGATURAN CACHE
                        .into(imgulr);
                ulr_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hewult = (ImageView) findViewById(R.id.ulat);
        hewult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Hewan.this);
                myDialog.setContentView(R.layout.ulatt);
                ImageView imgult = (ImageView) myDialog.findViewById(R.id.babigif);
                ImageView ult_close = (ImageView) myDialog.findViewById(R.id.babiclose);
                Glide.with(Hewan.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ulat)
                        //PENGATURAN CACHE
                        .into(imgult);
                ult_close.setOnClickListener(new View.OnClickListener() {
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
