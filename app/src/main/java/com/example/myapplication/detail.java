package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class detail extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Ambil deskripsi item dari intent
        final String itemDescription = getIntent().getStringExtra("item_description");

        // Tampilkan deskripsi item pada TextView
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(itemDescription);

        // Tautan ke aplikasi di Google Play Store (Contoh: Visual Studio Code)
        final String appLink = "https://play.google.com/store/apps/details?id=com.microsoft.vscode&hl=en&gl=US";

        // Mengatur onClickListener untuk tombol share
        Button shareButton = findViewById(R.id.shareButton);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat pesan yang berisi deskripsi item dan tautan ke aplikasi di Google Play Store
                String message = itemDescription + "\n\n" + "Unduh aplikasi ini di Google Play Store:\n" + appLink;

                // Membuat intent untuk mengirim pesan
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, message);

                // Menampilkan dialog untuk memilih aplikasi untuk berbagi
                startActivity(Intent.createChooser(shareIntent, "Bagikan lewat"));
            }
        });
    }
}
