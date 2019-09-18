package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Pekerjaan extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pekerjaan);

        adapter = new DialogAdapter(this);

        ImageView pekars = (ImageView) findViewById(R.id.arsitek);
        pekars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.arsitek);

            }
        });

        ImageView pekbup = (ImageView) findViewById(R.id.bupati);
        pekbup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bupati);
            }
        });

        ImageView pekdok = (ImageView) findViewById(R.id.dokter);
        pekdok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.dokter);
            }
        });

        ImageView pekdos = (ImageView) findViewById(R.id.dosen);
        pekdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.dosen);
            }
        });

        ImageView pekgur = (ImageView) findViewById(R.id.guru);
        pekgur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.guru);
            }
        });

        ImageView pekpem = (ImageView) findViewById(R.id.pembantu);
        pekpem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.pembantu);
            }
        });

        ImageView pekper = (ImageView) findViewById(R.id.perawat);
        pekper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.perawat);
            }
        });

        ImageView pekpol = (ImageView) findViewById(R.id.polisi);
        pekpol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.polisi);
            }
        });

        ImageView pekpre = (ImageView) findViewById(R.id.presiden);
        pekpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.presiden);
            }
        });

        ImageView peksat = (ImageView) findViewById(R.id.satpam);
        peksat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.satpam);
            }
        });

        ImageView pekten = (ImageView) findViewById(R.id.tentara);
        pekten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tentara);
            }
        });

        ImageView pekwal = (ImageView) findViewById(R.id.walikota);
        pekwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.walikota);
            }
        });

        final ImageView pekerjaanclose = (ImageView) findViewById(R.id.pekerjaan_close);
        pekerjaanclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
