package com.example.Faza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public TextView textTitle, textDetail;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_wisata);
        textTitle = findViewById(R.id.tv_lang_title);
        Wisata extra = getIntent().getParcelableExtra("objek");
        textTitle.setText(extra.getName());

        imageView = findViewById(R.id.imgphoto);
        imageView.setImageResource(extra.getPhoto());

        textDetail = findViewById(R.id.detail_halaman);
        textDetail.setText(extra.getDetail());
    }
}
