package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NIKE extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nike); // Mengatur layout ke activity_nike.xml

        // Mengatur onClickListener untuk tombol NIKE 1
        ImageView sendalnikeButton1 = findViewById(R.id.sendalnikeButton1);
        sendalnikeButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk memulai aktivitas detail
                Intent intent = new Intent(NIKE.this, detail.class);
                // Meneruskan data tambahan jika diperlukan
                intent.putExtra("item_id", 1);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol NIKE 2
        ImageView sendalnikeButton2 = findViewById(R.id.sendalnikeButton2);
        sendalnikeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NIKE.this, detail.class);
                intent.putExtra("item_id", 2);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol NIKE 3
        ImageView sendatnikeButton3 = findViewById(R.id.sendalnikeButton3);
        sendatnikeButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NIKE.this, detail.class);
                intent.putExtra("item_id", 3);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol NIKE 4
        ImageView sepatunikeButton4 = findViewById(R.id.sepatunikeButton4);
        sepatunikeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NIKE.this, detail.class);
                intent.putExtra("item_id", 4);
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol NIKE 5
        ImageView sepatunikeButton5 = findViewById(R.id.sepatunikeButton5);
        sepatunikeButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NIKE.this, detail.class);
                intent.putExtra("item_id", 5);
                startActivity(intent);
            }
        });

    }
}
