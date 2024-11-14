package com.example.yourapp;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Creating the LinearLayout
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
        linearLayout.setBackgroundColor(0xFFE3FFD1); // Background color
        linearLayout.setGravity(android.view.Gravity.CENTER);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // Creating the TextView for the app name
        TextView textViewAppName = new TextView(this);
        textViewAppName.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        textViewAppName.setText("HerbalQu");
        textViewAppName.setTextSize(32); // Text size
        textViewAppName.setTextColor(0xFF000000); // Text color
        textViewAppName.setTypeface(null, android.graphics.Typeface.BOLD); // Bold text

        // Adding the TextView to LinearLayout
        linearLayout.addView(textViewAppName);

        // Setting the content view to the linear layout
        setContentView(linearLayout);
    }
}
