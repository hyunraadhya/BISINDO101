package com.example.shintaanurpiena.bisindo101;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DialogAdapter {

    Context context;

    public DialogAdapter(Context context) {
        this.context = context;
    }

    public void setDialog(int uri){
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.image_view_layout);
        ImageView img = (ImageView) dialog.findViewById(R.id.imgGif);
        ImageView btnClose = (ImageView) dialog.findViewById(R.id.btnClose);
        Glide.with(context)
                .load(uri)
                .into(img);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
