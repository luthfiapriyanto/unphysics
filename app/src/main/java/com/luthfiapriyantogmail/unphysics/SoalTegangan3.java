package com.luthfiapriyantogmail.unphysics;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class SoalTegangan3 extends ActionBarActivity {
    MediaPlayer player;
    ImageButton imageButton9, imageButton10;

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
        setContentView(R.layout.soaltegangan3);
        imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        imageButton9.setVisibility(View.INVISIBLE);
        imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
        imageButton10.setVisibility(View.INVISIBLE);

        findViewById(R.id.imageButton9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoalTegangan3.this, PembahasanTegangan3.class));
                player = MediaPlayer.create(SoalTegangan3.this, R.drawable.click);
                player.start();
            }

        });
        findViewById(R.id.imageButton10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoalTegangan3.this, stage2.class));
                player = MediaPlayer.create(SoalTegangan3.this, R.drawable.click);
                player.start();
            }
        });

    }
    public void button5(View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton9.setVisibility(View.VISIBLE);
    }
    public void button6 (View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton9.setVisibility(View.VISIBLE);
    }
    public void button7 (View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton9.setVisibility(View.VISIBLE);
    }
    public void button8 (View view) {
        Toast.makeText(this, "Selamat! Jawaban Kamu Benar", Toast.LENGTH_SHORT).show();
        imageButton10.setVisibility(View.VISIBLE);
    }
    public void button9(View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton9.setVisibility(View.VISIBLE);
    }



}
