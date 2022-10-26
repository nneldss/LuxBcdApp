package com.demo.luxbcd;

import android.content.Intent;
import android.media.MediaPlayer;
import androidx.core.splashscreen.SplashScreen;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import android.app.Activity;

public class activity_main extends Activity {
    MediaPlayer music;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        music = MediaPlayer.create(activity_main.this,R.raw.sound);
        music.start();
        SplashScreen.installSplashScreen(this);
        setContentView(R.layout.main_activity);

        setContentView(R.layout.main_activity);

        ImageView imgOne = findViewById(R.id.imageView1);
        ImageView imgTwo = findViewById(R.id.imageView2);
        ImageView imgThree = findViewById(R.id.imageView3);
        ImageView imgFour = findViewById(R.id.imageView4);

        imgOne.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_main.this, lfisher.class);
                startActivity(intent);
            }
        });
        imgTwo.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent (activity_main.this, seda.class);
                startActivity(intent);
            }
        });
        imgThree.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent (activity_main.this, stonehill.class);
                startActivity(intent);
            }
        });
        imgFour.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Intent intent = new Intent (activity_main.this, sugarland.class);
                startActivity(intent);
            }
        });
    }
}
