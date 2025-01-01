package com.example.herbalqu;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class resep_daun extends AppCompatActivity {

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
        statusBarLayout.setId(View.generateViewId()); // Assign ID
        statusBarLayout.setOrientation(LinearLayout.HORIZONTAL);
        statusBarLayout.setGravity(Gravity.CENTER_VERTICAL);
        statusBarLayout.setPadding(0, 0, 0, 8);

        // Create TextView for time
        TextView timeTextView = new TextView(this);
        timeTextView.setText("9:41");
        timeTextView.setTextSize(14);
        timeTextView.setTextColor(getResources().getColor(android.R.color.black));

        // Create LinearLayout for the "dots"
        LinearLayout dotsLayout = new LinearLayout(this);
        dotsLayout.setOrientation(LinearLayout.HORIZONTAL);
        dotsLayout.setGravity(Gravity.END);
        LinearLayout.LayoutParams dotsParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        dotsParams.weight = 1;
        dotsLayout.setLayoutParams(dotsParams);

        // Create Views for the "dots"
        View dot1 = new View(this);
        dot1.setLayoutParams(new LinearLayout.LayoutParams(10, 10));
        dot1.setBackgroundResource(R.drawable.button_back);

        View dot2 = new View(this);
        dot2.setLayoutParams(new LinearLayout.LayoutParams(10, 10));
        dot2.setBackgroundResource(R.drawable.button_back);
        LinearLayout.LayoutParams margin2 = (LinearLayout.LayoutParams) dot2.getLayoutParams();
        margin2.setMarginStart(4);

        View dot3 = new View(this);
        dot3.setLayoutParams(new LinearLayout.LayoutParams(10, 10));
        dot3.setBackgroundResource(R.drawable.button_back);
        LinearLayout.LayoutParams margin3 = (LinearLayout.LayoutParams) dot3.getLayoutParams();
        margin3.setMarginStart(4);

        // Add Views to dotsLayout
        dotsLayout.addView(dot1);
        dotsLayout.addView(dot2);
        dotsLayout.addView(dot3);

        // Add timeTextView and dotsLayout to statusBarLayout
        statusBarLayout.addView(timeTextView);
        statusBarLayout.addView(dotsLayout);

        // ImageView for Image
        ImageView imageView = new ImageView(this);
        imageView.setId(View.generateViewId()); // Assign ID
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, 200));
        ((RelativeLayout.LayoutParams) imageView.getLayoutParams()).addRule(RelativeLayout.BELOW, statusBarLayout.getId());
        imageView.setImageResource(R.drawable.daun_sirih);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        // Text Content
        TextView contentTextView = new TextView(this);
        contentTextView.setId(View.generateViewId()); // Assign ID
        contentTextView.setText("Daun sirih memiliki banyak manfaat untuk kesehatan, di antaranya:");
        contentTextView.setTextSize(14);
        contentTextView.setTextColor(getResources().getColor(android.R.color.black));
        RelativeLayout.LayoutParams contentParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        contentParams.addRule(RelativeLayout.BELOW, imageView.getId());
        contentTextView.setLayoutParams(contentParams);

        // Bullet Points LinearLayout
        LinearLayout bulletPointsLayout = new LinearLayout(this);
        bulletPointsLayout.setId(View.generateViewId()); // Assign ID
        bulletPointsLayout.setOrientation(LinearLayout.VERTICAL);
        bulletPointsLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
        bulletPointsLayout.setPadding(0, 8, 0, 0);
        RelativeLayout.LayoutParams bulletParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        bulletParams.addRule(RelativeLayout.BELOW, contentTextView.getId());

        // Bullet Point TextViews
        TextView point1 = new TextView(this);
        point1.setText("• Membantu menyembuhkan luka. Protein dalam daun sirih dapat membantu proses penyembuhan luka.");
        point1.setTextSize(14);
        point1.setTextColor(getResources().getColor(android.R.color.black));
        bulletPointsLayout.addView(point1);

        TextView point2 = new TextView(this);
        point2.setText("• Menjaga kesehatan mulut dan gigi. Daun sirih dapat membantu mengurangi pertumbuhan bakteri.");
        point2.setTextSize(14);
        point2.setTextColor(getResources().getColor(android.R.color.black));
        bulletPointsLayout.addView(point2);

        TextView point3 = new TextView(this);
        point3.setText("• Membantu mencegah infeksi bakteri. Daun sirih memiliki sifat antibakteri.");
        point3.setTextSize(14);
        point3.setTextColor(getResources().getColor(android.R.color.black));
        bulletPointsLayout.addView(point3);

        // Green Box LinearLayout
        LinearLayout greenBoxLayout = new LinearLayout(this);
        greenBoxLayout.setId(View.generateViewId()); // Assign ID
        greenBoxLayout.setOrientation(LinearLayout.VERTICAL);
        greenBoxLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        greenBoxLayout.setPadding(8, 8, 8, 8);
        RelativeLayout.LayoutParams greenBoxParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        greenBoxParams.addRule(RelativeLayout.BELOW, bulletPointsLayout.getId());

        // Text inside Green Box
        TextView greenBoxText = new TextView(this);
        greenBoxText.setText("Daun sirih dapat digunakan untuk menjaga kesehatan mulut dengan berbagai cara, seperti:");
        greenBoxText.setTextSize(14);
        greenBoxText.setTextColor(getResources().getColor(android.R.color.black));
        greenBoxLayout.addView(greenBoxText);

        TextView greenBoxPoint = new TextView(this);
        greenBoxPoint.setText("• Berkumur dengan air rebusan daun sirih. Air rebusan daun sirih dapat menghambat bakteri mulut.");
        greenBoxPoint.setTextSize(14);
        greenBoxPoint.setTextColor(getResources().getColor(android.R.color.black));
        greenBoxLayout.addView(greenBoxPoint);

        // Back Button
        ImageButton backButton = new ImageButton(this);
        backButton.setLayoutParams(new RelativeLayout.LayoutParams(48, 48));
        ((RelativeLayout.LayoutParams) backButton.getLayoutParams()).addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        ((RelativeLayout.LayoutParams) backButton.getLayoutParams()).addRule(RelativeLayout.CENTER_HORIZONTAL);
        backButton.setBackgroundResource(R.drawable.button_back);
        backButton.setImageResource(R.drawable.button_back);

        // Add Views to RelativeLayout
        relativeLayout.addView(statusBarLayout);
        relativeLayout.addView(imageView);
        relativeLayout.addView(contentTextView);
        relativeLayout.addView(bulletPointsLayout);
        relativeLayout.addView(greenBoxLayout);
        relativeLayout.addView(backButton);

        // Set the content view
        setContentView(relativeLayout);
    }
}
