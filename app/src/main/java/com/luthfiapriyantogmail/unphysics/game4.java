package com.luthfiapriyantogmail.unphysics;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class game4 extends ActionBarActivity {
    private TextView ra, oa, ba,ea,raa,ta,ha,oaa,oaaa,ka,eaa,congrats;
    private ImageButton next;
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
        setContentView(R.layout.game4);
        findViewById(R.id.imageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(game4.this, MenuPegas1.class));
                player = MediaPlayer.create(game4.this, R.drawable.click);
                player.start();

            }
        });
        ra = (TextView) findViewById(R.id.textView2);
        ra.setVisibility(View.INVISIBLE);
        oa = (TextView) findViewById(R.id.textView);
        oa.setVisibility(View.INVISIBLE);
        ba = (TextView) findViewById(R.id.textView3);
        ba.setVisibility(View.INVISIBLE);
        ea = (TextView) findViewById(R.id.textView4);
        ea.setVisibility(View.INVISIBLE);
        raa = (TextView) findViewById(R.id.textView5);
        raa.setVisibility(View.INVISIBLE);
        ta = (TextView) findViewById(R.id.textView6);
        ta.setVisibility(View.INVISIBLE);
        ha = (TextView) findViewById(R.id.textView7);
        ha.setVisibility(View.INVISIBLE);
        oaa = (TextView) findViewById(R.id.textView8);
        oaa.setVisibility(View.INVISIBLE);
        oaaa = (TextView) findViewById(R.id.textView9);
        oaaa.setVisibility(View.INVISIBLE);
        ka = (TextView) findViewById(R.id.textView10);
        ka.setVisibility(View.INVISIBLE);
        eaa = (TextView) findViewById(R.id.textView11);
        eaa.setVisibility(View.INVISIBLE);
        congrats = (TextView) findViewById(R.id.textView12);
        congrats.setVisibility(View.INVISIBLE);
        next = (ImageButton) findViewById(R.id.imageButton);
        next.setVisibility(View.INVISIBLE);
    }
    int x = 0;
    public void r (View view) {
        ra.setVisibility(View.VISIBLE);
        raa.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 7) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void o (View view) {
        oa.setVisibility(View.VISIBLE);
        oaa.setVisibility(View.VISIBLE);
        oaaa.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 7) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void b (View view) {
        ba.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 7) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void e (View view) {
        ea.setVisibility(View.VISIBLE);
        eaa.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 7) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void t (View view) {
        ta.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 7) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void h (View view) {
        ha.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 7) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void k (View view) {
        ka.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 7) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
}