package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Warna extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warna);

        adapter = new DialogAdapter(this);

        ImageView warabu = (ImageView) findViewById(R.id.abu);
        warabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.abu);

            }
        });

        ImageView warbir = (ImageView) findViewById(R.id.biru);
        warbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.biru);
            }
        });

        ImageView warcok = (ImageView) findViewById(R.id.coklat);
        warcok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.coklat);
            }
        });

        ImageView warema = (ImageView) findViewById(R.id.emas);
        warema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.emas);
            }
        });

        ImageView warhij = (ImageView) findViewById(R.id.hijau);
        warhij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.hijau);
            }
        });

        ImageView warhit = (ImageView) findViewById(R.id.hitam);
        warhit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.hitam);
            }
        });

        ImageView warkun = (ImageView) findViewById(R.id.kuning);
        warkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kuning);
            }
        });

        ImageView warmer = (ImageView) findViewById(R.id.merah);
        warmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.merah);
            }
        });

        ImageView warore = (ImageView) findViewById(R.id.oren);
        warore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.oranye);
            }
        });

        ImageView warpin = (ImageView) findViewById(R.id.pink);
        warpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.pink);
            }
        });

        ImageView warput = (ImageView) findViewById(R.id.putih);
        warput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.putih);
            }
        });

        ImageView warung = (ImageView) findViewById(R.id.ungu);
        warung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ungu);
            }
        });

        ImageView warwar = (ImageView) findViewById(R.id.warnaa);
        warwar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.warna);
            }
        });

        final ImageView warnaclose = (ImageView) findViewById(R.id.warna_close);
        warnaclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
