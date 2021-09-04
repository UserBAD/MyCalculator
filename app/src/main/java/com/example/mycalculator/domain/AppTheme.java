package com.example.mycalculator.domain;

import com.example.mycalculator.R;

public enum AppTheme {

    THEMEONE(R.style.CalcTheme, "standard"),
    THEMETWO(R.style.CalcThemeOrange, "orange");

    private final int theme;
    private final String key;

    AppTheme(int value, String key) {
        this.theme = value;
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public int getTheme() {
        return theme;
    }
}
