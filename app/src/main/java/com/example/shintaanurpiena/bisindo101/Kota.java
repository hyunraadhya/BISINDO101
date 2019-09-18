package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Kota extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kota);

        adapter = new DialogAdapter(this);

        ImageView kotace = (ImageView) findViewById(R.id.aceh);
        kotace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.aceh);

            }
        });

        ImageView kotbal = (ImageView) findViewById(R.id.bali);
        kotbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bali);
            }
        });

        ImageView kotban = (ImageView) findViewById(R.id.bandung);
        kotban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bandung);
            }
        });

        ImageView kotbay = (ImageView) findViewById(R.id.banyuwangi);
        kotbay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.banyuwangi);
            }
        });

        ImageView kotbek = (ImageView) findViewById(R.id.bekasi);
        kotbek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bekasi);
            }
        });

        ImageView kotdep = (ImageView) findViewById(R.id.depok);
        kotdep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.depok);
            }
        });

        ImageView kotjak = (ImageView) findViewById(R.id.jakarta);
        kotjak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.jakarta);
            }
        });

        ImageView kotjam = (ImageView) findViewById(R.id.jambi);
        kotjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.jambi);
            }
        });

        ImageView kotkar = (ImageView) findViewById(R.id.karanganyar);
        kotkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.karanganyar);
            }
        });

        ImageView kotkla = (ImageView) findViewById(R.id.klaten);
        kotkla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.klaten);
            }
        });

        ImageView kotlam = (ImageView) findViewById(R.id.lampung);
        kotlam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.lampung);
            }
        });

        ImageView kotlom = (ImageView) findViewById(R.id.lombok);
        kotlom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.lombok);
            }
        });

        ImageView kotmak = (ImageView) findViewById(R.id.makassar);
        kotmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.makassar);
            }
        });

        ImageView kotman = (ImageView) findViewById(R.id.manado);
        kotman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.manado);
            }
        });

        ImageView kotsol = (ImageView) findViewById(R.id.solo);
        kotsol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.solo);
            }
        });

        ImageView kotsra = (ImageView) findViewById(R.id.sragen);
        kotsra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sragen);
            }
        });

        ImageView kotsuk = (ImageView) findViewById(R.id.sukoharjo);
        kotsuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sukoharjo);
            }
        });

        ImageView kotwon = (ImageView) findViewById(R.id.wonogiri);
        kotwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.wonogiri);
            }
        });

        ImageView kotyog = (ImageView) findViewById(R.id.yogyakarta);
        kotyog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.yogyakarta);
            }
        });

        final ImageView kotaclose = (ImageView) findViewById(R.id.kota_close);
        kotaclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
