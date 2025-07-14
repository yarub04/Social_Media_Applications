package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private ImageView chosenIcon;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        chosenIcon = findViewById(R.id.chosenIcon);
        loginButton = findViewById(R.id.loginButton);

        int iconResId = getIntent().getIntExtra("ICON_RES_ID", 0);
        if (iconResId != 0) {
            chosenIcon.setImageResource(iconResId);
        }


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this,
                        "You have logged on " + getAppName(iconResId) + " successfully",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String getAppName(int iconResId) {
        if (iconResId == R.drawable.facebook_ico) {
            return "Facebook";
        } else if (iconResId == R.drawable.x_ico) {
            return "X";
        } else if (iconResId == R.drawable.instagram_ico) {
            return "Instagram";
        } else if (iconResId == R.drawable.linkedin_ico) {
            return "LinkedIn";
        } else if (iconResId == R.drawable.snapchat_ico) {
            return "Snapchat";
        } else if (iconResId == R.drawable.reddit_ico) {
            return "Reddit";
        } else if (iconResId == R.drawable.tiktok_ico) {
            return "Tiktok";
        } else {
            return "App";
        }
    }
}
