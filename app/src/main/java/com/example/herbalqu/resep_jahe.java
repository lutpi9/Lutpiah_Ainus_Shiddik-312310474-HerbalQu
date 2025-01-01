package com.example.herbalqu;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resep_jahe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create the RelativeLayout
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        relativeLayout.setPadding(16, 16, 16, 16);
        relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.white));

        // Create Status Bar LinearLayout
        LinearLayout statusBarLayout = new LinearLayout(this);
        statusBarLayout.setOrientation(LinearLayout.HORIZONTAL);
        statusBarLayout.setGravity(Gravity.CENTER_VERTICAL);
        statusBarLayout.setPadding(0, 0, 0, 8);
        statusBarLayout.setId(View.generateViewId()); // Generate unique ID

        // Create Time TextView
        TextView timeTextView = new TextView(this);
        timeTextView.setText("9:41");
        timeTextView.setTextSize(16);
        timeTextView.setTextColor(getResources().getColor(android.R.color.black));

        // Create Dots Layout
        LinearLayout dotsLayout = new LinearLayout(this);
        dotsLayout.setOrientation(LinearLayout.HORIZONTAL);
        dotsLayout.setGravity(Gravity.END);
        LinearLayout.LayoutParams dotsParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        dotsParams.weight = 1;
        dotsLayout.setLayoutParams(dotsParams);

        // Create Dots Views
        View dot1 = new View(this);
        dot1.setLayoutParams(new LinearLayout.LayoutParams(10, 10));
        dot1.setBackgroundResource(R.drawable.button_back); // Ensure this resource exists

        View dot2 = new View(this);
        dot2.setLayoutParams(new LinearLayout.LayoutParams(10, 10));
        dot2.setBackgroundResource(R.drawable.button_back); // Ensure this resource exists
        LinearLayout.LayoutParams margin2 = (LinearLayout.LayoutParams) dot2.getLayoutParams();
        margin2.setMarginStart(4);

        View dot3 = new View(this);
        dot3.setLayoutParams(new LinearLayout.LayoutParams(10, 10));
        dot3.setBackgroundResource(R.drawable.button_back); // Ensure this resource exists
        LinearLayout.LayoutParams margin3 = (LinearLayout.LayoutParams) dot3.getLayoutParams();
        margin3.setMarginStart(4);

        // Add dots to the layout
        dotsLayout.addView(dot1);
        dotsLayout.addView(dot2);
        dotsLayout.addView(dot3);

        // Add time and dots layout to status bar
        statusBarLayout.addView(timeTextView);
        statusBarLayout.addView(dotsLayout);

        // Create ImageView for image
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, 200));
        imageView.setId(View.generateViewId());
        ((RelativeLayout.LayoutParams) imageView.getLayoutParams()).addRule(RelativeLayout.BELOW, statusBarLayout.getId());
        imageView.setImageResource(R.drawable.jahe); // Ensure this resource exists
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        // Create Text Content
        TextView contentTextView = new TextView(this);
        contentTextView.setText("Jahe memiliki banyak manfaat untuk kesehatan, di antaranya:");
        contentTextView.setTextSize(16);
        contentTextView.setTextColor(getResources().getColor(android.R.color.black));
        contentTextView.setId(View.generateViewId());
        RelativeLayout.LayoutParams contentParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        contentParams.addRule(RelativeLayout.BELOW, imageView.getId());
        contentTextView.setLayoutParams(contentParams);

        // List of Benefits TextView
        TextView benefitsTextView = new TextView(this);
        benefitsTextView.setText("• Meredakan nyeri: Jahe dapat meredakan nyeri haid, nyeri sendi, dan nyeri otot.\n\n" +
                "• Menurunkan berat badan: Jahe dapat membantu menurunkan berat badan dengan meningkatkan metabolisme dan mempercepat pembakaran lemak.\n\n" +
                "• Mengatasi gangguan pencernaan: Jahe dapat mengatasi masalah pencernaan seperti sakit perut.");
        benefitsTextView.setTextSize(12);
        benefitsTextView.setTextColor(getResources().getColor(android.R.color.black));
        benefitsTextView.setId(View.generateViewId());
        RelativeLayout.LayoutParams benefitsParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        benefitsParams.addRule(RelativeLayout.BELOW, contentTextView.getId());
        benefitsTextView.setLayoutParams(benefitsParams);

        // Green Box Layout
        LinearLayout greenBoxLayout = new LinearLayout(this);
        greenBoxLayout.setOrientation(LinearLayout.VERTICAL);
        greenBoxLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        greenBoxLayout.setPadding(16, 16, 16, 16);
        greenBoxLayout.setId(View.generateViewId());
        RelativeLayout.LayoutParams greenBoxParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        greenBoxParams.addRule(RelativeLayout.BELOW, benefitsTextView.getId());

        // Green Box Text Views
        TextView greenBoxTitle = new TextView(this);
        greenBoxTitle.setText("Jahe dapat diolah untuk meredakan sakit perut. Berikut cara membuat air jahe:");
        greenBoxTitle.setTextSize(16);
        greenBoxTitle.setTextColor(getResources().getColor(android.R.color.black));
        greenBoxTitle.setTypeface(null, Typeface.BOLD); // Corrected usage
        greenBoxLayout.addView(greenBoxTitle);

        TextView greenBoxInstructions = new TextView(this);
        greenBoxInstructions.setText("1. Cuci dan bersihkan jahe.\n" +
                "2. Iris tipis-tipis jahe.\n" +
                "3. Rebus jahe dalam air mendidih selama 10–20 menit.\n" +
                "4. Diamkan sejenak.\n" +
                "5. Tambahkan madu, perasan jeruk nipis, atau susu untuk memperkaya.");
        greenBoxInstructions.setTextSize(14);
        greenBoxInstructions.setTextColor(getResources().getColor(android.R.color.black));
        greenBoxLayout.addView(greenBoxInstructions);

        // Add all views to RelativeLayout
        relativeLayout.addView(statusBarLayout);
        relativeLayout.addView(imageView);
        relativeLayout.addView(contentTextView);
        relativeLayout.addView(benefitsTextView);
        relativeLayout.addView(greenBoxLayout);

        // Set the content view
        setContentView(relativeLayout);
    }
}
