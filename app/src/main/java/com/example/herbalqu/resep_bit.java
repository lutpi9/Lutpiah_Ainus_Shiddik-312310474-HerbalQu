package com.example.yourapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new ScrollView.LayoutParams(
                ScrollView.LayoutParams.MATCH_PARENT,
                ScrollView.LayoutParams.MATCH_PARENT));
        scrollView.setBackgroundColor(0xFFFFFFFF); // Warna latar belakang
        scrollView.setPadding(16, 16, 16, 16);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT));

        LinearLayout header = new LinearLayout(this);
        header.setId(View.generateViewId());
        header.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        header.setOrientation(LinearLayout.HORIZONTAL);
        header.setGravity(android.view.Gravity.CENTER_VERTICAL);
        header.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        header.setMarginBottom(16); // Margin bawah

        TextView timeTextView = new TextView(this);
        timeTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        timeTextView.setText("9:41");
        timeTextView.setTextSize(14);
        timeTextView.setTextColor(0xFF000000); // Warna teks
        timeTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT, 1f));

        LinearLayout statusIndicator = new LinearLayout(this);
        statusIndicator.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        statusIndicator.setOrientation(LinearLayout.HORIZONTAL);
        statusIndicator.setGravity(android.view.Gravity.CENTER);

        for (int i = 0; i < 3; i++) {
            View dot = new View(this);
            LinearLayout.LayoutParams dotParams = new LinearLayout.LayoutParams(10, 10);
            dotParams.setMargins(0, 0, 4, 0); // Margin kanan untuk jarak antar titik
            dot.setLayoutParams(dotParams);
            dot.setBackgroundResource(R.drawable.circle_black); // Ganti dengan drawable yang sesuai
            statusIndicator.addView(dot);
        }

        header.addView(timeTextView);
        header.addView(statusIndicator);
        relativeLayout.addView(header);

        ImageView imageView = new ImageView(this);
        imageView.setId(View.generateViewId());
        RelativeLayout.LayoutParams imageParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                200);
        imageParams.addRule(RelativeLayout.BELOW, header.getId());
        imageView.setLayoutParams(imageParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(R.drawable.buah_bit); // Ganti dengan drawable yang sesuai
        relativeLayout.addView(imageView);

        TextView contentTextView = new TextView(this);
        contentTextView.setId(View.generateViewId());
        contentTextView.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT));
        contentTextView.setText("Buah bit memiliki banyak manfaat untuk kesehatan karena kandungan nutrisinya yang beragam. Berikut beberapa manfaat buah bit:");
        contentTextView.setTextSize(14);
        contentTextView.setTextColor(0xFF000000);
        RelativeLayout.LayoutParams contentParams = (RelativeLayout.LayoutParams) contentTextView.getLayoutParams();
        contentParams.addRule(RelativeLayout.BELOW, imageView.getId());
        contentTextView.setLayoutParams(contentParams);
        relativeLayout.addView(contentTextView);

