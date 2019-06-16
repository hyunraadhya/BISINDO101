package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Huruf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf);

        ImageView hurufa = (ImageView) findViewById(R.id.a);
        hurufa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.aa);
                ImageView imga = (ImageView) myDialog.findViewById(R.id.agif);
                ImageView a_close = (ImageView) myDialog.findViewById(R.id.aclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.a)
                        //PENGATURAN CACHE
                        .into(imga);
                a_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();

            }
        });

        ImageView hurufb = (ImageView) findViewById(R.id.b);
        hurufb.setOnClickListener (new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final Dialog myDialog = new Dialog(Huruf.this);
            myDialog.setContentView(R.layout.bb);
            ImageView imgb = (ImageView) myDialog.findViewById(R.id.bgif);
            ImageView b_close = (ImageView) myDialog.findViewById(R.id.bclose);
            Glide.with(Huruf.this)
                    // LOAD URL DARI LOKAL DRAWABLE
                    .load(R.drawable.b)
                    //PENGATURAN CACHE
                    .into(imgb);
            b_close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myDialog.dismiss();
                }
            });

            myDialog.show();
        }
    });

        ImageView hurufc = (ImageView) findViewById(R.id.c);
        hurufc.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.cc);
                ImageView imgc = (ImageView) myDialog.findViewById(R.id.cgif);
                ImageView c_close = (ImageView) myDialog.findViewById(R.id.cclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.c)
                        //PENGATURAN CACHE
                        .into(imgc);
                c_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufd = (ImageView) findViewById(R.id.d);
        hurufd.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.dd);
                ImageView imgd = (ImageView) myDialog.findViewById(R.id.dgif);
                ImageView d_close = (ImageView) myDialog.findViewById(R.id.dclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.d)
                        //PENGATURAN CACHE
                        .into(imgd);
                d_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufe = (ImageView) findViewById(R.id.e);
        hurufe.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.ee);
                ImageView imge = (ImageView) myDialog.findViewById(R.id.egif);
                ImageView e_close = (ImageView) myDialog.findViewById(R.id.eclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.e)
                        //PENGATURAN CACHE
                        .into(imge);
                e_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView huruff = (ImageView) findViewById(R.id.f);
        huruff.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.ff);
                ImageView imgf = (ImageView) myDialog.findViewById(R.id.fgif);
                ImageView f_close = (ImageView) myDialog.findViewById(R.id.fclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.f)
                        //PENGATURAN CACHE
                        .into(imgf);
                f_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufg = (ImageView) findViewById(R.id.g);
        hurufg.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.gg);
                ImageView imgg = (ImageView) myDialog.findViewById(R.id.ggif);
                ImageView g_close = (ImageView) myDialog.findViewById(R.id.gclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.g)
                        //PENGATURAN CACHE
                        .into(imgg);
                g_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufh = (ImageView) findViewById(R.id.h);
        hurufh.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.hh);
                ImageView imgh = (ImageView) myDialog.findViewById(R.id.hgif);
                ImageView h_close = (ImageView) myDialog.findViewById(R.id.hclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.h)
                        //PENGATURAN CACHE
                        .into(imgh);
                h_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufi = (ImageView) findViewById(R.id.i);
        hurufi.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.ii);
                ImageView imgi = (ImageView) myDialog.findViewById(R.id.igif);
                ImageView i_close = (ImageView) myDialog.findViewById(R.id.iclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.i)
                        //PENGATURAN CACHE
                        .into(imgi);
                i_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufj = (ImageView) findViewById(R.id.j);
        hurufj.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.jj);
                ImageView imgj = (ImageView) myDialog.findViewById(R.id.jgif);
                ImageView j_close = (ImageView) myDialog.findViewById(R.id.jclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.j)
                        //PENGATURAN CACHE
                        .into(imgj);
                j_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufk = (ImageView) findViewById(R.id.k);
        hurufk.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.kk);
                ImageView imgk = (ImageView) myDialog.findViewById(R.id.kgif);
                ImageView k_close = (ImageView) myDialog.findViewById(R.id.kclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.k)
                        //PENGATURAN CACHE
                        .into(imgk);
                k_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufl = (ImageView) findViewById(R.id.l);
        hurufl.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.ll);
                ImageView imgl = (ImageView) myDialog.findViewById(R.id.lgif);
                ImageView l_close = (ImageView) myDialog.findViewById(R.id.lclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.l)
                        //PENGATURAN CACHE
                        .into(imgl);
                l_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufm = (ImageView) findViewById(R.id.m);
        hurufm.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.mm);
                ImageView imgm = (ImageView) myDialog.findViewById(R.id.mgif);
                ImageView m_close = (ImageView) myDialog.findViewById(R.id.mclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.m)
                        //PENGATURAN CACHE
                        .into(imgm);
                m_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufn = (ImageView) findViewById(R.id.n);
        hurufn.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.nn);
                ImageView imgn = (ImageView) myDialog.findViewById(R.id.ngif);
                ImageView n_close = (ImageView) myDialog.findViewById(R.id.nclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.m)
                        //PENGATURAN CACHE
                        .into(imgn);
                n_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufo = (ImageView) findViewById(R.id.o);
        hurufo.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.oo);
                ImageView imgo = (ImageView) myDialog.findViewById(R.id.ogif);
                ImageView o_close = (ImageView) myDialog.findViewById(R.id.oclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.o)
                        //PENGATURAN CACHE
                        .into(imgo);
                o_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufp = (ImageView) findViewById(R.id.p);
        hurufp.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.pp);
                ImageView imgp = (ImageView) myDialog.findViewById(R.id.pgif);
                ImageView p_close = (ImageView) myDialog.findViewById(R.id.pclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.p)
                        //PENGATURAN CACHE
                        .into(imgp);
                p_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufq = (ImageView) findViewById(R.id.q);
        hurufq.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.qq);
                ImageView imgq = (ImageView) myDialog.findViewById(R.id.qgif);
                ImageView q_close = (ImageView) myDialog.findViewById(R.id.qclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.q)
                        //PENGATURAN CACHE
                        .into(imgq);
                q_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufr = (ImageView) findViewById(R.id.r);
        hurufr.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.rr);
                ImageView imgr = (ImageView) myDialog.findViewById(R.id.rgif);
                ImageView r_close = (ImageView) myDialog.findViewById(R.id.rclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.r)
                        //PENGATURAN CACHE
                        .into(imgr);
                r_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufs = (ImageView) findViewById(R.id.s);
        hurufs.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.ss);
                ImageView imgs = (ImageView) myDialog.findViewById(R.id.sgif);
                ImageView s_close = (ImageView) myDialog.findViewById(R.id.sclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.s)
                        //PENGATURAN CACHE
                        .into(imgs);
                s_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView huruft = (ImageView) findViewById(R.id.t);
        huruft.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.tt);
                ImageView imgt = (ImageView) myDialog.findViewById(R.id.tgif);
                ImageView t_close = (ImageView) myDialog.findViewById(R.id.tclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.t)
                        //PENGATURAN CACHE
                        .into(imgt);
                t_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufu = (ImageView) findViewById(R.id.u);
        hurufu.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.uu);
                ImageView imgu = (ImageView) myDialog.findViewById(R.id.ugif);
                ImageView u_close = (ImageView) myDialog.findViewById(R.id.uclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.u)
                        //PENGATURAN CACHE
                        .into(imgu);
                u_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufv = (ImageView) findViewById(R.id.v);
        hurufv.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.vv);
                ImageView imgv = (ImageView) myDialog.findViewById(R.id.vgif);
                ImageView v_close = (ImageView) myDialog.findViewById(R.id.vclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.v)
                        //PENGATURAN CACHE
                        .into(imgv);
                v_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufw = (ImageView) findViewById(R.id.w);
        hurufw.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.ww);
                ImageView imgw = (ImageView) myDialog.findViewById(R.id.wgif);
                ImageView w_close = (ImageView) myDialog.findViewById(R.id.wclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.w)
                        //PENGATURAN CACHE
                        .into(imgw);
                w_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufx = (ImageView) findViewById(R.id.x);
        hurufx.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.xx);
                ImageView imgx = (ImageView) myDialog.findViewById(R.id.xgif);
                ImageView x_close = (ImageView) myDialog.findViewById(R.id.xclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.x)
                        //PENGATURAN CACHE
                        .into(imgx);
                x_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufy = (ImageView) findViewById(R.id.y);
        hurufy.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.yy);
                ImageView imgy = (ImageView) myDialog.findViewById(R.id.ygif);
                ImageView y_close = (ImageView) myDialog.findViewById(R.id.yclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.y)
                        //PENGATURAN CACHE
                        .into(imgy);
                y_close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });

                myDialog.show();
            }
        });

        ImageView hurufz = (ImageView) findViewById(R.id.z);
        hurufz.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog myDialog = new Dialog(Huruf.this);
                myDialog.setContentView(R.layout.zz);
                ImageView imgz = (ImageView) myDialog.findViewById(R.id.zgif);
                ImageView z_close = (ImageView) myDialog.findViewById(R.id.zclose);
                Glide.with(Huruf.this)
                        // LOAD URL DARI LOKAL DRAWABLE
                        .load(R.drawable.z)
                        //PENGATURAN CACHE
                        .into(imgz);
                z_close.setOnClickListener(new View.OnClickListener() {
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







