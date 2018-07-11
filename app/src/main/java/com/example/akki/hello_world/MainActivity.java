package com.example.akki.hello_world;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Button addBtn;
    Button subBtn;
    EditText fn;
    EditText sn;
    TextView ans;
    Button intbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fn = (EditText)findViewById(R.id.editText);
        sn = (EditText)findViewById(R.id.editText2);
        ans = (TextView)findViewById(R.id.textView3);
        addBtn = (Button)findViewById(R.id.button2);
        subBtn = (Button)findViewById(R.id.button);
        intbtn = (Button)findViewById(R.id.button3);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1 = Double.parseDouble(fn.getText().toString());
                Double num2 = Double.parseDouble(sn.getText().toString());
                Double sum = num1 + num2;
                ans.setText(sum.toString());
            }
        });
        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1 = Double.parseDouble(fn.getText().toString());
                Double num2 = Double.parseDouble(sn.getText().toString());
                Double sub = num1 - num2;
                ans.setText(sub.toString());
                Toast.makeText(MainActivity.this,sub.toString(),Toast.LENGTH_LONG).show();
            }
        });
//        intbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent inte = new Intent(MainActivity.this,Splash.class);
//                startActivity(inte);
//                finish();

//                Intent sendIntent = new Intent();
//                sendIntent.setAction(Intent.ACTION_SEND);
//                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is a message");
//                sendIntent.setType("text/plain");

                // Verify that the intent will resolve to an activity
//                if (sendIntent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(sendIntent);

//                }
            }

            public  void onClick(View view) {
                Intent inte = new Intent(this, IntentActivity.class);
                String text = subBtn.getText().toString();
                inte.putExtra("Value",text);
                startActivity(inte);
                finish();
                Toast.makeText(this,"Changing activity",Toast.LENGTH_LONG).show();
            }

            public void callMardi(View view){
                Intent i = new Intent(Intent.ACTION_DIAL);
                String num2 =sn.getText().toString();
                i.setData(Uri.parse("tel:"+num2));
                if(ActivityCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
                    Toast.makeText(this,"Teri maa ki bc, permission de na phone karne ki",Toast.LENGTH_LONG).show();
                }
                else{
                    startActivity(i);
                }
                finish();
            }
    }

