package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Huruf extends AppCompatActivity {

    //tiap Kategori
    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf);

        adapter = new DialogAdapter(this);

        ImageView hurufa = (ImageView) findViewById(R.id.a);
        hurufa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.a);
            }
        });

        ImageView hurufb = (ImageView) findViewById(R.id.b);
        hurufb.setOnClickListener (new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            adapter.setDialog(R.drawable.b);
        }
    });

        ImageView hurufc = (ImageView) findViewById(R.id.c);
        hurufc.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.c);
            }
        });

        ImageView hurufd = (ImageView) findViewById(R.id.d);
        hurufd.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.d);
            }
        });

        ImageView hurufe = (ImageView) findViewById(R.id.e);
        hurufe.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.e);
            }
        });

        ImageView huruff = (ImageView) findViewById(R.id.f);
        huruff.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.f);
            }
        });

        ImageView hurufg = (ImageView) findViewById(R.id.g);
        hurufg.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.g);
            }
        });

        ImageView hurufh = (ImageView) findViewById(R.id.h);
        hurufh.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.h);
            }
        });

        ImageView hurufi = (ImageView) findViewById(R.id.i);
        hurufi.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.i);
            }
        });

        ImageView hurufj = (ImageView) findViewById(R.id.j);
        hurufj.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.j);
            }
        });

        ImageView hurufk = (ImageView) findViewById(R.id.k);
        hurufk.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.k);
            }
        });

        ImageView hurufl = (ImageView) findViewById(R.id.l);
        hurufl.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.l);
            }
        });

        ImageView hurufm = (ImageView) findViewById(R.id.m);
        hurufm.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.m);
            }
        });

        ImageView hurufn = (ImageView) findViewById(R.id.n);
        hurufn.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.n);
            }
        });

        ImageView hurufo = (ImageView) findViewById(R.id.o);
        hurufo.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.o);
            }
        });

        ImageView hurufp = (ImageView) findViewById(R.id.p);
        hurufp.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.p);
            }
        });

        ImageView hurufq = (ImageView) findViewById(R.id.q);
        hurufq.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.q);
            }
        });

        ImageView hurufr = (ImageView) findViewById(R.id.r);
        hurufr.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.r);
            }
        });

        ImageView hurufs = (ImageView) findViewById(R.id.s);
        hurufs.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.s);
            }
        });

        ImageView huruft = (ImageView) findViewById(R.id.t);
        huruft.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.t);
            }
        });

        ImageView hurufu = (ImageView) findViewById(R.id.u);
        hurufu.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.u);
            }
        });

        ImageView hurufv = (ImageView) findViewById(R.id.v);
        hurufv.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.v);
            }
        });

        ImageView hurufw = (ImageView) findViewById(R.id.w);
        hurufw.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.w);
            }
        });

        ImageView hurufx = (ImageView) findViewById(R.id.x);
        hurufx.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.x);
            }
        });

        ImageView hurufy = (ImageView) findViewById(R.id.y);
        hurufy.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.y);
            }
        });

        ImageView hurufz = (ImageView) findViewById(R.id.z);
        hurufz.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.z);
            }
        });

        final ImageView hurufclose = (ImageView) findViewById(R.id.huruf_close);
        hurufclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }



}







