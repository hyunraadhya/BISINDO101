package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Bulan extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulan);

        adapter = new DialogAdapter(this);

        ImageView buljan = (ImageView) findViewById(R.id.januari);
        buljan.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.januari);

            }
        });

        ImageView bulfeb = (ImageView) findViewById(R.id.februari);
        bulfeb.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.februari);
            }
        });

        ImageView bulmar = (ImageView) findViewById(R.id.maret);
        bulmar.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.maret);
            }
        });

        ImageView bulapr = (ImageView) findViewById(R.id.april);
        bulapr.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.april);
            }
        });

        ImageView bulmei = (ImageView) findViewById(R.id.mei);
        bulmei.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.mei);
            }
        });

        ImageView buljun = (ImageView) findViewById(R.id.juni);
        buljun.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.juni);
            }
        });

        ImageView buljul = (ImageView) findViewById(R.id.juli);
        buljul.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.juli);
            }
        });

        ImageView bulags = (ImageView) findViewById(R.id.agustus);
        bulags.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.agustus);
            }
        });

        ImageView bulsep = (ImageView) findViewById(R.id.september);
        bulsep.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.september);
            }
        });

        ImageView bulokt = (ImageView) findViewById(R.id.oktober);
        bulokt.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.oktober);
            }
        });

        ImageView bulnov = (ImageView) findViewById(R.id.november);
        bulnov.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.november);
            }
        });

        ImageView buldes = (ImageView) findViewById(R.id.desember);
        buldes.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.desember);
            }
        });

        final ImageView bulanclose = (ImageView) findViewById(R.id.bulan_close);
        bulanclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
