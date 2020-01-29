package com.example.storepartnerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class authenticate extends AppCompatActivity {

    String IMEIno= "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authenticate);

        EditText IMEI = (EditText)findViewById(R.id.IMEI);
         IMEIno = IMEI.getText().toString();


    }
    public void onSubmitIMEI(View v){
        Intent i = new Intent(authenticate.this,details.class);


        i.putExtra("IMEIno",IMEIno);
        startActivity(i);
    }
    public void onQRCODE(View v){
        Intent i = new Intent(authenticate.this,details.class);
        startActivity(i);
    }
}
