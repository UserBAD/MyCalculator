package com.example.mycalculator.domain;


public class Calculation implements Calculator {

    @Override
    public double calculation(double digitOne, double digitTwo, Operation operation) {
        switch (operation) {
            case DIVISION:
                return digitOne / digitTwo;
            case MULTIPLICATION:
                return digitOne * digitTwo;
            case MINUS:
                return digitOne - digitTwo;
            case PLUS:
                return digitOne + digitTwo;
            case EQUAL:
                return 0;
        }
        return 0;
    }

}
