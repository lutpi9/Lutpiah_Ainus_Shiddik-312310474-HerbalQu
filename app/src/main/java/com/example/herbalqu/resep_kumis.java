package com.example.yourapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Membuat LinearLayout sebagai root
        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.setBackgroundColor(0xFFFFFFFF); // Warna latar belakang
        rootLayout.setPadding(16, 16, 16, 16);

        // Bagian Gambar
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(R.drawable.kumis_kucing); // Ganti dengan drawable yang sesuai
        rootLayout.addView(imageView);

        // Bagian Teks
        TextView textContent = new TextView(this);
        textContent.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        textContent.setText("Tanaman kumis kucing (Orthosiphon aristatus) memiliki banyak manfaat untuk kesehatan, di antaranya:");
        textContent.setTextSize(14);
        textContent.setTextColor(0xFF000000); // Warna teks
        textContent.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        textContent.setPadding(0, 16, 0, 0);
        rootLayout.addView(textContent);

        // Daftar Manfaat
        String[] benefits = {
                "• Mengatasi infeksi saluran kemih (ISK): Kumis kucing dapat mengatasi infeksi saluran kemih yang disebabkan oleh bakteri seperti Escherichia coli dan Staphylococcus aureus.",
                "• Mengatasi masalah ginjal: Kumis kucing dapat mengatasi batu ginjal dan gangguan ginjal.",
                "• Mengobati asam urat: Kandungan flavonoid dan fenolik dalam kumis kucing dapat menghambat pembentukan asam urat dan meningkatkan pengeluaran asam urat melalui urine."
        };

        for (String benefit : benefits) {
            TextView benefitTextView = new TextView(this);
            benefitTextView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            benefitTextView.setText(benefit);
            benefitTextView.setTextSize(14);
            benefitTextView.setTextColor(0xFF000000); // Warna teks
            benefitTextView.setPadding(0, 8, 0, 0);
            rootLayout.addView(benefitTextView);
        }

        // Bagian Kotak Hijau
        LinearLayout greenBox = new LinearLayout(this);
        greenBox.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        greenBox.setOrientation(LinearLayout.VERTICAL);
        greenBox.setBackgroundColor(0xAFD887); // Warna hijau
        greenBox.setPadding(16, 16, 16, 16);
        greenBox.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        greenBox.setPadding(0, 16, 0, 0);

        TextView greenBoxTitle = new TextView(this);
        greenBoxTitle.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        greenBoxTitle.setText("Kumis kucing memiliki banyak manfaat untuk kesehatan, di antaranya untuk mengatasi asam urat, ginjal, saluran kemih, dan lainnya. Berikut cara mengolah kumis kucing untuk berbagai keperluan:");
        greenBoxTitle.setTextSize(14);
        greenBoxTitle.setTextColor(0xFF000000);
        greenBox.addView(greenBoxTitle);

        TextView greenBoxInstructions = new TextView(this);
        greenBoxInstructions.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        greenBoxInstructions.setText("Air rebusan