package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Waktu extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waktu);

        adapter = new DialogAdapter(this);

        ImageView wakbes = (ImageView) findViewById(R.id.besok);
        wakbes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.besok);

            }
        });

        ImageView wakdul = (ImageView) findViewById(R.id.dulu);
        wakdul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.dulu);
            }
        });

        ImageView wakdet = (ImageView) findViewById(R.id.detik);
        wakdet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.detik);
            }
        });

        ImageView wakjam = (ImageView) findViewById(R.id.jam);
        wakjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.jam);
            }
        });

        ImageView wakkem = (ImageView) findViewById(R.id.kemarin);
        wakkem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kemarin);
            }
        });

        ImageView waklus = (ImageView) findViewById(R.id.lusa);
        waklus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.lusa);
            }
        });

        ImageView wakmal = (ImageView) findViewById(R.id.malam);
        wakmal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.malam);
            }
        });

        ImageView wakmen = (ImageView) findViewById(R.id.menit);
        wakmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.menit);
            }
        });

        ImageView wakpag = (ImageView) findViewById(R.id.pagi);
        wakpag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.pagi);
            }
        });

        ImageView waksia = (ImageView) findViewById(R.id.siang);
        waksia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.siang);
            }
        });

        ImageView waksor = (ImageView) findViewById(R.id.sore);
        waksor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sore);
            }
        });

        ImageView waktad = (ImageView) findViewById(R.id.tadi);
        waktad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tadi);
            }
        });

        final ImageView waktuclose = (ImageView) findViewById(R.id.waktu_close);
        waktuclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
