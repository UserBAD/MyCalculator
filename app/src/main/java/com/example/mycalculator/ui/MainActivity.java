package com.example.mycalculator.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mycalculator.R;
import com.example.mycalculator.StyleActivity;
import com.example.mycalculator.domain.Calculation;

public class MainActivity extends AppCompatActivity implements MainView {
    private TextView resultBox;
    private MainPresenter presenter;
    private static final String SAVE = "SAVE";
    private MainPresenter.State save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultBox = findViewById(R.id.result_box);

        presenter = new MainPresenter(this, new Calculation());

        if (savedInstanceState == null) {
//            save = new MainPresenter.State();
        } else {
            save = savedInstanceState.getParcelable(SAVE);
        }

        findViewById(R.id.key_0).setOnClickListener(view -> {
            presenter.formingNumber(0);

        });
        findViewById(R.id.key_1).setOnClickListener(view -> {
            presenter.formingNumber(1);

        });
        findViewById(R.id.key_2).setOnClickListener(view -> {
            presenter.formingNumber(2);

        });
        findViewById(R.id.key_3).setOnClickListener(view -> {
            presenter.formingNumber(3);

        });
        findViewById(R.id.key_4).setOnClickListener(view -> {
            presenter.formingNumber(4);

        });
        findViewById(R.id.key_5).setOnClickListener(view -> {
            presenter.formingNumber(5);

        });
        findViewById(R.id.key_6).setOnClickListener(view -> {
            presenter.formingNumber(6);

        });
        findViewById(R.id.key_7).setOnClickListener(view -> {
            presenter.formingNumber(7);

        });
        findViewById(R.id.key_8).setOnClickListener(view -> {
            presenter.formingNumber(8);

        });
        findViewById(R.id.key_9).setOnClickListener(view -> {
            presenter.formingNumber(9);

        });
        findViewById(R.id.key_dot).setOnClickListener(view -> {
            presenter.keyDot();

        });
        findViewById(R.id.key_division).setOnClickListener(view -> {
            presenter.keyDivision();

        });
        findViewById(R.id.key_multiplication).setOnClickListener(view -> {
            presenter.keyMultiplication();

        });
        findViewById(R.id.key_minus).setOnClickListener(view -> {
            presenter.keyMinus();

        });
        findViewById(R.id.key_plus).setOnClickListener(view -> {
            presenter.keyPlus();

        });
        findViewById(R.id.key_equal).setOnClickListener(view -> {
            presenter.keyEqual();
        });
        findViewById(R.id.key_theme).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StyleActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void showResult(String result) {
        resultBox.setText(result);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable(SAVE, save);
    }
}