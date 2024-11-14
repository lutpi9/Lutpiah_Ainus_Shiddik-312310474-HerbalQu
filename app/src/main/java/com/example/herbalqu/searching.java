package com.example.yourapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

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

        // Header dengan Judul
        TextView headerTextView = new TextView(this);
        headerTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                60));
        headerTextView.setBackgroundColor(0xFFA4D97B); // Warna latar belakang header
        headerTextView.setGravity(View.TEXT_ALIGNMENT_CENTER);
        headerTextView.setText("HERBALQU");
        headerTextView.setTextColor(0xFF000000); // Warna teks
        headerTextView.setTextStyle(android.graphics.Typeface.BOLD);
        headerTextView.setTextSize(18);
        rootLayout.addView(headerTextView);

        // Search Bar
        LinearLayout searchBar = new LinearLayout(this);
        searchBar.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        searchBar.setOrientation(LinearLayout.HORIZONTAL);
        searchBar.setBackgroundColor(0xFFF1F1F1); // Warna latar belakang
        searchBar.setPadding(8, 8, 8, 8);
        searchBar.setElevation(2);
        searchBar.setGravity(View.TEXT_ALIGNMENT_CENTER);
        searchBar.setMargins(16, 20, 16, 20);

        // Icon Pencarian
        ImageView searchIcon = new ImageView(this);
        searchIcon.setLayoutParams(new LinearLayout.LayoutParams(20, 20));
        searchIcon.setImageResource(R.drawable.ic_search); // Ganti dengan drawable yang sesuai
        searchIcon.setColorFilter(0xFFB0B0B0); // Warna ikon pencarian
        searchIcon.setContentDescription("Search Icon");
        searchBar.addView(searchIcon);

        // EditText untuk Pencarian
        EditText searchEditText = new EditText(this);
        LinearLayout.LayoutParams editTextParams = new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.WRAP_CONTENT);
        editTextParams.weight = 1;
        searchEditText.setLayoutParams(editTextParams);
        searchEditText.setHint("mari hidup sehat dengan herbal!!");
        searchEditText.setBackgroundColor(android.graphics.Color.TRANSPARENT);
        searchEditText.setTextColorHint(0xFFB0B0B0); // Warna hint
        searchEditText.setPadding(8, 0, 8, 0);
        searchEditText.setSingleLine(true);
        searchBar.addView(searchEditText);

        rootLayout.addView(searchBar);

        // Konten Tengah (Kosong untuk saat ini)
        LinearLayout centerContent = new LinearLayout(this);
        centerContent.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0, 1f)); // Mengisi ruang yang tersisa
        rootLayout.addView(centerContent);

        // Tombol Kembali di Bawah
        LinearLayout bottomButtonLayout = new LinearLayout(this);
        bottomButtonLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        bottomButtonLayout.setGravity(View.TEXT_ALIGNMENT_CENTER);
        bottomButtonLayout.setPadding(16, 16, 16, 16);
        bottomButtonLayout.setBackgroundColor(0xFFF8F8F8); // Warna latar belakang

        ImageButton backButton = new ImageButton(this);
        backButton.setLayoutParams(new LinearLayout.LayoutParams(40, 40));
        backButton.setImageResource(R.drawable.ic_back); // Ganti dengan drawable yang sesuai
        backButton.setBackgroundResource(android.R.attr.selectableItemBackgroundBorderless);
        backButton.setContentDescription("Back Button");
        bottomButtonLayout.addView(backButton);

        rootLayout.addView(bottomButtonLayout);

        // Set root layout as the content view
        setContentView(rootLayout);
    }
}