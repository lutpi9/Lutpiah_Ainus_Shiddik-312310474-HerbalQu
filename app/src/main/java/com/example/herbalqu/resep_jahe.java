package com.example.yourapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Membuat RelativeLayout
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));
        relativeLayout.setBackgroundColor(0xFFFFFFFF); // Warna latar belakang
        relativeLayout.setPadding(16, 16, 16, 16);

        // Membuat LinearLayout untuk Status Bar
        LinearLayout statusBar = new LinearLayout(this);
        statusBar.setId(View.generateViewId());
        statusBar.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        statusBar.setOrientation(LinearLayout.HORIZONTAL);
        statusBar.setGravity(android.view.Gravity.CENTER_VERTICAL);
        statusBar.setPadding(0, 0, 0, 8);

        // Membuat TextView untuk waktu
        TextView timeTextView = new TextView(this);
        timeTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        timeTextView.setText("9:41");
        timeTextView.setTextColor(0xFF000000); // Warna teks
        timeTextView.setTextSize(16);

        // Membuat LinearLayout untuk indikator status
        LinearLayout statusIndicator = new LinearLayout(this);
        statusIndicator.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        statusIndicator.setOrientation(LinearLayout.HORIZONTAL);
        statusIndicator.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
        statusIndicator.setGravity(android.view.Gravity.END);

        // Menambahkan indikator status (tiga titik)
        for (int i = 0; i < 3; i++) {
            View dot = new View(this);
            LinearLayout.LayoutParams dotParams = new LinearLayout.LayoutParams(10, 10);
            if (i > 0) {
                dotParams.setMargins(0, 0, 4, 0); // Margin untuk titik setelah yang pertama
            }
            dot.setLayoutParams(dotParams);
            dot.setBackgroundResource(R.drawable.circle_black); // Ganti dengan drawable yang sesuai
            statusIndicator.addView(dot);
        }

        // Menambahkan TextView dan LinearLayout ke statusBar
        statusBar.addView(timeTextView);
        statusBar.addView(statusIndicator);
        relativeLayout.addView(statusBar);

        // Membuat ImageView untuk gambar jahe
        ImageView imageView = new ImageView(this);
        imageView.setId(View.generateViewId());
        RelativeLayout.LayoutParams imageParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                200);
        imageParams.addRule(RelativeLayout.BELOW, statusBar.getId());
        imageView.setLayoutParams(imageParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(R.drawable.jahe); // Ganti dengan drawable yang sesuai
        relativeLayout.addView(imageView);

        // Membuat TextView untuk konten
        TextView contentTextView = new TextView(this);
        contentTextView.setId(View.generateViewId());
        contentTextView.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT));
        contentTextView.setText("Jahe memiliki banyak manfaat untuk kesehatan, di antaranya:");
        contentTextView.setTextColor(0xFF000000);
        contentTextView.setTextSize(16);
        RelativeLayout.LayoutParams contentParams = (RelativeLayout.LayoutParams) contentTextView.getLayoutParams();
        contentParams.addRule(RelativeLayout.BELOW, imageView.getId());
        contentTextView.setLayoutParams(contentParams);
        relativeLayout.addView(contentTextView);

        // Membuat TextView untuk daftar manfaat
        TextView benefitsTextView = new TextView(this);
        benefitsTextView.setId(View.generateViewId());
        benefitsTextView.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT));
        benefitsTextView.setText("• Meredakan nyeri: Jahe dapat meredakan