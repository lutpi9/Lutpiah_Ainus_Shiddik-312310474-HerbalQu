package com.example.herbalqu;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resep_bit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create the ScrollView
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        scrollView.setBackgroundColor(getResources().getColor(android.R.color.white));
        scrollView.setPadding(16, 16, 16, 16);

        // Create the RelativeLayout inside the ScrollView
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));

        // Create the Header
        LinearLayout header = new LinearLayout(this);
        header.setId(View.generateViewId());
        header.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        header.setOrientation(LinearLayout.HORIZONTAL);
        header.setGravity(Gravity.CENTER_VERTICAL);
        header.setPadding(0, 0, 0, 16);

        // Add the TextView to display the time
        TextView timeTextView = new TextView(this);
        timeTextView.setText("9:41");
        timeTextView.setTextSize(14);
        timeTextView.setTextColor(getResources().getColor(android.R.color.black));
        LinearLayout.LayoutParams timeParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        timeParams.weight = 1;
        timeTextView.setLayoutParams(timeParams);

        header.addView(timeTextView);

        relativeLayout.addView(header);

        // Create the ImageView for the image
        ImageView imageView = new ImageView(this);
        imageView.setId(View.generateViewId());
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, 200));
        imageView.setImageResource(R.drawable.buah_bit); // Ensure the image resource exists
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        RelativeLayout.LayoutParams imageParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        imageParams.addRule(RelativeLayout.BELOW, header.getId());
        imageParams.setMargins(0, 0, 0, 16);
        relativeLayout.addView(imageView);

        // Create the content TextView
        TextView contentTextView = new TextView(this);
        contentTextView.setId(View.generateViewId());
        contentTextView.setText("Buah bit memiliki banyak manfaat untuk kesehatan karena kandungan nutrisinya yang beragam. Berikut beberapa manfaat buah bit:");
        contentTextView.setTextSize(14);
        contentTextView.setTextColor(getResources().getColor(android.R.color.black));
        RelativeLayout.LayoutParams contentParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        contentParams.addRule(RelativeLayout.BELOW, imageView.getId());
        contentParams.setMargins(0, 0, 0, 8);
        contentTextView.setLayoutParams(contentParams);
        relativeLayout.addView(contentTextView);

        // Create the benefits TextView
        TextView benefitsTextView = new TextView(this);
        benefitsTextView.setId(View.generateViewId());
        benefitsTextView.setText("• Menjaga kesehatan mata: Buah bit mengandung lutein atau zeaxanthin yang dapat membantu menjaga kesehatan makula dan retina mata.\n• Mencegah anemia: Buah bit mengandung zat besi yang dapat meningkatkan kadar hemoglobin (Hb) dalam darah.\n• Menjaga kesehatan hati: Buah bit mengandung kalsium, zat besi, dan antioksidan yang baik untuk kesehatan hati.");
        benefitsTextView.setTextSize(14);
        benefitsTextView.setTextColor(getResources().getColor(android.R.color.black));
        RelativeLayout.LayoutParams benefitsParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        benefitsParams.addRule(RelativeLayout.BELOW, contentTextView.getId());
        benefitsParams.setMargins(0, 0, 0, 6);
        benefitsTextView.setLayoutParams(benefitsParams);
        relativeLayout.addView(benefitsTextView);

        // Create the highlighted section LinearLayout
        LinearLayout highlightSection = new LinearLayout(this);
        highlightSection.setId(View.generateViewId());
        highlightSection.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        highlightSection.setOrientation(LinearLayout.VERTICAL);
        highlightSection.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        highlightSection.setPadding(6, 6, 6, 6);
        RelativeLayout.LayoutParams highlightParams = (RelativeLayout.LayoutParams) highlightSection.getLayoutParams();
        highlightParams.addRule(RelativeLayout.BELOW, benefitsTextView.getId());
        highlightParams.setMargins(0, 0, 0, 16);

        // Add the title text in the highlighted section
        TextView highlightTitleTextView = new TextView(this);
        highlightTitleTextView.setText("Bit dapat diolah untuk memberikan efek perlindungan terhadap kerusakan hati");
        highlightTitleTextView.setTextSize(14);
        highlightTitleTextView.setTextColor(getResources().getColor(android.R.color.black));
        highlightTitleTextView.setTypeface(null, android.graphics.Typeface.BOLD);
        LinearLayout.LayoutParams highlightTitleParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        highlightTitleParams.setMargins(0, 0, 0, 8);
        highlightTitleTextView.setLayoutParams(highlightTitleParams);
        highlightSection.addView(highlightTitleTextView);

        // Add the steps text in the highlighted section
        TextView stepTextView = new TextView(this);
        stepTextView.setText("1. Rebus umbi ini terlebih dahulu untuk menghilangkan kandungan berbahaya dan aroma tak sedap.\n2. Blender bit terlebih dahulu hingga tekstur menjadi halus.\n3. Kemudian, tambahkan wortel ke dalam jus dan daun bayam satu per satu. Cara ini untuk semakin menghilangkan bau tanah.\n4. Agar tekstur jus tidak");
        stepTextView.setTextSize(14);
        stepTextView.setTextColor(getResources().getColor(android.R.color.black));
        LinearLayout.LayoutParams stepParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        stepParams.setMargins(0, 0, 0, 4);
        stepTextView.setLayoutParams(stepParams);
        highlightSection.addView(stepTextView);

        relativeLayout.addView(highlightSection);

        // Create the Back Button
        ImageButton backButton = new ImageButton(this);
        backButton.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        backButton.setImageResource(R.drawable.button_back); // Ensure the image resource exists
        backButton.setContentDescription("Back");
        RelativeLayout.LayoutParams backButtonParams = (RelativeLayout.LayoutParams) backButton.getLayoutParams();
        backButtonParams.addRule(RelativeLayout.BELOW, highlightSection.getId());
        backButtonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        backButtonParams.setMargins(0, 0, 0, 16);
        relativeLayout.addView(backButton);

        // Add the RelativeLayout to the ScrollView
        scrollView.addView(relativeLayout);

        // Set the ScrollView as the content view
        setContentView(scrollView);
    }
}
