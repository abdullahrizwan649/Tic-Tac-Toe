package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class StartPage extends AppCompatActivity {


    ImageButton continue_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        getSupportActionBar().hide();

        continue_btn = findViewById(R.id.continue_btn);
        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}