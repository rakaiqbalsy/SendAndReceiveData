package com.bso.informatika.sendandreceivedata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText nama, nim;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama =(EditText)findViewById(R.id.fieldnama);
        nim = (EditText)findViewById(R.id.fieldnim);
        btn = (Button) findViewById(R.id.sendbutton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this, Receive.class);
                i.putExtra("Send", nama.getText().toString()+"   "+nim.getText().toString());
                startActivity(i);
            }
        });
    }
}
