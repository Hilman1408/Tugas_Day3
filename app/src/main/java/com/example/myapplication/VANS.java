package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class VANS extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vans); // Mengatur layout ke vans.xml

        // Mengatur onClickListener untuk tombol VANS 1
        ImageView sepatuVansButton = findViewById(R.id.sepatuvansButton);
        sepatuVansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk memulai aktivitas detail
                Intent intent = new Intent(VANS.this, detail.class);
                // Meneruskan data tambahan jika diperlukan
                intent.putExtra("item_id", 1);
                intent.putExtra("item_description", "sepatu ini mempunyai bahan yang bagus dan lentur");
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol VANS 2
        ImageView topiVansButton = findViewById(R.id.topivansButton);
        topiVansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk memulai aktivitas detail
                Intent intent = new Intent(VANS.this, detail.class);
                // Meneruskan data tambahan jika diperlukan
                intent.putExtra("item_id", 2);
                intent.putExtra("item_description", "Deskripsi topi Vans");
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol VANS 3
        ImageView hoodieVansButton = findViewById(R.id.hoodievansButton);
        hoodieVansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk memulai aktivitas detail
                Intent intent = new Intent(VANS.this, detail.class);
                // Meneruskan data tambahan jika diperlukan
                intent.putExtra("item_id", 3);
                intent.putExtra("item_description", "Deskripsi hoodie Vans");
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol VANS 4
        ImageView sepatu2VansButton = findViewById(R.id.sepatu2vansButton);
        sepatu2VansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk memulai aktivitas detail
                Intent intent = new Intent(VANS.this, detail.class);
                // Meneruskan data tambahan jika diperlukan
                intent.putExtra("item_id", 4);
                intent.putExtra("item_description", "Deskripsi sepatu Vans 2");
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol VANS 5
        ImageView bajuVansButton = findViewById(R.id.bajuvansButton);
        bajuVansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk memulai aktivitas detail
                Intent intent = new Intent(VANS.this, detail.class);
                // Meneruskan data tambahan jika diperlukan
                intent.putExtra("item_id", 5);
                intent.putExtra("item_description", "Deskripsi baju Vans");
                startActivity(intent);
            }
        });

    }
}
