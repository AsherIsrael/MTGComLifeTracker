package com.example.user.mtglifetracker;

import android.databinding.BaseObservable;
import android.databinding.Bindable;



/**
 * Created by User on 9/7/2017.
 */



public class LifeTotal extends BaseObservable {
    private int total;

    public LifeTotal(int total) {

        this.total = total;
    }

    @Bindable
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
        notifyPropertyChanged(BR.total);
    }

    public void updateTotal(int modifier) {

        setTotal(total + modifier);
    }

}

