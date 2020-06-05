package com.example.uasprojectandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static final String namadetail="nama detail";
    public static final String hargadetail="harga detail";
    public static final String deskripsidetail="deskripsi";
    public static final String gambardetail="NULL";
    public TextView tvnamadetail;
    public TextView tvhargadetail;
    public TextView tvdeskripsidetail;
    public ImageView imggambardetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvnamadetail = findViewById( R.id.tv_namadetail );
        tvhargadetail = findViewById( R.id.tv_hargadetail );
        tvdeskripsidetail = findViewById( R.id.tv_deskripsidetail );
        imggambardetail = findViewById( R.id.img_gambardetail );

        String simpanama = getIntent().getStringExtra(namadetail);
        String simpanharga = getIntent().getStringExtra(hargadetail);
        String simpandeskripsi = getIntent().getStringExtra(deskripsidetail);
        String simpangambar = getIntent().getStringExtra(gambardetail);

        tvnamadetail.setText(simpanama);
        tvhargadetail.setText(simpanharga);
        tvdeskripsidetail.setText(simpandeskripsi);
        Glide
                .with(this)
                .load(simpangambar)
                .centerCrop()
                .into(imggambardetail);

    }
}
