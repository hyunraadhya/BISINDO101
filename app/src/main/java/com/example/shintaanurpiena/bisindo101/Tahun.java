package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Tahun extends AppCompatActivity {

    private DialogAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahun);

        adapter = new DialogAdapter(this);

        ImageView tahninety = (ImageView) findViewById(R.id.ninety);
        tahninety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ninety);

            }
        });

        ImageView tahnineone = (ImageView) findViewById(R.id.nineone);
        tahnineone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.nineone);
            }
        });

        ImageView tahninetwo = (ImageView) findViewById(R.id.ninetwo);
        tahninetwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ninetwo);
            }
        });

        ImageView tahninethree = (ImageView) findViewById(R.id.ninethree);
        tahninethree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ninethree);
            }
        });

        ImageView tahninefour = (ImageView) findViewById(R.id.ninefour);
        tahninefour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ninefour);
            }
        });

        ImageView tahninefive = (ImageView) findViewById(R.id.ninefive);
        tahninefive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ninefive);
            }
        });

        ImageView tahninesix = (ImageView) findViewById(R.id.ninesix);
        tahninesix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ninesix);
            }
        });

        ImageView tahnineeight = (ImageView) findViewById(R.id.nineeight);
        tahnineeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.nineeight);
            }
        });

        ImageView tahninenine = (ImageView) findViewById(R.id.ninenine);
        tahninenine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.ninenine);
            }
        });

        ImageView tahtwoten = (ImageView) findViewById(R.id.twoten);
        tahtwoten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.twoten);
            }
        });

        ImageView tahtwoone = (ImageView) findViewById(R.id.twoone);
        tahtwoone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.twoeleven);
            }
        });

        ImageView tahtwotwo = (ImageView) findViewById(R.id.twotwo);
        tahtwotwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.twotwelve);
            }
        });

        ImageView tahtwothree = (ImageView) findViewById(R.id.twothree);
        tahtwothree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.twothirteen);
            }
        });

        ImageView tahtwofour = (ImageView) findViewById(R.id.twofour);
        tahtwofour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.twofourteen);
            }
        });

        ImageView tahtwofive = (ImageView) findViewById(R.id.twofive);
        tahtwofive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.twofifteen);
            }
        });

        ImageView tahtwosix = (ImageView) findViewById(R.id.twosix);
        tahtwosix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.twosixteen);
            }
        });

        ImageView tahtwoseven = (ImageView) findViewById(R.id.twoseven);
        tahtwoseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.twoseventeen);
            }
        });

        ImageView tahtwoeight = (ImageView) findViewById(R.id.twoeight);
        tahtwoeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.twoeightteen);
            }
        });

        ImageView tahtwonine = (ImageView) findViewById(R.id.twonine);
        tahtwonine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.twonineteen);
            }
        });

        ImageView tahtwotwenty = (ImageView) findViewById(R.id.twotwenty);
        tahtwotwenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setDialog(R.drawable.twotwenty);
            }
        });

        final ImageView tahunclose = (ImageView) findViewById(R.id.tahun_close);
        tahunclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
