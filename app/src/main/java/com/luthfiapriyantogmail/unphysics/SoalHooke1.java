package com.luthfiapriyantogmail.unphysics;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class SoalHooke1 extends ActionBarActivity {
    MediaPlayer player;
    ImageButton imageButton4, imageButton3;

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
        setContentView(R.layout.soalhooke1);
        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setVisibility(View.INVISIBLE);
        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setVisibility(View.INVISIBLE);
        findViewById(R.id.imageButton4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoalHooke1.this, PembahasanHooke1.class));
                player= MediaPlayer.create(SoalHooke1.this, R.drawable.click);
                player.start();
            }
        });
        findViewById(R.id.imageButton3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SoalHooke1.this, SoalHooke2.class));
                player= MediaPlayer.create(SoalHooke1.this, R.drawable.click);
                player.start();
            }
        });
    }
    public void a(View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton4.setVisibility(View.VISIBLE);
    }
    public void b(View view) {
        Toast.makeText(this, "Selamat! Jawaban Kamu Benar", Toast.LENGTH_SHORT).show();
        imageButton3.setVisibility(View.VISIBLE);
    }
    public void c(View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton4.setVisibility(View.VISIBLE);
    }
    public void d(View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton4.setVisibility(View.VISIBLE);
    }
    public void e(View view) {
        Toast.makeText(this, "Jawaban Kamu Salah", Toast.LENGTH_SHORT).show();
        imageButton4.setVisibility(View.VISIBLE);
    }
}
