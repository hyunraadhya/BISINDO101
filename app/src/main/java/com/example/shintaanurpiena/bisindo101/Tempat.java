package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Tempat extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempat);

        adapter = new DialogAdapter(this);

        ImageView temapo = (ImageView) findViewById(R.id.apotek);
        temapo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.apotek);

            }
        });

        ImageView temban = (ImageView) findViewById(R.id.bank);
        temban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bank);
            }
        });

        ImageView temben = (ImageView) findViewById(R.id.bengkel);
        temben.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bengkel);
            }
        });

        ImageView temdes = (ImageView) findViewById(R.id.desa);
        temdes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.desa);
            }
        });

        ImageView temged = (ImageView) findViewById(R.id.gedung);
        temged.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.gedung);
            }
        });

        ImageView temkam = (ImageView) findViewById(R.id.kampung);
        temkam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kampung);
            }
        });

        ImageView temkan = (ImageView) findViewById(R.id.kantor);
        temkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kantor);
            }
        });

        ImageView temlap = (ImageView) findViewById(R.id.lapangan);
        temlap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.lapangan);
            }
        });

        ImageView temmal = (ImageView) findViewById(R.id.mall);
        temmal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.mall);
            }
        });

        ImageView tempas = (ImageView) findViewById(R.id.pasar);
        tempas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.pasar);
            }
        });

        ImageView temrum = (ImageView) findViewById(R.id.rumah);
        temrum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.rumah);
            }
        });

        ImageView temsek = (ImageView) findViewById(R.id.sekolah);
        temsek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sekolah);
            }
        });

        ImageView temtok = (ImageView) findViewById(R.id.toko);
        temtok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.toko);
            }
        });

        ImageView temwar = (ImageView) findViewById(R.id.warung);
        temwar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.warung);
            }
        });

        final ImageView tempattclose = (ImageView) findViewById(R.id.tempat_close);
        tempattclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
