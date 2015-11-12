package com.luthfiapriyantogmail.unphysics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginElastis extends ActionBarActivity {
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
        setContentView(R.layout.loginelastis);
    }
    public void submit(View view){
        String enteredPassword = ((EditText) findViewById(R.id.PasswordTegangan)).getText().toString();
        if(enteredPassword.matches("isaacnewton"))
        {
            Intent intent = new Intent(LoginElastis.this, SoalElastis1.class);
            startActivity(intent);
        }else {Toast.makeText(getApplicationContext(), "Kata Kunci Salah",
                Toast.LENGTH_SHORT).show();
        }
    }
}
