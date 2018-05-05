package com.example.galih.journeyjawatimur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTema = (Button) findViewById(R.id.btn_tema);

        btnTema.setOnClickListener( new View.OnClickListener() {

            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, pendahuluan.class);
                startActivity(i);
            }

        });
    }

}
