package com.luthfiapriyantogmail.unphysics;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.VideoView;


public class videoelastisitas extends ActionBarActivity {
    MediaPlayer player;
    VideoView vid;

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
        setContentView(R.layout.videoelastisitas);

        vid = (VideoView)findViewById(R.id.videoView);
        String uripath ="android.resource://"+ getPackageName()+"/"+ R.raw.elastisitas;
        vid.setVideoURI(Uri.parse(uripath));
        vid.start();

        findViewById(R.id.imageButton5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(videoelastisitas.this, elastis1.class));
                player= MediaPlayer.create(videoelastisitas.this, R.drawable.click);
                player.start();
            }
        });
    }
}
