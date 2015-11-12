package com.luthfiapriyantogmail.unphysics;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity {
    MediaPlayer player;

    AnimatorSet sunAnimatorSet;
    AnimatorSet cloud1AnimatorSet;
    AnimatorSet cloud2AnimatorSet;
    ValueAnimator skyAnimator;
    ValueAnimator groundAnimator;

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
        setContentView(R.layout.activity_main);

        ImageButton a = (ImageButton) findViewById(R.id.imageButton12);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Pop.class));
            }
        });
        ImageButton b = (ImageButton) findViewById(R.id.imageButton13);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Popup.class));
            }
        });


        ImageView img_animation = (ImageView) findViewById(R.id.gambar1);

        final TranslateAnimation animation = new TranslateAnimation(-80f, 80f, 0.0f, 0.0f);
        //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
        animation.setDuration(3000);  // animation duration
        animation.setRepeatCount(1000);  // animation repeat count
        animation.setRepeatMode(2);   // repeat animation (left to right, right to left )
        //animation.setFillAfter(true);

        img_animation.startAnimation(animation);  // start animation

        findViewById(R.id.playbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, stage1.class));
                player= MediaPlayer.create(MainActivity.this, R.drawable.click);
                player.start();


            }
        });

    }

}
