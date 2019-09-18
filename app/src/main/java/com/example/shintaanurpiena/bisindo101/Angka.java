package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Angka extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);

        adapter = new DialogAdapter(this );

        ImageView angkasatu = (ImageView) findViewById(R.id.satu);
        angkasatu.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.satu);
            }

        });

        ImageView angkadua = (ImageView) findViewById(R.id.dua);
        angkadua.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.dua);
            }
        });

        ImageView angkatiga = (ImageView) findViewById(R.id.tiga);
        angkatiga.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tiga);
            }
        });

        ImageView angkaempat = (ImageView) findViewById(R.id.empat);
        angkaempat.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.empat);
            }
        });

        ImageView angkalima = (ImageView) findViewById(R.id.lima);
        angkalima.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.lima);
            }
        });

        ImageView angkaenam = (ImageView) findViewById(R.id.enam);
        angkaenam.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.enam);
            }
        });

        ImageView angkatujuh = (ImageView) findViewById(R.id.tujuh);
        angkatujuh.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tujuh);
            }
        });

        ImageView angkadelapan = (ImageView) findViewById(R.id.delapan);
        angkadelapan.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.delapan);
            }
        });

        ImageView angkasembilan = (ImageView) findViewById(R.id.sembilan);
        angkasembilan.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sembilan);
            }
        });

        ImageView angkasepuluh = (ImageView) findViewById(R.id.sepuluh);
        angkasepuluh.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sepuluh);
            }
        });

        ImageView angkasebelas = (ImageView) findViewById(R.id.sebelas);
        angkasebelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sebelas);
            }
        });

        ImageView angkaduabelas = (ImageView) findViewById(R.id.duabelas);
        angkaduabelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.duabelas);
            }
        });

        ImageView angkatigabelas = (ImageView) findViewById(R.id.tigabelas);
        angkatigabelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tigabelas);
            }
        });

        ImageView angkaempatbelas = (ImageView) findViewById(R.id.empatbelas);
        angkaempatbelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.empatbelas);
            }
        });

        ImageView angkalimabelas = (ImageView) findViewById(R.id.limabelas);
        angkalimabelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.limabelas);
            }
        });

        ImageView angkaenambelas = (ImageView) findViewById(R.id.enambelas);
        angkaenambelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.enambelas);
            }
        });

        ImageView angkatujuhbelas = (ImageView) findViewById(R.id.tujuhbelas);
        angkatujuhbelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tujuhbelas);
            }
        });

        ImageView angkadelapanbelas = (ImageView) findViewById(R.id.delapanbelas);
        angkadelapanbelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.delapanbelas);
            }
        });

        ImageView angkasembilanbelas = (ImageView) findViewById(R.id.sembilanbelas);
        angkasembilanbelas.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sembilanbelas);
            }
        });

        ImageView angkaduapuluh = (ImageView) findViewById(R.id.duapuluh);
        angkaduapuluh.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.duapuluh);
            }
        });

        ImageView angkaaa = (ImageView) findViewById(R.id.angkaa);
        angkaaa.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.angka);
            }
        });

        final ImageView angkaclose = (ImageView) findViewById(R.id.angka_close);
        angkaclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
