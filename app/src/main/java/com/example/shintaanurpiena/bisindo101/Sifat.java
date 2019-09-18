package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Sifat extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifat);

        adapter = new DialogAdapter(this);

        ImageView sifbah = (ImageView) findViewById(R.id.bahagia);
        sifbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bahagia);

            }
        });

        ImageView sifbai = (ImageView) findViewById(R.id.baik);
        sifbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.baik);
            }
        });

        ImageView sifbod = (ImageView) findViewById(R.id.bodoh);
        sifbod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bodoh);
            }
        });

        ImageView sifcem = (ImageView) findViewById(R.id.cemburu);
        sifcem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.cemburu);
            }
        });

        ImageView sifdia = (ImageView) findViewById(R.id.diam);
        sifdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.diam);
            }
        });

        ImageView sifemo = (ImageView) findViewById(R.id.emosi);
        sifemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.emosi);
            }
        });


        ImageView sifjah = (ImageView) findViewById(R.id.jahat);
        sifjah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.jahat);
            }
        });

        ImageView sifkal = (ImageView) findViewById(R.id.kalah);
        sifkal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kalah);
            }
        });

        ImageView sifmar = (ImageView) findViewById(R.id.marah);
        sifmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.marah);
            }
        });

        ImageView sifmen = (ImageView) findViewById(R.id.menang);
        sifmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.menang);
            }
        });

        ImageView sifpen = (ImageView) findViewById(R.id.pengecut);
        sifpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.pengecut);
            }
        });

        ImageView sifpin = (ImageView) findViewById(R.id.pintar);
        sifpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.pintar);
            }
        });

        ImageView sifram = (ImageView) findViewById(R.id.ramah);
        sifram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ramah);
            }
        });

        ImageView sifsed = (ImageView) findViewById(R.id.sedih);
        sifsed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sedih);
            }
        });

        ImageView sifsem = (ImageView) findViewById(R.id.semangat);
        sifsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.semangat);
            }
        });

        ImageView sifsen = (ImageView) findViewById(R.id.senang);
        sifsen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.senang);
            }
        });

        final ImageView sifatclose = (ImageView) findViewById(R.id.sifat_close);
        sifatclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}