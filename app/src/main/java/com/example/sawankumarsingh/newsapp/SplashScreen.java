package com.example.sawankumarsingh.newsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

// Using Activity instead of AppCompatActivity we will easily make full screen...
public class SplashScreen extends Activity {

    private static int TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent nextActivity = new Intent(SplashScreen.this, NewsActivity.class);
                startActivity(nextActivity);
                finish();
            }
        }, TIME_OUT);
    }
}
