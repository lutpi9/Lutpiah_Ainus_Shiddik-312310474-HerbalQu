package com.example.yourapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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

        // Bagian Gambar
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                200));
        imageView.setImageResource(R.drawable.lidah_buaya); // Ganti dengan drawable yang sesuai
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setContentDescription("Lidah Buaya");
        rootLayout.addView(imageView);

        // Bagian Scrollable Content
        ScrollView scrollView = new ScrollView(this);
        LinearLayout scrollLayout = new LinearLayout(this);
        scrollLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        scrollLayout.setOrientation(LinearLayout.VERTICAL);
        scrollLayout.setPadding(16, 16, 16, 16);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0, 1f)); // 0dp height and weight to fill space

        // Deskripsi Teks
        TextView descriptionTextView = new TextView(this);
        descriptionTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        descriptionTextView.setText("Lidah buaya atau aloe vera memiliki banyak manfaat untuk kesehatan tubuh, di antaranya:\n\n" +
                "• Menjaga kesehatan kulit: Lidah buaya dapat membantu mengatasi kulit kering, meredakan peradangan\n" +
                "• Menjaga kesehatan mulut: Lidah buaya dapat membantu mengatasi plak gigi dan masalah gigi lainnya.\n" +
                "• Menjaga kesehatan pencernaan: Lidah buaya dapat membantu menjaga kesehatan saluran pencernaan dan meredakan gastroesophageal reflux disease (GERD).");
        descriptionTextView.setTextColor(0xFF000000); // Warna teks
        descriptionTextView.setTextSize(14);
        descriptionTextView.setLineSpacing(4, 1.0f); // lineSpacingExtra
        descriptionTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        descriptionTextView.setPadding(0, 0, 0, 16);
        scrollLayout.addView(descriptionTextView);

        // Bagian Kotak Hijau dengan Langkah-langkah
        LinearLayout greenBox = new LinearLayout(this);
        greenBox.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        greenBox.setOrientation(LinearLayout.VERTICAL);
        greenBox.setBackgroundColor(0xAFD887); // Warna hijau
        greenBox.setPadding(12, 12, 12, 12);
        greenBox.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        greenBox.setPadding(0, 16, 0, 0);

        TextView stepsTextView = new TextView(this);
        stepsTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        stepsTextView.setText("Lidah buaya dapat diolah untuk meredakan asam lambung dengan cara membuat jus lidah buaya:\n\n" +
                "1. Kupas dan bersihkan daging lidah buaya\n" +
                "2. Campur 2 sendok makan daging lidah buaya dengan 6 gelas air\n" +
                "3. Blender hingga halus dan jus lidah buaya dapat diminum langsung atau dicampur ke dalam smoothies. Untuk menambah rasa, Anda dapat menambahkan madu, lemon, atau jahe.");
        stepsTextView.setText