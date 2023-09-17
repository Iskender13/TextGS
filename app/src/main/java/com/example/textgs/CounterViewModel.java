package com.example.textgs;

import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
    private int counterValue = 0;

    public int getCounterValue() {
        return counterValue;
    }

    public void setCounterValue(int value) {
        counterValue = value;
    }
}
