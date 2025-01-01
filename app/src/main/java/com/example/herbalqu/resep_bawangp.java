package com.example.herbalqu;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resep_bawangp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create the main RelativeLayout
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
        relativeLayout.setPadding(16, 16, 16, 16);

        // Status Bar Layout
        LinearLayout statusBar = new LinearLayout(this);
        statusBar.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        statusBar.setOrientation(LinearLayout.HORIZONTAL);
        statusBar.setGravity(android.view.Gravity.CENTER_VERTICAL);
        statusBar.setPadding(0, 0, 0, 8);

        // Empty LinearLayout (this is to mimic the structure in XML, but it has no content)
        LinearLayout emptyLayout = new LinearLayout(this);
        emptyLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        emptyLayout.setGravity(android.view.Gravity.END);
        statusBar.addView(emptyLayout);

        // Add the Status Bar to RelativeLayout
        relativeLayout.addView(statusBar);

        // Image View for Garlic Image
        ImageView garlicImage = new ImageView(this);
        garlicImage.setId(View.generateViewId());
        garlicImage.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, 200));
        garlicImage.setImageResource(R.drawable.bawang_putih);  // Ensure this drawable exists
        garlicImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        RelativeLayout.LayoutParams garlicParams = (RelativeLayout.LayoutParams) garlicImage.getLayoutParams();
        garlicParams.addRule(RelativeLayout.BELOW, statusBar.getId());
        garlicParams.setMargins(0, 0, 0, 16); // Set margin here

        relativeLayout.addView(garlicImage);

        // ScrollView to hold the content
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        RelativeLayout.LayoutParams scrollParams = (RelativeLayout.LayoutParams) scrollView.getLayoutParams();
        scrollParams.addRule(RelativeLayout.BELOW, garlicImage.getId());

        // LinearLayout inside ScrollView for text content
        LinearLayout contentLayout = new LinearLayout(this);
        contentLayout.setOrientation(LinearLayout.VERTICAL);

        // TextViews for garlic health benefits
        TextView healthBenefitsTitle = new TextView(this);
        healthBenefitsTitle.setText("Bawang putih memiliki banyak manfaat untuk kesehatan, di antaranya:");
        healthBenefitsTitle.setTextSize(14);
        healthBenefitsTitle.setTextColor(getResources().getColor(android.R.color.black));

        // Set LayoutParams for the TextView
        LinearLayout.LayoutParams healthParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        healthParams.setMargins(0, 0, 0, 6); // Set margin here
        healthBenefitsTitle.setLayoutParams(healthParams);

        contentLayout.addView(healthBenefitsTitle);

        // List of benefits
        String[] benefits = {
                "• Menurunkan kolesterolBawang putih mengandung zat ajoene yang dapat membantu mencegah penggumpalan darah dan menurunkan kadar kolesterol.",
                "• Menurunkan tekanan darah Bawang putih dapat membantu mengendalikan tekanan darah tinggi, yang merupakan salah satu faktor risiko penyakit kardiovaskular.",
                "• Mencegah penyakit jantung Bawang putih dapat membantu mencegah penyakit jantung karena dapat mengendalikan kadar kolesterol dan tekanan darah."
        };

        for (String benefit : benefits) {
            TextView benefitText = new TextView(this);
            benefitText.setText(benefit);
            benefitText.setTextSize(14);
            benefitText.setTextColor(getResources().getColor(android.R.color.black));

            // Set LayoutParams for each benefit TextView
            LinearLayout.LayoutParams benefitParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            benefitParams.setMargins(0, 0, 0, 6); // Set margin here
            benefitText.setLayoutParams(benefitParams);

            contentLayout.addView(benefitText);
        }

        // Nested LinearLayout for instructions
        LinearLayout instructionLayout = new LinearLayout(this);
        instructionLayout.setOrientation(LinearLayout.VERTICAL);
        instructionLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        instructionLayout.setPadding(0, 0, 0, 0);

        // Instruction TextViews
        TextView instructionTitle = new TextView(this);
        instructionTitle.setText("Bawang putih dapat diolah untuk menurunkan kolesterol dengan cara direbus atau dimakan mentah:");
        instructionTitle.setTextSize(14);
        instructionTitle.setTextColor(getResources().getColor(android.R.color.black));

        // Set LayoutParams for the instruction title
        LinearLayout.LayoutParams instructionTitleParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        instructionTitleParams.setMargins(0, 0, 0, 8); // Set margin here
        instructionTitle.setLayoutParams(instructionTitleParams);
        instructionLayout.addView(instructionTitle);

        String[] instructions = {
                "1. Geprek bawang putih.",
                "2. Rebus bersama air hingga mendidih.",
                "3. Setelah mendidih, rebus selama 30 detik, lalu matikan api.",
                "4. Biarkan bawang putih terendam dalam air panas hingga aromanya keluar.",
                "5. Saring air rebusan bawang putih ke dalam gelas dan minum selagi hangat."
        };

        for (String instruction : instructions) {
            TextView instructionText = new TextView(this);
            instructionText.setText(instruction);
            instructionText.setTextSize(14);
            instructionText.setTextColor(getResources().getColor(android.R.color.black));

            // Set LayoutParams for each instruction TextView
            LinearLayout.LayoutParams instructionParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            instructionParams.setMargins(0, 0, 0, 4); // Set margin here
            instructionText.setLayoutParams(instructionParams);

            instructionLayout.addView(instructionText);
        }

        // Add the instructions to the content layout
        contentLayout.addView(instructionLayout);

        // Add the content layout to the scroll view
        scrollView.addView(contentLayout);

        // Add the ScrollView to the RelativeLayout
        relativeLayout.addView(scrollView);

        // Back Button
        ImageButton backButton = new ImageButton(this);
        backButton.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        backButton.setImageResource(R.drawable.button_back); // Ensure this drawable exists
        backButton.setContentDescription("Back");
        RelativeLayout.LayoutParams backButtonParams = (RelativeLayout.LayoutParams) backButton.getLayoutParams();
        backButtonParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        backButtonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        backButtonParams.setMargins(0, 0, 0, 16); // Set margin here

        relativeLayout.addView(backButton);

        // Display the layout
        setContentView(relativeLayout);
    }
}
