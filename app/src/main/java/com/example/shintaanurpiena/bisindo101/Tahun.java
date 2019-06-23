package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Tahun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahun);

        ImageView tahnineone = (ImageView) findViewById(R.id.nineone);
        tahnineone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.nineonee);
                ImageView imgone = (ImageView) myDialog.findViewById(R.id.nineonegif);
                ImageView one_close = (ImageView) myDialog.findViewById(R.id.nineoneclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.nineone)
                        //PENGATURAN CACHE
                        .into(imgone);
                one_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahninety = (ImageView) findViewById(R.id.ninety);
        tahninety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.ninetyy);
                ImageView imgninety = (ImageView) myDialog.findViewById(R.id.ninetygif);
                ImageView ninety_close = (ImageView) myDialog.findViewById(R.id.ninetyclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ninety)
                        //PENGATURAN CACHE
                        .into(imgninety);
                ninety_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahninetwo = (ImageView) findViewById(R.id.ninetwo);
        tahninetwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.ninetwoo);
                ImageView imgtwo = (ImageView) myDialog.findViewById(R.id.ninetwogif);
                ImageView two_close = (ImageView) myDialog.findViewById(R.id.ninetwoclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ninetwo)
                        //PENGATURAN CACHE
                        .into(imgtwo);
                two_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahninethree = (ImageView) findViewById(R.id.ninethree);
        tahninethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.ninethree);
                ImageView imgthree = (ImageView) myDialog.findViewById(R.id.ninethreegif);
                ImageView three_close = (ImageView) myDialog.findViewById(R.id.ninethreeclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ninethree)
                        //PENGATURAN CACHE
                        .into(imgthree);
                three_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahninefour = (ImageView) findViewById(R.id.ninefour);
        tahninefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.ninefourr);
                ImageView imgfour = (ImageView) myDialog.findViewById(R.id.ninefourgif);
                ImageView four_close = (ImageView) myDialog.findViewById(R.id.ninefourclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ninefour)
                        //PENGATURAN CACHE
                        .into(imgfour);
                four_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahninefive = (ImageView) findViewById(R.id.ninefive);
        tahninefive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.ninefivee);
                ImageView imgfive = (ImageView) myDialog.findViewById(R.id.ninefivegif);
                ImageView five_close = (ImageView) myDialog.findViewById(R.id.ninefiveclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ninefive)
                        //PENGATURAN CACHE
                        .into(imgfive);
                five_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahninesix = (ImageView) findViewById(R.id.ninesix);
        tahninesix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.ninesixx);
                ImageView imgsix = (ImageView) myDialog.findViewById(R.id.ninesixgif);
                ImageView six_close = (ImageView) myDialog.findViewById(R.id.ninesixclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ninesix)
                        //PENGATURAN CACHE
                        .into(imgsix);
                six_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahnineeight = (ImageView) findViewById(R.id.nineeight);
        tahnineeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.nineeightt);
                ImageView imgeight = (ImageView) myDialog.findViewById(R.id.nineeightgif);
                ImageView eight_close = (ImageView) myDialog.findViewById(R.id.nineeightclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.nineeight)
                        //PENGATURAN CACHE
                        .into(imgeight);
                eight_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahninenine = (ImageView) findViewById(R.id.ninenine);
        tahninenine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.nineninee);
                ImageView imgnine = (ImageView) myDialog.findViewById(R.id.nineninegif);
                ImageView nine_close = (ImageView) myDialog.findViewById(R.id.ninenineclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.ninenine)
                        //PENGATURAN CACHE
                        .into(imgnine);
                nine_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahtwoten = (ImageView) findViewById(R.id.twoten);
        tahtwoten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.twotenn);
                ImageView imgten = (ImageView) myDialog.findViewById(R.id.twotengif);
                ImageView ten_close = (ImageView) myDialog.findViewById(R.id.twotenclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.twoten)
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

        ImageView tahtwoone = (ImageView) findViewById(R.id.twoone);
        tahtwoone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.twoonee);
                ImageView imgeleven = (ImageView) myDialog.findViewById(R.id.twoonegif);
                ImageView eleven_close = (ImageView) myDialog.findViewById(R.id.twooneclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.twoeleven)
                        //PENGATURAN CACHE
                        .into(imgeleven);
                eleven_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahtwotwo = (ImageView) findViewById(R.id.twotwo);
        tahtwotwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.twotwoo);
                ImageView imgtwelve = (ImageView) myDialog.findViewById(R.id.twotwogif);
                ImageView twelve_close = (ImageView) myDialog.findViewById(R.id.twotwoclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.twotwelve)
                        //PENGATURAN CACHE
                        .into(imgtwelve);
                twelve_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahtwothree = (ImageView) findViewById(R.id.twothree);
        tahtwothree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.twothree);
                ImageView imgthirteen = (ImageView) myDialog.findViewById(R.id.twothreegif);
                ImageView thirteen_close = (ImageView) myDialog.findViewById(R.id.twothreeclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.twothirteen)
                        //PENGATURAN CACHE
                        .into(imgthirteen);
                thirteen_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahtwofour = (ImageView) findViewById(R.id.twofour);
        tahtwofour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.twofourr);
                ImageView imgfourteen = (ImageView) myDialog.findViewById(R.id.twofourgif);
                ImageView fourteen_close = (ImageView) myDialog.findViewById(R.id.twofourclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.twofourteen)
                        //PENGATURAN CACHE
                        .into(imgfourteen);
                fourteen_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahtwofive = (ImageView) findViewById(R.id.twofive);
        tahtwofive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.twofivee);
                ImageView imgfifteen = (ImageView) myDialog.findViewById(R.id.twofivegif);
                ImageView fifteen_close = (ImageView) myDialog.findViewById(R.id.twofiveclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.twofifteen)
                        //PENGATURAN CACHE
                        .into(imgfifteen);
                fifteen_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahtwosix = (ImageView) findViewById(R.id.twosix);
        tahtwosix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.twosixx);
                ImageView imgsixteen = (ImageView) myDialog.findViewById(R.id.twosixgif);
                ImageView sixteen_close = (ImageView) myDialog.findViewById(R.id.twosixclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.twosixteen)
                        //PENGATURAN CACHE
                        .into(imgsixteen);
                sixteen_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahtwoseven = (ImageView) findViewById(R.id.twoseven);
        tahtwoseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.twosevenn);
                ImageView imgseventeen = (ImageView) myDialog.findViewById(R.id.twosevengif);
                ImageView seventeen_close = (ImageView) myDialog.findViewById(R.id.twosevenclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.twoseventeen)
                        //PENGATURAN CACHE
                        .into(imgseventeen);
                seventeen_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahtwoeight = (ImageView) findViewById(R.id.twoeight);
        tahtwoeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.twoeightt);
                ImageView imgeightteen = (ImageView) myDialog.findViewById(R.id.twoeightgif);
                ImageView eightteen_close = (ImageView) myDialog.findViewById(R.id.twoeightclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.twoeightteen)
                        //PENGATURAN CACHE
                        .into(imgeightteen);
                eightteen_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahtwonine = (ImageView) findViewById(R.id.twonine);
        tahtwonine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.twoninee);
                ImageView imgnineteen = (ImageView) myDialog.findViewById(R.id.twoninegif);
                ImageView nineteen_close = (ImageView) myDialog.findViewById(R.id.twonineclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.twonineteen)
                        //PENGATURAN CACHE
                        .into(imgnineteen);
                nineteen_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView tahtwotwenty = (ImageView) findViewById(R.id.twotwenty);
        tahtwotwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Tahun.this);
                myDialog.setContentView(R.layout.twotwentyy);
                ImageView imgtwenty = (ImageView) myDialog.findViewById(R.id.twotwentygif);
                ImageView twenty_close = (ImageView) myDialog.findViewById(R.id.twotwentyclose);
                Glide.with(Tahun.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.twotwenty)
                        //PENGATURAN CACHE
                        .into(imgtwenty);
                twenty_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        final ImageView tahunclose = (ImageView) findViewById(R.id.tahun_close);
        tahunclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
