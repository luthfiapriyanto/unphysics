package com.luthfiapriyantogmail.unphysics;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login1 extends ActionBarActivity {
    private TextView edittext;
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
        setContentView(R.layout.login1);
    }

    public void submit(View view){
        String enteredPassword = ((EditText) findViewById(R.id.PasswordTegangan)).getText().toString();
        if(enteredPassword.matches("alberteinstein"))
        {
            Intent intent = new Intent(Login1.this, SoalTegangan.class);
            startActivity(intent);
        }else {Toast.makeText(getApplicationContext(), "Kata Kunci Salah",
                Toast.LENGTH_SHORT).show();
        }
    }


}
