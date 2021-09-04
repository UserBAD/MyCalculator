package com.example.mycalculator.ui;

import android.os.Parcel;
import android.os.Parcelable;


import com.example.mycalculator.domain.Calculator;
import com.example.mycalculator.domain.Operation;

public class MainPresenter {
    private static final int STABLE = 10;
    private final MainView view;
    private final Calculator calculator;
    private Double digitOne = 0.0;
    private Double digitTwo = null;
    private boolean divider = false;
    private int realMultiplier = STABLE;
    private Operation operation;


    public MainPresenter(MainView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }


    public void formingNumber(int value) {
        if (digitTwo == null) {
            digitOne = addDigit(digitOne, value);
            view.showResult(String.valueOf(digitOne));
        } else {
            digitTwo = addDigit(digitTwo, value);
            view.showResult(String.valueOf(digitTwo));
        }
    }

    private double addDigit(double symbolOne, int symbolTwo) {
        if (!divider) {
            return symbolOne * STABLE + symbolTwo;
        } else {
            double result = symbolOne + symbolTwo / (double) realMultiplier;
            realMultiplier *= STABLE;
            return result;
        }
    }

    public void keyDot() {
        if (divider) {
            return;
        }
        divider = true;
        realMultiplier = STABLE;
    }

    public void calculation(Operation type) {
        if (digitTwo == null) {
            operation = type;
            digitTwo = 0.0;
        } else {
            double figure = calculator.calculation(digitOne, digitTwo, operation);
            view.showResult(String.valueOf(figure));
            digitTwo = 0.0;
            digitOne = figure;
            operation = type;
        }
        divider = false;
    }

    public void keyDivision() {
        calculation(Operation.DIVISION);
    }

    public void keyMultiplication() {
        calculation(Operation.MULTIPLICATION);
    }

    public void keyMinus() {
        calculation(Operation.MINUS);
    }

    public void keyPlus() {
        calculation(Operation.PLUS);
    }

    public void keyEqual() {
        calculation(Operation.EQUAL);
    }

    public class State implements Parcelable {

        protected State() {
        }

        protected State(Parcel in) {
            digitOne = in.readDouble();
            digitTwo = in.readDouble();
        }

        public final Creator<State> CREATOR = new Creator<State>() {
            @Override
            public State createFromParcel(Parcel in) {
                return new State(in);
            }

            @Override
            public State[] newArray(int size) {
                return new State[size];
            }
        };

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeDouble(digitOne);
            parcel.writeDouble(digitTwo);

        }
    }

}

