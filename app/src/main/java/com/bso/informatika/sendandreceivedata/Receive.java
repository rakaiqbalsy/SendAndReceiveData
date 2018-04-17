package com.bso.informatika.sendandreceivedata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Receive extends AppCompatActivity {

    TextView tampil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        tampil = (TextView) findViewById(R.id.tampilan);
        Intent i = getIntent();
        String send = i.getStringExtra("Send");

        tampil.setText(send);
    }
}
