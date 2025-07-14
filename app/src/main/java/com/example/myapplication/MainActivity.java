package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button facebookButton, xButton, instagramButton, linkedinButton, snapchatButton, redditButton, tiktokButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebookButton = findViewById(R.id.facebookButton);
        xButton = findViewById(R.id.xButton);
        instagramButton = findViewById(R.id.instagramButton);
        linkedinButton = findViewById(R.id.linkedinButton);
        snapchatButton = findViewById(R.id.snapchatButton);
        redditButton = findViewById(R.id.redditButton);
        tiktokButton = findViewById(R.id.tiktokButton);

        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToLogin(R.drawable.facebook_ico);
            }
        });

        xButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToLogin(R.drawable.x_ico);
            }
        });

        instagramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToLogin(R.drawable.instagram_ico);
            }
        });

        linkedinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToLogin(R.drawable.linkedin_ico);
            }
        });

        snapchatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToLogin(R.drawable.snapchat_ico);
            }
        });

        redditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToLogin(R.drawable.reddit_ico);
            }
        });
        tiktokButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToLogin(R.drawable.tiktok_ico);
            }
        });


    }
    private void navigateToLogin(int iconResId) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("ICON_RES_ID", iconResId);
        startActivity(intent);
    }
}
