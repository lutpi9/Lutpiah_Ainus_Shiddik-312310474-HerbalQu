package com.example.herbalqu;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resep_kumis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create the LinearLayout (vertical)
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        mainLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
        mainLayout.setPadding(16, 16, 16, 16);

        // Image Section
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(R.drawable.kumis_kucing);  // Use your image resource here
        mainLayout.addView(imageView);

        // Text Section
        TextView textView = new TextView(this);
        textView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        textView.setText("Tanaman kumis kucing (Orthosiphon aristatus) memiliki banyak manfaat untuk kesehatan, di antaranya:");
        textView.setTextSize(14);
        textView.setTextColor(getResources().getColor(android.R.color.black));
        textView.setPadding(0, 16, 0, 0);
        mainLayout.addView(textView);

        // List Section
        String[] benefits = {
                "• Mengatasi infeksi saluran kemih (ISK): Kumis kucing dapat mengatasi infeksi saluran kemih yang disebabkan oleh bakteri seperti Escherichia coli dan Staphylococcus aureus.",
                "• Mengatasi masalah ginjal: Kumis kucing dapat mengatasi batu ginjal dan gangguan ginjal.",
                "• Mengobati asam urat: Kandungan flavonoid dan fenolik dalam kumis kucing dapat menghambat pembentukan asam urat dan meningkatkan pengeluaran asam urat melalui urine."
        };

        for (String benefit : benefits) {
            TextView benefitTextView = new TextView(this);
            benefitTextView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            benefitTextView.setText(benefit);
            benefitTextView.setTextSize(14);
            benefitTextView.setTextColor(getResources().getColor(android.R.color.black));
            benefitTextView.setPadding(0, 8, 0, 0);
            mainLayout.addView(benefitTextView);
        }

        // Green Box Section
        LinearLayout greenBoxLayout = new LinearLayout(this);
        greenBoxLayout.setOrientation(LinearLayout.VERTICAL);
        greenBoxLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        greenBoxLayout.setPadding(16, 16, 16, 16);
        greenBoxLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        // Green Box Text
        TextView greenBoxText = new TextView(this);
        greenBoxText.setText("Kumis kucing memiliki banyak manfaat untuk kesehatan, di antaranya untuk mengatasi asam urat, ginjal, saluran kemih, dan lainnya. Berikut cara mengolah kumis kucing untuk berbagai keperluan:");
        greenBoxText.setTextSize(14);
        greenBoxText.setTextColor(getResources().getColor(android.R.color.black));
        greenBoxLayout.addView(greenBoxText);

        // Green Box Instructions
        TextView greenBoxInstructions = new TextView(this);
        greenBoxInstructions.setText("Air rebusan rebus 4-5 lembar daun kumis kucing dengan segelas air sampai mendidih, lalu tunggu hingga dingin. Minum air rebusan ini 3 kali sehari.");
        greenBoxInstructions.setTextSize(14);
        greenBoxInstructions.setTextColor(getResources().getColor(android.R.color.black));
        greenBoxLayout.addView(greenBoxInstructions);

        // Add Green Box to main layout
        mainLayout.addView(greenBoxLayout);

        // Button Section
        LinearLayout buttonLayout = new LinearLayout(this);
        buttonLayout.setGravity(Gravity.CENTER);
        buttonLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        buttonLayout.setPadding(0, 16, 0, 0);

        // Back Button
        Button backButton = new Button(this);
        backButton.setLayoutParams(new LinearLayout.LayoutParams(48, 48));
        backButton.setBackgroundResource(R.drawable.button_back);  // Set your custom drawable
        backButton.setContentDescription("Back button");

        buttonLayout.addView(backButton);

        // Add Button Section to main layout
        mainLayout.addView(buttonLayout);

        // Set the content view to main layout
        setContentView(mainLayout);
    }
}
