package com.example.herbalqu;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class favorite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Root Layout
        RelativeLayout rootLayout = new RelativeLayout(this);
        rootLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        ));
        rootLayout.setBackgroundColor(Color.parseColor("#F5F5F5"));

        // Header
        TextView header = new TextView(this);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        header.setLayoutParams(headerParams);
        header.setText("DAFTAR RESEP FAVORITE");
        header.setBackgroundColor(Color.parseColor("#AFD887"));
        header.setGravity(android.view.Gravity.CENTER);
        header.setPadding(16, 16, 16, 16);
        header.setTextColor(Color.BLACK);
        header.setTextSize(18);
        header.setTypeface(header.getTypeface(), Typeface.BOLD);

        // LinearLayout for Image and Text
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        RelativeLayout.LayoutParams linearLayoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        linearLayoutParams.setMargins(16, 32, 0, 0);
        linearLayoutParams.addRule(RelativeLayout.BELOW, header.getId());
        linearLayout.setLayoutParams(linearLayoutParams);

        // ImageView for Herb
        ImageView imageView = new ImageView(this);
        LinearLayout.LayoutParams imageViewParams = new LinearLayout.LayoutParams(
                100, // Width
                100 // Height
        );
        imageView.setLayoutParams(imageViewParams);
        imageView.setImageResource(R.drawable.jahe); // Replace with your drawable

        // TextView for Herb Name
        TextView herbName = new TextView(this);
        LinearLayout.LayoutParams herbNameParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        herbNameParams.topMargin = 8;
        herbName.setLayoutParams(herbNameParams);
        herbName.setText("Jahe");
        herbName.setTextColor(Color.BLACK);
        herbName.setTextSize(16);

        // Add Image and Text to LinearLayout
        linearLayout.addView(imageView);
        linearLayout.addView(herbName);

        // Back Button
        ImageButton backButton = new ImageButton(this);
        RelativeLayout.LayoutParams backButtonParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        backButtonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        backButtonParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        backButton.setLayoutParams(backButtonParams);
        backButton.setImageResource(R.drawable.button_back); // Replace with your drawable
        backButton.setContentDescription("Back");

        // Add Views to Root Layout
        rootLayout.addView(header);
        rootLayout.addView(linearLayout);
        rootLayout.addView(backButton);

        // Set Content View
        setContentView(rootLayout);
    }
}
