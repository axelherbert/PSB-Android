package com.example.psb_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Button profilebutton = findViewById(R.id.buttonprofile);
        profilebutton.setOnClickListener(this);
        findViewById(R.id.buttonlearn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonprofile :
                Intent intent = new Intent(this, Profile.class);
                startActivity(intent);
                break;
            case R.id.buttonlearn :
                Intent intent2 = new Intent(this, Learn.class);
                startActivity(intent2);
                break;
        }

    }
}