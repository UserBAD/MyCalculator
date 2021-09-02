package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.mycalculator.domain.AppTheme;
import com.example.mycalculator.domain.ThemeStorage;

public class StyleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style);

        ThemeStorage storage = new ThemeStorage(this);

        setTheme(storage.getAppTheme().getTheme());

        setContentView(R.layout.activity_style);


        findViewById(R.id.key1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storage.setAppTheme(AppTheme.THEMEONE);
                recreate();
            }
        });

        findViewById(R.id.key2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                storage.setAppTheme(AppTheme.THEMETWO);
                recreate();
            }
        });
    }
}