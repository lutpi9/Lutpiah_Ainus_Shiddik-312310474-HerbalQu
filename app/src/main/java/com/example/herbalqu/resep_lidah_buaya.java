package com.example.herbalqu;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class resep_lidah_buaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create the main LinearLayout
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setBackgroundColor(0xFFFFFFFF); // White background

        // Create and add the ImageView (Top image)
        ImageView topImage = new ImageView(this);
        topImage.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 200));
        topImage.setImageResource(R.drawable.lidah_buaya); // Ensure this resource exists in res/drawable
        topImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        topImage.setContentDescription("Lidah Buaya");
        mainLayout.addView(topImage);

        // Create the ScrollView
        ScrollView scrollView = new ScrollView(this);
        LinearLayout.LayoutParams scrollViewParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0);
        scrollViewParams.weight = 1; // Make it take the remaining space
        scrollView.setLayoutParams(scrollViewParams);
        mainLayout.addView(scrollView);

        // Create a LinearLayout inside the ScrollView for content
        LinearLayout contentLayout = new LinearLayout(this);
        contentLayout.setOrientation(LinearLayout.VERTICAL);
        contentLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        scrollView.addView(contentLayout);

        // Create the description TextView
        TextView descriptionText = new TextView(this);
        descriptionText.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        descriptionText.setText("Lidah buaya atau aloe vera memiliki banyak manfaat untuk kesehatan tubuh, di antaranya:\n\n" +
                "• Menjaga kesehatan kulit: Lidah buaya dapat membantu mengatasi kulit kering, meredakan peradangan\n" +
                "• Menjaga kesehatan mulut: Lidah buaya dapat membantu mengatasi plak gigi dan masalah gigi lainnya.\n" +
                "• Menjaga kesehatan pencernaan: Lidah buaya dapat membantu menjaga kesehatan saluran pencernaan dan meredakan gastroesophageal reflux disease (GERD).");
        descriptionText.setTextColor(0xFF000000); // Black text color
        descriptionText.setTextSize(14); // Set text size
        descriptionText.setLineSpacing(4, 1); // Line spacing
        contentLayout.addView(descriptionText);

        // Create the green box with steps
        LinearLayout greenBox = new LinearLayout(this);
        greenBox.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        greenBox.setOrientation(LinearLayout.VERTICAL);
        greenBox.setBackgroundColor(0xAFD887); // Green background
        greenBox.setPadding(12, 12, 12, 12);
        contentLayout.addView(greenBox);

        // Create the steps TextView inside the green box
        TextView stepsText = new TextView(this);
        stepsText.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        stepsText.setText("Lidah buaya dapat diolah untuk meredakan asam lambung dengan cara membuat jus lidah buaya:\n\n" +
                "1. Kupas dan bersihkan daging lidah buaya\n" +
                "2. Campur 2 sendok makan daging lidah buaya dengan 6 gelas air\n" +
                "3. Blender hingga halus dan jus lidah buaya dapat diminum langsung atau dicampur ke dalam smoothies. Untuk menambah rasa, Anda dapat menambahkan madu, lemon, atau jahe.");
        stepsText.setTextColor(0xFF000000); // Black text color
        stepsText.setTextSize(14); // Set text size
        stepsText.setLineSpacing(4, 1); // Line spacing
        greenBox.addView(stepsText);

        // Create the back button at the bottom
        LinearLayout bottomLayout = new LinearLayout(this);
        bottomLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        bottomLayout.setGravity(android.view.Gravity.CENTER);
        bottomLayout.setPadding(16, 16, 16, 16);
        mainLayout.addView(bottomLayout);

        // Create ImageButton for the back button
        ImageButton backButton = new ImageButton(this);
        backButton.setLayoutParams(new LinearLayout.LayoutParams(48, 48)); // Set size
        backButton.setImageResource(R.drawable.button_back); // Ensure this resource exists in res/drawable
        backButton.setImageResource(android.R.drawable.radiobutton_off_background); // Use a default back button
        backButton.setContentDescription("Back button");
        bottomLayout.addView(backButton);

        // Set OnClickListener for back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close the current activity when the back button is pressed
            }
        });

        // Set the main layout as the content view
        setContentView(mainLayout);
    }
}
