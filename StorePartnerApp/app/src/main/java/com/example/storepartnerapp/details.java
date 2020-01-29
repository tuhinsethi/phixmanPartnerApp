package com.example.storepartnerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class details extends AppCompatActivity {

    String IMEIno = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent i= getIntent();
        IMEIno=i.getStringExtra("IMEIno");
        getSupportActionBar().setTitle(IMEIno);
        TextView tv_imei= (TextView) findViewById(R.id.imei1);
        tv_imei.setText(IMEIno);


    }
    public void onReport(View v){
        Intent i= new Intent (details.this,IssueReport.class);
        startActivity(i);

    }
}
