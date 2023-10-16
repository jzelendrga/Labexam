package com.hcdc.endriga.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton loginBtn = findViewById(R.id.loginBtn);
        TextView signupBtn = findViewById(R.id.signupBtn);

        loginBtn.setOnClickListener(v->{
            startActivity(new Intent(this,MainActivity2.class));
        });

        signupBtn.setOnClickListener(v->{
            startActivity(new Intent(this,Main4Activity.class));
        });
    }
}