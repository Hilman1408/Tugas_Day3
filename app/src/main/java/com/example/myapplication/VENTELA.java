package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class VENTELA extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventela); // Mengatur layout ke ventela.xml

        // Mengatur onClickListener untuk tombol VENTELA 1
        ImageView sepatuventelaButton1 = findViewById(R.id.sepatuventelaButton1);
        sepatuventelaButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk memulai aktivitas detail
                Intent intent = new Intent(VENTELA.this, detail.class);
                // Meneruskan data tambahan jika diperlukan
                intent.putExtra("item_id", 1);
                intent.putExtra("item_description", "Sepatu casual yang nyaman dan serbaguna, biasanya memiliki sol karet, desain sporty, dan tersedia dalam berbagai warna dan motif.");
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol VENTELA 2
        ImageView sepatuventelaButton2 = findViewById(R.id.sepatuventelaButton2);
        sepatuventelaButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VENTELA.this, detail.class);
                intent.putExtra("item_id", 2);
                intent.putExtra("item_description", "Deskripsi item 5");
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol VENTELA 3
        ImageView sepatuventelaButton3 = findViewById(R.id.sepatuventelaButton3);
        sepatuventelaButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VENTELA.this, detail.class);
                intent.putExtra("item_id", 3);
                intent.putExtra("item_description", "Deskripsi item 5");
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol VENTELA 4
        ImageView sepatuventelaButton4 = findViewById(R.id.sepatuventelaButton4);
        sepatuventelaButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VENTELA.this, detail.class);
                intent.putExtra("item_id", 4);
                intent.putExtra("item_description", "Deskripsi item 5");
                startActivity(intent);
            }
        });

        // Mengatur onClickListener untuk tombol VENTELA 5
        ImageView sepatuventelaButton5 = findViewById(R.id.sepatuventelaButton5);
        sepatuventelaButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat Intent untuk memulai aktivitas detail
                Intent intent = new Intent(VENTELA.this, detail.class);
                // Meneruskan data tambahan
                intent.putExtra("item_id", 5);
                intent.putExtra("item_description", "Deskripsi item 5");
                startActivity(intent);
            }
        });
    }
}
