package com.luthfiapriyantogmail.unphysics;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class stage1 extends ActionBarActivity {
    MediaPlayer player;
    ImageView imageView6, imageView7, imageView8, imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.stage1);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        findViewById(R.id.stage1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(stage1.this, Rule.class));
                player = MediaPlayer.create(stage1.this, R.drawable.click);
                player.start();
            }
        });
        findViewById(R.id.stage2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(stage1.this, Rule2.class));
                player = MediaPlayer.create(stage1.this, R.drawable.click);
                player.start();
            }
        });
        findViewById(R.id.stage3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(stage1.this, Rule3.class));
                player = MediaPlayer.create(stage1.this, R.drawable.click);
                player.start();
            }
        });
        findViewById(R.id.stage4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(stage1.this, Rule4.class));
                player = MediaPlayer.create(stage1.this, R.drawable.click);
                player.start();
            }
        });
    }
}
