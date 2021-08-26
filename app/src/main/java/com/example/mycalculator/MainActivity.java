package com.example.mycalculator;

import static java.lang.String.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView input_box;
    private double number;
    public String sung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_box = findViewById(R.id.input_box);


        findViewById(R.id.key_0).setOnClickListener(view -> {
            number = 0;

        });
        findViewById(R.id.key_1).setOnClickListener(view -> {
            number = 1;

        });
        findViewById(R.id.key_2).setOnClickListener(view -> {
            number = 2;

        });
        findViewById(R.id.key_3).setOnClickListener(view -> {
            number = 3;

        });
        findViewById(R.id.key_4).setOnClickListener(view -> {
            number = 4;

        });
        findViewById(R.id.key_5).setOnClickListener(view -> {
            number = 5;

        });
        findViewById(R.id.key_6).setOnClickListener(view -> {
            number = 6;

        });
        findViewById(R.id.key_7).setOnClickListener(view -> {
            number = 7;

        });
        findViewById(R.id.key_8).setOnClickListener(view -> {
            number = 8;

        });
        findViewById(R.id.key_9).setOnClickListener(view -> {
            number = 9;

        });
        findViewById(R.id.key_dot).setOnClickListener(view -> {
            sung = ".";

        });
        findViewById(R.id.key_division).setOnClickListener(view -> {
            sung = "/";

        });
        findViewById(R.id.key_multiplication).setOnClickListener(view -> {
            sung = "*";

        });
        findViewById(R.id.key_minus).setOnClickListener(view -> {
            sung = "-";

        });
        findViewById(R.id.key_plus).setOnClickListener(view -> {
            sung = "+";

        });


    }


}