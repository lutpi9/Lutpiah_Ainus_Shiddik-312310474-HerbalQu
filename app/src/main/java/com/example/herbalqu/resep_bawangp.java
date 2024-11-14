package com.example.yourapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
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

        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));
        relativeLayout.setBackgroundColor(0xFFFFFFFF); // Warna latar belakang
        relativeLayout.setPadding(16, 16, 16, 16);

        LinearLayout statusBar = new LinearLayout(this);
        statusBar.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        statusBar.setOrientation(LinearLayout.HORIZONTAL);
        statusBar.setGravity(android.view.Gravity.CENTER_VERTICAL);
        statusBar.setPadding(0, 0, 0, 8);

        TextView timeTextView = new TextView(this);
        timeTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        timeTextView.setText("9:41");
        timeTextView.setTextSize(14);
        timeTextView.setTextColor(0xFF000000); // Warna teks

        LinearLayout statusIndicator = new LinearLayout(this);
        statusIndicator.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        statusIndicator.setOrientation(LinearLayout.HORIZONTAL);
        statusIndicator.setGravity(android.view.Gravity.END);
        statusIndicator.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));

        for (int i = 0; i < 3; i++) {
            View dot = new View(this);
            LinearLayout.LayoutParams dotParams = new LinearLayout.LayoutParams(8, 8);
            dotParams.setMargins(0, 0, 2, 0); // Margin kanan untuk jarak antar titik
            dot.setLayoutParams(dotParams);
            dot.setBackgroundResource(R.drawable.circle_black); // Ganti dengan drawable yang sesuai
            statusIndicator.addView(dot);
        }

        statusBar.addView(timeTextView);
        statusBar.addView(statusIndicator);
        relativeLayout.addView(statusBar);

        ImageView garlicImage = new ImageView(this);
        garlicImage.setId(View.generateViewId());
        garlicImage.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                200));
        garlicImage.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                200));
        garlicImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        garlicImage.setImageResource(R.drawable.bawang_putih); // Ganti dengan drawable yang sesuai
        relativeLayout.addView(garlicImage);

        ScrollView scrollView = new ScrollView(this);
        RelativeLayout.LayoutParams scrollParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        scrollParams.addRule(RelativeLayout.BELOW, garlicImage.getId());
        scrollView.setLayoutParams(scrollParams);

        LinearLayout contentLayout = new LinearLayout(this);
        contentLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        contentLayout.setOrientation(LinearLayout.VERTICAL);


        String[] contents = {
                "Bawang putih memiliki banyak manfaat untuk kesehatan, di antaranya:",
                "• Menurunkan kolesterol. Bawang putih mengandung zat ajoene yang dapat membantu mencegah penggumpalan darah dan menurunkan kadar kolesterol.",
                "• Menurunkan tekanan darah. Bawang putih dapat membantu mengendalikan tekanan darah tinggi, yang merupakan salah satu faktor risiko penyakit kardiovaskular.",
                "•