package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Perkenalan extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkenalan);

        adapter = new DialogAdapter(this);

        ImageView peraku = (ImageView) findViewById(R.id.aku);
        peraku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.aku);
            }
        });

        ImageView perapa = (ImageView) findViewById(R.id.apa);
        perapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.apa);
            }
        });

        ImageView perdia = (ImageView) findViewById(R.id.dia);
        perdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.dia);
            }
        });

        ImageView perdim = (ImageView) findViewById(R.id.dimana);
        perdim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.dimana);
            }
        });

        ImageView perkal = (ImageView) findViewById(R.id.kalian);
        perkal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kalian);
            }
        });

        ImageView perkai = (ImageView) findViewById(R.id.kami);
        perkai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kami);
            }
        });

        ImageView perkau = (ImageView) findViewById(R.id.kamu);
        perkau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kamu);
            }
        });

        ImageView perkit = (ImageView) findViewById(R.id.kita);
        perkit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kita);
            }
        });

        ImageView permer = (ImageView) findViewById(R.id.mereka);
        permer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.mereka);
            }
        });

        ImageView pernam = (ImageView) findViewById(R.id.nama);
        pernam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.nama);
            }
        });

        ImageView perper = (ImageView) findViewById(R.id.perkenalann);
        perper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.perkenalan);
            }
        });

        ImageView persiap = (ImageView) findViewById(R.id.siapa);
        persiap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.siapa);
            }
        });

        final ImageView perkenalanclose = (ImageView) findViewById(R.id.perkenalan_close);
        perkenalanclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
