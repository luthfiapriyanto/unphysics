package com.luthfiapriyantogmail.unphysics;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;


public class MenuTegangan2 extends ActionBarActivity {
    MediaPlayer player;

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

        setContentView(R.layout.menutegangan2);

        ImageView img_animation = (ImageView) findViewById(R.id.imageView);

        TranslateAnimation animation = new TranslateAnimation(60f, -40f, 0.0f, 0.0f);
        //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
        animation.setDuration(3000);  // animation duration
        //animation.setRepeatCount(0);  // animation repeat count
        //animation.setRepeatMode(0);   // repeat animation (left to right, right to left )
        animation.setFillAfter(true);
        img_animation.startAnimation(animation);  // start animation


        findViewById(R.id.tombolketegangan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuTegangan2.this, MateriRegangan.class));
                player= MediaPlayer.create(MenuTegangan2.this, R.drawable.click);
                player.start();
            }
        });
    }

}
