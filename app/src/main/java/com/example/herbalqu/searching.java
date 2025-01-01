package com.example.herbalqu;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class searching extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Root LinearLayout
        LinearLayout rootLayout = new LinearLayout(this);
        rootLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        rootLayout.setOrientation(LinearLayout.VERTICAL);
        rootLayout.setBackgroundColor(0xFFFFFFFF);

        // Header TextView
        TextView headerTextView = new TextView(this);
        LinearLayout.LayoutParams headerParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 150);
        headerTextView.setLayoutParams(headerParams);
        headerTextView.setBackgroundColor(0xFFA4D97B);
        headerTextView.setGravity(Gravity.CENTER);
        headerTextView.setText("HERBALQU");
        headerTextView.setTextColor(0xFF000000);
        headerTextView.setTypeface(null, android.graphics.Typeface.BOLD);
        headerTextView.setTextSize(18);
        rootLayout.addView(headerTextView);

        // Search Bar LinearLayout
        LinearLayout searchBar = new LinearLayout(this);
        LinearLayout.LayoutParams searchParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        searchParams.setMargins(16, 20, 16, 20);
        searchBar.setLayoutParams(searchParams);
        searchBar.setOrientation(LinearLayout.HORIZONTAL);
        searchBar.setBackgroundColor(0xFFF1F1F1);
        searchBar.setPadding(8, 8, 8, 8);
        searchBar.setElevation(2);
        searchBar.setGravity(Gravity.CENTER);

        // Search Icon
        ImageView searchIcon = new ImageView(this);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(60, 60);
        searchIcon.setLayoutParams(iconParams);
        searchIcon.setImageResource(android.R.drawable.ic_menu_search); // Default Android search icon
        searchIcon.setColorFilter(0xFFB0B0B0);
        searchIcon.setContentDescription("pencarian");
        searchBar.addView(searchIcon);

        // Search EditText
        EditText searchEditText = new EditText(this);
        LinearLayout.LayoutParams editTextParams = new LinearLayout.LayoutParams(
                0, LinearLayout.LayoutParams.WRAP_CONTENT, 1f);
        searchEditText.setLayoutParams(editTextParams);
        searchEditText.setHint("mari hidup sehat dengan herbal!!");
        searchEditText.setBackgroundColor(android.graphics.Color.TRANSPARENT);
        searchEditText.setHintTextColor(0xFFB0B0B0);
        searchEditText.setPadding(8, 0, 8, 0);
        searchEditText.setSingleLine(true);
        searchBar.addView(searchEditText);

        rootLayout.addView(searchBar);

        // Center Content (Placeholder for now)
        LinearLayout centerContent = new LinearLayout(this);
        centerContent.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0, 1f)); // Fills remaining space
        rootLayout.addView(centerContent);

        // Bottom Button Layout
        LinearLayout bottomButtonLayout = new LinearLayout(this);
        bottomButtonLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        bottomButtonLayout.setGravity(Gravity.CENTER);
        bottomButtonLayout.setPadding(16, 16, 16, 16);
        bottomButtonLayout.setBackgroundColor(0xFFF8F8F8);

        // Back Button
        ImageButton backButton = new ImageButton(this);
        LinearLayout.LayoutParams backButtonParams = new LinearLayout.LayoutParams(80, 80);
        backButton.setLayoutParams(backButtonParams);
        backButton.setImageResource(android.R.drawable.ic_media_previous); // Default Android back icon
        backButton.setBackgroundResource(android.R.drawable.btn_default); // Standard clickable background
        backButton.setContentDescription("back ");
        bottomButtonLayout.addView(backButton);

        rootLayout.addView(bottomButtonLayout);

        // Set root layout as the content view
        setContentView(rootLayout);
    }
}
