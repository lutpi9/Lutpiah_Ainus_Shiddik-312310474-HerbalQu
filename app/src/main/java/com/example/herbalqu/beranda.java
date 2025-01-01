package com.example.herbalqu;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Parent RelativeLayout
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        ));
        relativeLayout.setBackgroundColor(Color.WHITE);

        // Top Image
        ImageView topImage = new ImageView(this);
        RelativeLayout.LayoutParams topImageParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, 700);
        int topImageId = View.generateViewId(); // Generate dynamic ID
        topImage.setId(topImageId);
        topImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        topImage.setImageResource(R.drawable.ramuan);
        relativeLayout.addView(topImage, topImageParams);

        // GridLayout for Herbs
        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT));
        ((RelativeLayout.LayoutParams) gridLayout.getLayoutParams()).addRule(RelativeLayout.BELOW, topImageId);
        gridLayout.setColumnCount(2);
        gridLayout.setRowCount(3);
        gridLayout.setPadding(30, 30, 30, 30);
        relativeLayout.addView(gridLayout);

        // Add 6 Herb Items to GridLayout
        String[] herbNames = {"Lidah Buaya", "Jahe", "Buah Bit", "Bawang Putih", "Daun Sirih", "Kumis Kucing"};
        int[] herbImages = {R.drawable.lidah_buaya, R.drawable.jahe, R.drawable.buah_bit,
                R.drawable.bawang_putih, R.drawable.daun_sirih, R.drawable.kumis_kucing};

        for (int i = 0; i < 6; i++) {
            RelativeLayout herbItem = createHerbItem(herbImages[i], herbNames[i]);
            GridLayout.LayoutParams gridParams = new GridLayout.LayoutParams();
            gridParams.width = 0;
            gridParams.height = GridLayout.LayoutParams.WRAP_CONTENT;
            gridParams.setMargins(8, 8, 8, 8);
            gridParams.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
            gridLayout.addView(herbItem, gridParams);
        }

        // Bottom Navigation
        LinearLayout bottomNav = new LinearLayout(this);
        bottomNav.setOrientation(LinearLayout.HORIZONTAL);
        bottomNav.setBackgroundColor(Color.parseColor("#AFD887"));
        bottomNav.setPadding(16, 16, 16, 16);

        RelativeLayout.LayoutParams bottomNavParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, 120);
        bottomNavParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        relativeLayout.addView(bottomNav, bottomNavParams);

        // Add Bottom Navigation Items
        String[] bottomNavTexts = {"Search", "Home", "My Recipes"};
        int[] bottomNavIcons = {R.drawable.search, R.drawable.home, R.drawable.myfav};

        for (int i = 0; i < 3; i++) {
            LinearLayout navItem = createBottomNavItem(bottomNavIcons[i], bottomNavTexts[i]);
            LinearLayout.LayoutParams navParams = new LinearLayout.LayoutParams(0,
                    LinearLayout.LayoutParams.WRAP_CONTENT, 1f);
            bottomNav.addView(navItem, navParams);
        }

        // Set click listeners for bottom navigation
        setBottomNavClickListeners(bottomNav);

        // Set the main layout as the content view
        setContentView(relativeLayout);
    }

    // Method to set click listeners for bottom navigation items
    private void setBottomNavClickListeners(LinearLayout bottomNav) {
        LinearLayout searchItem = (LinearLayout) bottomNav.getChildAt(0); // Search - First item
        LinearLayout homeItem = (LinearLayout) bottomNav.getChildAt(1); // Home - Second item
        LinearLayout myRecipesItem = (LinearLayout) bottomNav.getChildAt(2); // My Recipes - Third item

        searchItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beranda.this, searching.class); // Replace with actual Search activity
                startActivity(intent);
            }
        });

        homeItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Logic for the Home page (if needed)
            }
        });

        myRecipesItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beranda.this, favorite.class); // Replace with actual My Recipes activity
                startActivity(intent);
            }
        });
    }

    // Method to Create Herb Item
    private RelativeLayout createHerbItem(int imageRes, String name) {
        RelativeLayout layout = new RelativeLayout(this);

        // Herb Image
        ImageView herbImage = new ImageView(this);
        int herbImageId = View.generateViewId(); // Generate dynamic ID
        herbImage.setId(herbImageId);
        herbImage.setImageResource(imageRes);
        herbImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        RelativeLayout.LayoutParams imgParams = new RelativeLayout.LayoutParams(600, 300);
        imgParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        layout.addView(herbImage, imgParams);

        // Herb Name
        TextView herbName = new TextView(this);
        herbName.setText(name);
        herbName.setTextColor(Color.BLACK);
        herbName.setTextSize(16);
        RelativeLayout.LayoutParams nameParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        nameParams.addRule(RelativeLayout.BELOW, herbImageId);
        nameParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        nameParams.topMargin = 8;
        layout.addView(herbName, nameParams);

        // Heart Icon
        ImageView heartIcon = new ImageView(this);
        heartIcon.setImageResource(R.drawable.favorite);
        RelativeLayout.LayoutParams heartParams = new RelativeLayout.LayoutParams(30, 30);
        heartParams.addRule(RelativeLayout.ALIGN_PARENT_END);
        heartParams.setMargins(30, 30, 30, 30);
        layout.addView(heartIcon, heartParams);

        // Set OnClickListener for each herb to navigate to respective recipe pages
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch (name) {
                    case "Lidah Buaya":
                        intent = new Intent(beranda.this, resep_lidah_buaya.class);
                        break;
                    case "Jahe":
                        intent = new Intent(beranda.this, resep_jahe.class);
                        break;
                    case "Buah Bit":
                        intent = new Intent(beranda.this, resep_bit.class);
                        break;
                    case "Bawang Putih":
                        intent = new Intent(beranda.this, resep_bawangp.class);
                        break;
                    case "Daun Sirih":
                        intent = new Intent(beranda.this, resep_daun.class);
                        break;
                    case "Kumis Kucing":
                        intent = new Intent(beranda.this, resep_kumis.class);
                        break;
                    default:
                        intent = new Intent(beranda.this, beranda.class); // Default fallback
                        break;
                }
                startActivity(intent);
            }
        });

        return layout;
    }

    // Method to Create Bottom Navigation Item
    private LinearLayout createBottomNavItem(int iconRes, String text) {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(android.view.Gravity.CENTER);

        // Navigation Icon
        ImageView icon = new ImageView(this);
        icon.setImageResource(iconRes);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(70, 70); // Adjust size
        layout.addView(icon, iconParams);

        // Navigation Text
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setTextColor(Color.WHITE);  // White color for better visibility
        textView.setTextSize(16);  // Larger font size
        textView.setPadding(0, 5, 0, 0);  // Add some padding for better appearance
        layout.addView(textView);

        return layout;
    }
}
