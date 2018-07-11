package com.example.akki.hello_world;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity{

//    private final int SPLASH_DISPLAY_LENGTH = 1000;
//
//    /** Called when the activity is first created. */
//    @Override
//    public void onCreate(Bundle icicle) {
//        super.onCreate(icicle);
//        setContentView(R.layout.splash_screen);
//
//        /* New Handler to start the Menu-Activity
//         * and close this Splash-Screen after some seconds.*/
//        new Handler().postDelayed(new Runnable(){
//            @Override
//            public void run() {
//                /* Create an Intent that will start the Menu-Activity. */
//                Intent mainIntent = new Intent(Splash.this,Menu.class);
//                Splash.this.startActivity(mainIntent);
//                Splash.this.finish();
//            }
//        }, SPLASH_DISPLAY_LENGTH);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}


