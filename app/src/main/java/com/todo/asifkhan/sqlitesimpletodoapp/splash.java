package com.todo.asifkhan.sqlitesimpletodoapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aork.todo.R;
import com.example.aork.todo.activities.MainActivity;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =  new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2500);
    }
}
