package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Olahraga extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olahraga);

        adapter = new DialogAdapter(this);

        ImageView olgbad = (ImageView) findViewById(R.id.badminton);
        olgbad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.badminton);

            }
        });

        ImageView olgfit = (ImageView) findViewById(R.id.fitnes);
        olgfit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.fitnes);
            }
        });

        ImageView olgfut = (ImageView) findViewById(R.id.futsal);
        olgfut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.futsal);
            }
        });

        ImageView olglar = (ImageView) findViewById(R.id.lari);
        olglar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.lari);
            }
        });

        ImageView olglom = (ImageView) findViewById(R.id.lompat);
        olglom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.lompat_jauh);
            }
        });

        ImageView olgpan = (ImageView) findViewById(R.id.panah);
        olgpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.panah);
            }
        });

        ImageView olgren = (ImageView) findViewById(R.id.renang);
        olgren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.renang);
            }
        });

        ImageView olgsep = (ImageView) findViewById(R.id.sepak);
        olgsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sepak_bola);
            }
        });

        ImageView olgtem = (ImageView) findViewById(R.id.tembak);
        olgtem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tembak);
            }
        });

        ImageView olgten = (ImageView) findViewById(R.id.tenis);
        olgten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tenis);
            }
        });

        ImageView olgtol = (ImageView) findViewById(R.id.tolak);
        olgtol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tolak_peluru);
            }
        });

        ImageView olgvol = (ImageView) findViewById(R.id.voli);
        olgvol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.voli);
            }
        });

        final ImageView olahragaclose = (ImageView) findViewById(R.id.olahraga_close);
        olahragaclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
