package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Angka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);

        ImageView angkasatu = (ImageView) findViewById(R.id.satu);
        angkasatu.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.satuu);
                ImageView imgsatu = (ImageView) myDialog.findViewById(R.id.satugif);
                ImageView satu_close = (ImageView) myDialog.findViewById(R.id.satuclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.satu)
                        //PENGATURAN CACHE
                        .into(imgsatu);
                satu_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkadua = (ImageView) findViewById(R.id.dua);
        angkadua.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.duaa);
                ImageView imgdua = (ImageView) myDialog.findViewById(R.id.duagif);
                ImageView dua_close = (ImageView) myDialog.findViewById(R.id.duaclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.dua)
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

        ImageView angkatiga = (ImageView) findViewById(R.id.tiga);
        angkatiga.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.tigaa);
                ImageView imgtiga = (ImageView) myDialog.findViewById(R.id.tigagif);
                ImageView tiga_close = (ImageView) myDialog.findViewById(R.id.tigaclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tiga)
                        //PENGATURAN CACHE
                        .into(imgtiga);
                tiga_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkaempat = (ImageView) findViewById(R.id.empat);
        angkaempat.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.empat);
                ImageView imgempat = (ImageView) myDialog.findViewById(R.id.empatgif);
                ImageView empat_close = (ImageView) myDialog.findViewById(R.id.empatclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.empat)
                        //PENGATURAN CACHE
                        .into(imgempat);
                empat_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkalima = (ImageView) findViewById(R.id.lima);
        angkalima.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.limaa);
                ImageView imglima = (ImageView) myDialog.findViewById(R.id.limagif);
                ImageView lima_close = (ImageView) myDialog.findViewById(R.id.limaclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.lima)
                        //PENGATURAN CACHE
                        .into(imglima);
                lima_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkaenam = (ImageView) findViewById(R.id.enam);
        angkaenam.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.enamm);
                ImageView imgenam = (ImageView) myDialog.findViewById(R.id.enamgif);
                ImageView enam_close = (ImageView) myDialog.findViewById(R.id.enamclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.enam)
                        //PENGATURAN CACHE
                        .into(imgenam);
                enam_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkatujuh = (ImageView) findViewById(R.id.tujuh);
        angkatujuh.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.tujuhh);
                ImageView imgtujuh = (ImageView) myDialog.findViewById(R.id.tujuhgif);
                ImageView tujuh_close = (ImageView) myDialog.findViewById(R.id.tujuhclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tujuh)
                        //PENGATURAN CACHE
                        .into(imgtujuh);
                tujuh_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkadelapan = (ImageView) findViewById(R.id.delapan);
        angkadelapan.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.delapann);
                ImageView imgdelapan = (ImageView) myDialog.findViewById(R.id.delapangif);
                ImageView delapan_close = (ImageView) myDialog.findViewById(R.id.delapanclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.delapan)
                        //PENGATURAN CACHE
                        .into(imgdelapan);
                delapan_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkasembilan = (ImageView) findViewById(R.id.sembilan);
        angkasembilan.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.sembilann);
                ImageView imgsembilan = (ImageView) myDialog.findViewById(R.id.sembilangif);
                ImageView sembilan_close = (ImageView) myDialog.findViewById(R.id.sembilanclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sembilan)
                        //PENGATURAN CACHE
                        .into(imgsembilan);
                sembilan_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkasepuluh = (ImageView) findViewById(R.id.sepuluh);
        angkasepuluh.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.sepuluhh);
                ImageView imgsepuluh = (ImageView) myDialog.findViewById(R.id.sepuluhgif);
                ImageView sepuluh_close = (ImageView) myDialog.findViewById(R.id.sepuluhclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sepuluh)
                        //PENGATURAN CACHE
                        .into(imgsepuluh);
                sepuluh_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkasebelas = (ImageView) findViewById(R.id.sebelas);
        angkasebelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.sebelass);
                ImageView imgsebelas = (ImageView) myDialog.findViewById(R.id.sebelasgif);
                ImageView sebelas_close = (ImageView) myDialog.findViewById(R.id.sebelasclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sebelas)
                        //PENGATURAN CACHE
                        .into(imgsebelas);
                sebelas_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkaduabelas = (ImageView) findViewById(R.id.duabelas);
        angkaduabelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.duabelass);
                ImageView imgduabelas = (ImageView) myDialog.findViewById(R.id.duabelasgif);
                ImageView duabelas_close = (ImageView) myDialog.findViewById(R.id.duabelasclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.duabelas)
                        //PENGATURAN CACHE
                        .into(imgduabelas);
                duabelas_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkatigabelas = (ImageView) findViewById(R.id.tigabelas);
        angkatigabelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.tigabelass);
                ImageView imgtigabelas = (ImageView) myDialog.findViewById(R.id.tigabelasgif);
                ImageView tigabelas_close = (ImageView) myDialog.findViewById(R.id.tigabelasclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tigabelas)
                        //PENGATURAN CACHE
                        .into(imgtigabelas);
                tigabelas_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkaempatbelas = (ImageView) findViewById(R.id.empatbelas);
        angkaempatbelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.empatbelass);
                ImageView imgempatbelas = (ImageView) myDialog.findViewById(R.id.empatbelasgif);
                ImageView empatbelas_close = (ImageView) myDialog.findViewById(R.id.empatbelasclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.empatbelas)
                        //PENGATURAN CACHE
                        .into(imgempatbelas);
                empatbelas_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkalimabelas = (ImageView) findViewById(R.id.limabelas);
        angkalimabelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.limabelass);
                ImageView imglimabelas = (ImageView) myDialog.findViewById(R.id.limabelasgif);
                ImageView limabelas_close = (ImageView) myDialog.findViewById(R.id.limabelasclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.limabelas)
                        //PENGATURAN CACHE
                        .into(imglimabelas);
                limabelas_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkaenambelas = (ImageView) findViewById(R.id.enambelas);
        angkaenambelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.enambelass);
                ImageView imgenambelas = (ImageView) myDialog.findViewById(R.id.enambelasgif);
                ImageView enambelas_close = (ImageView) myDialog.findViewById(R.id.enambelasclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.enambelas)
                        //PENGATURAN CACHE
                        .into(imgenambelas);
                enambelas_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkatujuhbelas = (ImageView) findViewById(R.id.tujuhbelas);
        angkatujuhbelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.tujuhbelass);
                ImageView imgtujuhbelas = (ImageView) myDialog.findViewById(R.id.tujuhbelasgif);
                ImageView tujuhbelas_close = (ImageView) myDialog.findViewById(R.id.tujuhbelasclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.tujuhbelas)
                        //PENGATURAN CACHE
                        .into(imgtujuhbelas);
                tujuhbelas_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkadelapanbelas = (ImageView) findViewById(R.id.delapanbelas);
        angkadelapanbelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.delapanbelass);
                ImageView imgdelapanbelas = (ImageView) myDialog.findViewById(R.id.delapanbelasgif);
                ImageView delapanbelas_close = (ImageView) myDialog.findViewById(R.id.delapanbelasclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.delapanbelas)
                        //PENGATURAN CACHE
                        .into(imgdelapanbelas);
                delapanbelas_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkasembilanbelas = (ImageView) findViewById(R.id.sembilanbelas);
        angkasembilanbelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.sembilanbelass);
                ImageView imgsembilanbelas = (ImageView) myDialog.findViewById(R.id.sembilanbelasgif);
                ImageView sembilanbelas_close = (ImageView) myDialog.findViewById(R.id.sembilanbelasclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.sembilanbelas)
                        //PENGATURAN CACHE
                        .into(imgsembilanbelas);
                sembilanbelas_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkaduapuluh = (ImageView) findViewById(R.id.duapuluh);
        angkaduapuluh.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.duapuluhh);
                ImageView imgduapuluh = (ImageView) myDialog.findViewById(R.id.duapuluhgif);
                ImageView sembilanbelas_close = (ImageView) myDialog.findViewById(R.id.duapuluhclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.duapuluh)
                        //PENGATURAN CACHE
                        .into(imgduapuluh);
                sembilanbelas_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView angkaaa = (ImageView) findViewById(R.id.angkaa);
        angkaaa.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Angka.this);
                myDialog.setContentView(R.layout.angkaa);
                ImageView imgangka = (ImageView) myDialog.findViewById(R.id.angkagif);
                ImageView angka_close = (ImageView) myDialog.findViewById(R.id.angkaclose);
                Glide.with(Angka.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.angka)
                        //PENGATURAN CACHE
                        .into(imgangka);
                angka_close.setOnClickListener(new View.OnClickListener() {
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
