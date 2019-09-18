package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Hewan extends AppCompatActivity {

    private DialogAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        adapter = new DialogAdapter(this);

        ImageView hewanj = (ImageView) findViewById(R.id.anjing);
        hewanj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.anjing);
            }

        });

        ImageView hewaya = (ImageView) findViewById(R.id.ayam);
        hewaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ayam);
            }
        });

        ImageView hewbab = (ImageView) findViewById(R.id.babi);
        hewbab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.babi);
            }
        });

        ImageView hewbeb = (ImageView) findViewById(R.id.bebek);
        hewbeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bebek);
            }
        });

        ImageView hewbuy = (ImageView) findViewById(R.id.buaya);
        hewbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.buaya);
            }
        });

        ImageView hewbur = (ImageView) findViewById(R.id.burung);
        hewbur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.burung);
            }
        });

        ImageView hewgaj = (ImageView) findViewById(R.id.gajah);
        hewgaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.gajah);
            }
        });

        ImageView hewhar = (ImageView) findViewById(R.id.harimau);
        hewhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.harimau);
            }
        });

        ImageView hewika = (ImageView) findViewById(R.id.ikan);
        hewika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ikan);
            }
        });

        ImageView hewjer = (ImageView) findViewById(R.id.jerapah);
        hewjer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.jerapah);
            }
        });

        ImageView hewkam = (ImageView) findViewById(R.id.kambing);
        hewkam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kambing);
            }
        });

        ImageView hewkel = (ImageView) findViewById(R.id.kelinci);
        hewkel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kelinci);
            }
        });

        ImageView hewkuc = (ImageView) findViewById(R.id.kucing);
        hewkuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kucing);
            }
        });

        ImageView hewkud = (ImageView) findViewById(R.id.kuda);
        hewkud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kuda);
            }
        });

        ImageView hewmon = (ImageView) findViewById(R.id.monyet);
        hewmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.monyet);
            }
        });

        ImageView hewnya = (ImageView) findViewById(R.id.nyamuk);
        hewnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.nyamuk);
            }
        });


        ImageView hewsap = (ImageView) findViewById(R.id.sapi);
        hewsap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sapi);
            }
        });

        ImageView hewsin = (ImageView) findViewById(R.id.singa);
        hewsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.singa);
            }
        });

        ImageView hewtik = (ImageView) findViewById(R.id.tikus);
        hewtik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tikus);
            }
        });

        ImageView hewulr = (ImageView) findViewById(R.id.ular);
        hewulr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ular);
            }
        });

        final ImageView hewanclose = (ImageView) findViewById(R.id.hewan_close);
        hewanclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
