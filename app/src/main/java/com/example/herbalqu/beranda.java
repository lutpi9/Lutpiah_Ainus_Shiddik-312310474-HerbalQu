package com.example.herbalqu;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Creating the main RelativeLayout
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(/* your_background_color */);

        // Top ImageView
        ImageView topImage = new ImageView(this);
        topImage.setId(View.generateViewId());
        RelativeLayout.LayoutParams topImageParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, 150);
        topImage.setLayoutParams(topImageParams);
        topImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        topImage.setImageResource(/* your_top_image_resource */);
        relativeLayout.addView(topImage);

        // GridLayout for displaying herb items
        GridLayout herbsGrid = new GridLayout(this);
        herbsGrid.setColumnCount(2);
        herbsGrid.setPadding(16, 16, 16, 16);
        RelativeLayout.LayoutParams gridParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        gridParams.addRule(RelativeLayout.BELOW, topImage.getId());
        herbsGrid.setLayoutParams(gridParams);
        relativeLayout.addView(herbsGrid);

        // Herb images and names arrays
        int[] herbImages = {
                /* your_aloe_vera_image, your_ginger_image, your_beetroot_image,
                   your_garlic_image, your_betel_leaves_image, your_cats_whiskers_image */
        };
        String[] herbNames = {"Lidah buaya", "Jahe", "Buah bit", "Bawang putih", "Daun sirih", "Kumis kucing"};

        // Adding herb items to the grid
        for (int i = 0; i < 6; i++) {
            RelativeLayout herbItem = new RelativeLayout(this);
            GridLayout.LayoutParams itemParams = new GridLayout.LayoutParams(
                    GridLayout.spec(i / 2), GridLayout.spec(i % 2));
            herbItem.setLayoutParams(itemParams);
            herbItem.setPadding(8, 8, 8, 8);

            ImageView herbImage = new ImageView(this);
            RelativeLayout.LayoutParams imageParams = new RelativeLayout.LayoutParams(150, 150);
            herbImage.setLayoutParams(imageParams);
            herbImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
            herbImage.setImageResource(herbImages[i]);
            herbItem.addView(herbImage);

            TextView herbName = new TextView(this);
            RelativeLayout.LayoutParams nameParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            nameParams.addRule(RelativeLayout.BELOW, herbImage.getId());
            nameParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
            nameParams.setMargins(0, 8, 0, 0);
            herbName.setLayoutParams(nameParams);
            herbName.setTextSize(16);
            herbName.setTextColor(/* your_text_color */);
            herbName.setText(herbNames[i]);
            herbItem.addView(herbName);

            herbsGrid.addView(herbItem);
        }

        // Bottom Navigation Bar
        LinearLayout bottomNavigation = new LinearLayout(this);
        bottomNavigation.setOrientation(LinearLayout.HORIZONTAL);
        bottomNavigation.setBackgroundColor(/* your_navigation_background_color */);
        RelativeLayout.LayoutParams bottomParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        bottomParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        bottomNavigation.setLayoutParams(bottomParams);
        relativeLayout.addView(bottomNavigation);

        // Navigation items
        String[] navItems = {"Search", "Home", "My Recipes"};
        int[] navIcons = { /* your_search_icon, your_home_icon, your_recipe_icon */ };
        for (int i = 0; i < navItems.length; i++) {
            LinearLayout navItem = new LinearLayout(this);
            navItem.setOrientation(LinearLayout.VERTICAL);
            navItem.setPadding(16, 16, 16, 16);

            ImageView navIcon = new ImageView(this);
            navIcon.setImageResource(navIcons[i]);
            navItem.addView(navIcon);

            TextView navLabel = new TextView(this);
            navLabel.setText(navItems[i]);
            navLabel.setTextColor(/* your_text_color */);
            navItem.addView(navLabel);

            bottomNavigation.addView(navItem);
        }

        // Set the content view to the relative layout
        setContentView(relativeLayout);
    }
}
