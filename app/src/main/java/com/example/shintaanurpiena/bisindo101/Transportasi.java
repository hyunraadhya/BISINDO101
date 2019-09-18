package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Transportasi extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportasi);

        adapter = new DialogAdapter(this);

        ImageView trabaj = (ImageView) findViewById(R.id.bajaj);
        trabaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bajaj);

            }
        });

        ImageView trabec = (ImageView) findViewById(R.id.becak);
        trabec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.becak);
            }
        });

        ImageView trabis = (ImageView) findViewById(R.id.bis);
        trabis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.bis);
            }
        });

        ImageView tragoj = (ImageView) findViewById(R.id.gojek);
        tragoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.gojek);
            }
        });

        ImageView tragra = (ImageView) findViewById(R.id.grab);
        tragra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.grab);
            }
        });

        ImageView trahel = (ImageView) findViewById(R.id.helikopter);
        trahel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.helikopter);
            }
        });

        ImageView trakap = (ImageView) findViewById(R.id.kapal);
        trakap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kapal);
            }
        });

        ImageView traker = (ImageView) findViewById(R.id.kereta);
        traker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.kereta);
            }
        });

        ImageView trakrl = (ImageView) findViewById(R.id.krl);
        trakrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.krl);
            }
        });

        ImageView tramob = (ImageView) findViewById(R.id.mobil);
        tramob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.mobil);
            }
        });

        ImageView tramot = (ImageView) findViewById(R.id.motor);
        tramot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.motor);
            }
        });

        ImageView trapes = (ImageView) findViewById(R.id.pesawat);
        trapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.pesawat);
            }
        });

        ImageView trapik = (ImageView) findViewById(R.id.pickup);
        trapik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.pikap);
            }
        });

        ImageView trasep = (ImageView) findViewById(R.id.sepeda);
        trasep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sepeda);
            }
        });

        ImageView tratan = (ImageView) findViewById(R.id.tank);
        tratan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tank);
            }
        });

        ImageView tratru = (ImageView) findViewById(R.id.truk);
        tratru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.truk);
            }
        });

        final ImageView transportasiclose = (ImageView) findViewById(R.id.transportasi_close);
        transportasiclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
