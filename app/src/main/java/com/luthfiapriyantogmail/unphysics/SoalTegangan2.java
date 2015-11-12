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


public class SoalTegangan2 extends ActionBarActivity {
    MediaPlayer player;
    ImageButton imageButton6, imageButton7;

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
        setContentView(R.layout.soaltegangan2);
        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setVisibility(View.INVISIBLE);
        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton7.setVisibility(View.INVISIBLE);

        findViewById(R.id.imageButton6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoalTegangan2.this, PembahasanTegangan2.class));
                player= MediaPlayer.create(SoalTegangan2.this, R.drawable.click);
                player.start();
            }
        });
        findViewById(R.id.imageButton7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoalTegangan2.this, SoalTegangan3.class));
                player= MediaPlayer.create(SoalTegangan2.this, R.drawable.click);
                player.start();
            }
        });
    }
    public void button(View view) {
        Toast.makeText(this, "Selamat! Jawaban Kamu Benar", Toast.LENGTH_SHORT).show();
        imageButton7.setVisibility(View.VISIBLE);
    }
    public void button2 (View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton6.setVisibility(View.VISIBLE);
    }
    public void button3 (View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton6.setVisibility(View.VISIBLE);
    }
    public void button4 (View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton6.setVisibility(View.VISIBLE);
    }
    public void button5 (View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton6.setVisibility(View.VISIBLE);
    }

}
