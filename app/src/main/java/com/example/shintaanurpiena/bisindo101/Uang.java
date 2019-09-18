package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Uang extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uang);

        adapter = new DialogAdapter(this);

        ImageView uansatr = (ImageView) findViewById(R.id.seribu);
        uansatr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.seribu);

            }
        });

        ImageView uandua = (ImageView) findViewById(R.id.duaribu);
        uandua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.dua_ribu);
            }
        });

        ImageView uantig = (ImageView) findViewById(R.id.tigaribu);
        uantig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tiga_ribu);
            }
        });

        ImageView uanemp = (ImageView) findViewById(R.id.empatribu);
        uanemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.empat_ribu);
            }
        });

        ImageView uanlim = (ImageView) findViewById(R.id.limaribu);
        uanlim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.lima_ribu);
            }
        });

        ImageView uanena = (ImageView) findViewById(R.id.enamribu);
        uanena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.enam_ribu);
            }
        });

        ImageView uantuj = (ImageView) findViewById(R.id.tujuhribu);
        uantuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tujuh_ribu);
            }
        });

        ImageView uandel = (ImageView) findViewById(R.id.delapanribu);
        uandel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.delapan_ribu);
            }
        });

        ImageView uansem = (ImageView) findViewById(R.id.sembilanribu);
        uansem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sembilan_ribu);
            }
        });

        ImageView uansep = (ImageView) findViewById(R.id.sepuluhribu);
        uansep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.sepuluh_ribu);
            }
        });

        ImageView uandup = (ImageView) findViewById(R.id.duapribu);
        uandup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.duapuluh_ribu);
            }
        });

        ImageView uantip = (ImageView) findViewById(R.id.tigapribu);
        uantip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.tigapuluh_ribu);
            }
        });

        ImageView uanempp = (ImageView) findViewById(R.id.empatpribu);
        uanempp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.empatpuluh_ribu);
            }
        });

        ImageView uanlip = (ImageView) findViewById(R.id.limapribu);
        uanlip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.limapuluh_ribu);
            }
        });

        ImageView uansatj = (ImageView) findViewById(R.id.satuj);
        uansatj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.satu_juta);
            }
        });

        ImageView uansatm = (ImageView) findViewById(R.id.satum);
        uansatm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.satu_miliar);
            }
        });

        ImageView uansatt = (ImageView) findViewById(R.id.satut);
        uansatt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.satu_triliun);
            }
        });

        ImageView uanuan = (ImageView) findViewById(R.id.uanggg);
        uanuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.uang);
            }
        });

        final ImageView uangclose = (ImageView) findViewById(R.id.uang_close);
        uangclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
