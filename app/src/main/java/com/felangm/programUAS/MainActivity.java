package com.felangm.programUAS;
//21 May 2019 - 10116137 - Fauzi Elang M - AKB 4
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}