package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Uang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uang);

        ImageView uansatr = (ImageView) findViewById(R.id.seribu);
        uansatr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.seribuu);
                ImageView imgsatr = (ImageView) myDialog.findViewById(R.id.seribugif);
                ImageView satr_close = (ImageView) myDialog.findViewById(R.id.seribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.seribu)
                        //PENGATURAN CACHE
                        .into(imgsatr);
                satr_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uandua = (ImageView) findViewById(R.id.duaribu);
        uandua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.duaribuu);
                ImageView imgdua = (ImageView) myDialog.findViewById(R.id.duaribugif);
                ImageView dua_close = (ImageView) myDialog.findViewById(R.id.duaribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.dua_ribu)
                        //PENGATURAN CACHE
                        .into(imgdua);
                dua_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uantig = (ImageView) findViewById(R.id.tigaribu);
        uantig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.tigaribuu);
                ImageView imgtig = (ImageView) myDialog.findViewById(R.id.tigaribugif);
                ImageView tig_close = (ImageView) myDialog.findViewById(R.id.tigaribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tiga_ribu)
                        //PENGATURAN CACHE
                        .into(imgtig);
                tig_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uanemp = (ImageView) findViewById(R.id.empatribu);
        uanemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.empatribuu);
                ImageView imgemp = (ImageView) myDialog.findViewById(R.id.empatribugif);
                ImageView emp_close = (ImageView) myDialog.findViewById(R.id.empatribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.empat_ribu)
                        //PENGATURAN CACHE
                        .into(imgemp);
                emp_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uanlim = (ImageView) findViewById(R.id.limaribu);
        uanlim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.limaribuu);
                ImageView imglim = (ImageView) myDialog.findViewById(R.id.limaribugif);
                ImageView lim_close = (ImageView) myDialog.findViewById(R.id.limaribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.lima_ribu)
                        //PENGATURAN CACHE
                        .into(imglim);
                lim_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uanena = (ImageView) findViewById(R.id.enamribu);
        uanena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.enamribuu);
                ImageView imgena = (ImageView) myDialog.findViewById(R.id.enamribugif);
                ImageView ena_close = (ImageView) myDialog.findViewById(R.id.enamribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.enam_ribu)
                        //PENGATURAN CACHE
                        .into(imgena);
                ena_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uantuj = (ImageView) findViewById(R.id.tujuhribu);
        uantuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.tujuhribuu);
                ImageView imgtuj = (ImageView) myDialog.findViewById(R.id.tujuhribugif);
                ImageView tuj_close = (ImageView) myDialog.findViewById(R.id.tujuhribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tujuh_ribu)
                        //PENGATURAN CACHE
                        .into(imgtuj);
                tuj_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uandel = (ImageView) findViewById(R.id.delapanribu);
        uandel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.delapanribuu);
                ImageView imgdel = (ImageView) myDialog.findViewById(R.id.delapanribugif);
                ImageView del_close = (ImageView) myDialog.findViewById(R.id.delapanribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.delapan_ribu)
                        //PENGATURAN CACHE
                        .into(imgdel);
                del_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uansem = (ImageView) findViewById(R.id.sembilanribu);
        uansem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.sembilanribuu);
                ImageView imgsem = (ImageView) myDialog.findViewById(R.id.sembilanribugif);
                ImageView sem_close = (ImageView) myDialog.findViewById(R.id.sembilanribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sembilan_ribu)
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

        ImageView uansep = (ImageView) findViewById(R.id.sepuluhribu);
        uansep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.sepuluribuu);
                ImageView imgsep = (ImageView) myDialog.findViewById(R.id.sepuluhribugif);
                ImageView sep_close = (ImageView) myDialog.findViewById(R.id.sepuluhribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sepuluh_ribu)
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

        ImageView uandup = (ImageView) findViewById(R.id.duapribu);
        uandup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.duapribuu);
                ImageView imgdup = (ImageView) myDialog.findViewById(R.id.duapribugif);
                ImageView dup_close = (ImageView) myDialog.findViewById(R.id.duapribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.duapuluh_ribu)
                        //PENGATURAN CACHE
                        .into(imgdup);
                dup_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uantip = (ImageView) findViewById(R.id.tigapribu);
        uantip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.tigapribuu);
                ImageView imgtip = (ImageView) myDialog.findViewById(R.id.tigapribugif);
                ImageView tip_close = (ImageView) myDialog.findViewById(R.id.tigapribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tigapuluh_ribu)
                        //PENGATURAN CACHE
                        .into(imgtip);
                tip_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uanempp = (ImageView) findViewById(R.id.empatpribu);
        uanempp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.empatribuu);
                ImageView imgempp = (ImageView) myDialog.findViewById(R.id.empatpribugif);
                ImageView empp_close = (ImageView) myDialog.findViewById(R.id.empatpribuclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.empatpuluh_ribu)
                        //PENGATURAN CACHE
                        .into(imgempp);
                empp_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uansatj = (ImageView) findViewById(R.id.satuj);
        uansatj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.satujj);
                ImageView imgsatj = (ImageView) myDialog.findViewById(R.id.satujgif);
                ImageView satj_close = (ImageView) myDialog.findViewById(R.id.satujclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.satu_juta)
                        //PENGATURAN CACHE
                        .into(imgsatj);
                satj_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uansatm = (ImageView) findViewById(R.id.satum);
        uansatm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.satumm);
                ImageView imgsatm = (ImageView) myDialog.findViewById(R.id.satumgif);
                ImageView satm_close = (ImageView) myDialog.findViewById(R.id.satumclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.satu_miliar)
                        //PENGATURAN CACHE
                        .into(imgsatm);
                satm_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });ImageView uansatt = (ImageView) findViewById(R.id.satut);
        uansatt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.satutt);
                ImageView imgsatt = (ImageView) myDialog.findViewById(R.id.satutgif);
                ImageView satt_close = (ImageView) myDialog.findViewById(R.id.satutclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.satu_triliun)
                        //PENGATURAN CACHE
                        .into(imgsatt);
                satt_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView uanuan = (ImageView) findViewById(R.id.uanggg);
        uanuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Uang.this);
                myDialog.setContentView(R.layout.uanggg);
                ImageView imguann = (ImageView) myDialog.findViewById(R.id.uanggggif);
                ImageView uann_close = (ImageView) myDialog.findViewById(R.id.uangggclose);
                Glide.with(Uang.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.uang)
                        //PENGATURAN CACHE
                        .into(imguann);
                uann_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        final ImageView uangclose = (ImageView) findViewById(R.id.uang_close);
        uangclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
