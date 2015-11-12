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


public class game3 extends ActionBarActivity {
    private TextView ta, ha,oaa,ma,aa,sa,yaa,oa,ua,na,ga,congrats;
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
        setContentView(R.layout.game3);
        findViewById(R.id.imageButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(game3.this, MenuHooke1.class));
                player = MediaPlayer.create(game3.this, R.drawable.click);
                player.start();
            }
        });
        ta = (TextView) findViewById(R.id.textView2);
        ta.setVisibility(View.INVISIBLE);
        ha = (TextView) findViewById(R.id.textView);
        ha.setVisibility(View.INVISIBLE);
        oaa = (TextView) findViewById(R.id.textView3);
        oaa.setVisibility(View.INVISIBLE);
        ma = (TextView) findViewById(R.id.textView4);
        ma.setVisibility(View.INVISIBLE);
        aa = (TextView) findViewById(R.id.textView5);
        aa.setVisibility(View.INVISIBLE);
        sa = (TextView) findViewById(R.id.textView6);
        sa.setVisibility(View.INVISIBLE);
        yaa = (TextView) findViewById(R.id.textView7);
        yaa.setVisibility(View.INVISIBLE);
        oa = (TextView) findViewById(R.id.textView8);
        oa.setVisibility(View.INVISIBLE);
        ua = (TextView) findViewById(R.id.textView9);
        ua.setVisibility(View.INVISIBLE);
        na = (TextView) findViewById(R.id.textView10);
        na.setVisibility(View.INVISIBLE);
        ga = (TextView) findViewById(R.id.textView11);
        ga.setVisibility(View.INVISIBLE);
        congrats = (TextView) findViewById(R.id.textView12);
        congrats.setVisibility(View.INVISIBLE);
        next = (ImageButton) findViewById(R.id.imageButton);
        next.setVisibility(View.INVISIBLE);
    }
    int x = 0;
    public void t (View view) {
        ta.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 10) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void h (View view) {
        ha.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 10) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void o (View view) {
        oaa.setVisibility(View.VISIBLE);
        oa.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 10) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void m (View view) {
        ma.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 10) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void a (View view) {
        aa.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 10) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void s (View view) {
        sa.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 10) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void y (View view) {
        yaa.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 10) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void u (View view) {
        ua.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 10) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void n (View view) {
        na.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 10) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
    public void g (View view) {
        ga.setVisibility(View.VISIBLE);
        x += 1;
        if (x == 10) {
            congrats.setVisibility(View.VISIBLE);
            next.setVisibility(View.VISIBLE);
        }
    }
}
