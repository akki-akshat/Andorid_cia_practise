package com.example.akki.hello_world;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;

public class IntentActivity extends AppCompatActivity {

    Button btn5;
    @Override
    protected void onCreate(Bundle savedInctance){
        super.onCreate(savedInctance);
        setContentView(R.layout.splash_screen);
        btn5=(Button)findViewById(R.id.button5);
        btn5.setText(getIntent().getExtras().getString("Value"));
    }

    public void swbtnClick(View v) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
