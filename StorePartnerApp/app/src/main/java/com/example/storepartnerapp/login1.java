package com.example.storepartnerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);


    }
    public void onLogin(View v){
        Intent i= new Intent(login1.this,authenticate.class);
        startActivity(i);

    }
    public void onTrouble(View v){
        Intent i= new Intent(login1.this,onErrorLogin.class);
        startActivity(i);
    }
}
