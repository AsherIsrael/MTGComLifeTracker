package com.example.user.mtglifetracker;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by User on 9/12/2017.
 */

public class Player extends BaseObservable {

    private int lifeTotal;

    private String name;

    public Player(int number) {
        lifeTotal = 40;
        name = String.format("Player%d", number);
    }

    @Bindable
    public int getLifeTotal() {
        return lifeTotal;
    }

    public void setLifeTotal(int total) {
        lifeTotal = total;
        notifyPropertyChanged(BR.lifeTotal);
    }

    public void updateLifeTotal(int modifier) {

        setLifeTotal(lifeTotal + modifier);
    }

    @Bindable
    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}