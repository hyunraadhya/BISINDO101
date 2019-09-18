package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Hari extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hari);

        adapter = new DialogAdapter(this);

        ImageView harsen = (ImageView) findViewById(R.id.senin);
        harsen.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.senin);

            }
        });

        ImageView harsel = (ImageView) findViewById(R.id.selasa);
        harsel.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.selasa);
            }
        });

        ImageView harrab = (ImageView) findViewById(R.id.rabu);
        harrab.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.rabu);
            }
        });

        ImageView harkam = (ImageView) findViewById(R.id.kamis);
        harkam.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kamis);
            }
        });

        ImageView harjum = (ImageView) findViewById(R.id.jumat);
        harjum.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.jumat);
            }
        });

        ImageView harsab = (ImageView) findViewById(R.id.sabtu);
        harsab.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sabtu);
            }
        });

        ImageView harmin = (ImageView) findViewById(R.id.minggu);
        harmin.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.minggu);
            }
        });

        final ImageView hariclose = (ImageView) findViewById(R.id.hari_close);
        hariclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
