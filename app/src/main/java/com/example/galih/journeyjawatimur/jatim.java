package com.example.galih.journeyjawatimur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jatim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jatim);

        Button btnIjen = (Button) findViewById(R.id.ijen);
        Button btnBanyuwangi = (Button) findViewById(R.id.banyuwangi);
        Button btnBatu = (Button) findViewById(R.id.batu);

        btnIjen.setOnClickListener( new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(jatim.this, Ijen.class);
                startActivity(i);
            }

        });


        btnBanyuwangi.setOnClickListener( new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(jatim.this, Banyuwangi.class);
                startActivity(i);
            }

        });


        btnBatu.setOnClickListener( new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(jatim.this, batu.class);
                startActivity(i);
            }

        });
    }
}
