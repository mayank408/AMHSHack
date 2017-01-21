package com.example.mayanktripathi.smartgrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by mayanktripathi on 21/01/17.
 */

public class Login extends AppCompatActivity {

    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register = (Button) findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Click!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Login.this,appliances.class);
                startActivity(i);
            }
        });
    }
}
