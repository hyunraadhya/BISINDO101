package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Keluarga extends AppCompatActivity {

    private DialogAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keluarga);

        adapter = new DialogAdapter(this);

        ImageView kelbap = (ImageView) findViewById(R.id.bapak);
        kelbap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bapak);
            }
        });

        ImageView kelibu = (ImageView) findViewById(R.id.ibu);
        kelibu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ibu);
            }
        });

        ImageView kelkek = (ImageView) findViewById(R.id.kakek);
        kelkek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kakek);
            }
        });

        ImageView kelnek = (ImageView) findViewById(R.id.nenek);
        kelnek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.nenek);
            }
        });

        ImageView kellak = (ImageView) findViewById(R.id.laki);
        kellak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.lakilaki);
            }
        });

        ImageView kelper = (ImageView) findViewById(R.id.perempuan);
        kelper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.perempuan);
            }
        });

        ImageView kelank = (ImageView) findViewById(R.id.anak);
        kelank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.anak);
            }
        });

        ImageView kelankk = (ImageView) findViewById(R.id.anakkk);
        kelankk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.anakanak);
            }
        });

        ImageView kelbay = (ImageView) findViewById(R.id.bayi);
        kelbay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bayi);
            }
        });

        final ImageView keluargaclose = (ImageView) findViewById(R.id.keluarga_close);
        keluargaclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
