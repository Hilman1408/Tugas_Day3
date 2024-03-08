package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mengatur onClickListener untuk tombol VANS
        ImageView vansButton = findViewById(R.id.vansButton);
        vansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, VANS.class));
            }
        });

        // Mengatur onClickListener untuk tombol VENTELA
        ImageView ventelaButton = findViewById(R.id.ventelaButton);
        ventelaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, VENTELA.class));
            }
        });

        // Mengatur onClickListener untuk tombol NIKE
        ImageView nikeButton = findViewById(R.id.nikeButton);
        nikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NIKE.class));
            }
        });
    }
}
