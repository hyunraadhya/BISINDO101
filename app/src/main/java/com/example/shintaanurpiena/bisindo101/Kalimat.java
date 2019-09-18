package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Kalimat extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimat);

        adapter = new DialogAdapter(this);

        ImageView kalan = (ImageView) findViewById(R.id.anbuha);
        kalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ultah);

            }
        });

        ImageView kalkot = (ImageView) findViewById(R.id.kotaol);
        kalkot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.pertandingan);
            }
        });

        ImageView kaltra = (ImageView) findViewById(R.id.trawar);
        kaltra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tabrakan);
            }
        });

        ImageView kalkep = (ImageView) findViewById(R.id.kepete);
        kalkep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kerten);
            }
        });

        ImageView kalkote = (ImageView) findViewById(R.id.kote);
        kalkote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.paragon);
            }
        });

        final ImageView kalimatclose = (ImageView) findViewById(R.id.kalimat_close);
        kalimatclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
