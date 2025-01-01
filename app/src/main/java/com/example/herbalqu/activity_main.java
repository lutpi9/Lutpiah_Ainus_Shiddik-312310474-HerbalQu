package com.example.herbalqu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Membuat Layout untuk Loading Screen
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
        linearLayout.setBackgroundColor(0xFFE3FFD1); // Warna Latar
        linearLayout.setGravity(android.view.Gravity.CENTER);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // TextView untuk Nama Aplikasi
        TextView textViewAppName = new TextView(this);
        textViewAppName.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        textViewAppName.setText("HerbalQu");
        textViewAppName.setTextSize(32);
        textViewAppName.setTextColor(0xFF000000);
        textViewAppName.setTypeface(null, android.graphics.Typeface.BOLD);

        // Menambahkan TextView ke Layout
        linearLayout.addView(textViewAppName);

        // Menetapkan Layout sebagai Tampilan Utama
        setContentView(linearLayout);

        // Handler untuk Menunda Pindah Halaman (3 detik)
        new Handler().postDelayed(() -> {
            // Berpindah ke Halaman Beranda
            Intent intent = new Intent(activity_main.this,  beranda.class);
            startActivity(intent);
            finish(); // Menutup aktivitas loading
        }, 3000); // 3000 milidetik = 3 detik
    }
}
