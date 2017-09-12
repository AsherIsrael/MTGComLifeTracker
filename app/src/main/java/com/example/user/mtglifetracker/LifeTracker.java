package com.example.user.mtglifetracker;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.user.mtglifetracker.databinding.ActivityLifeTrackerBinding;



public class LifeTracker extends AppCompatActivity {

    public LifeTotal LIFE_TOTAL;

//    private ActivityLifeTrackerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LIFE_TOTAL = new LifeTotal(20);
        ActivityLifeTrackerBinding binding;
        binding = DataBindingUtil.setContentView(this, R.layout.activity_life_tracker);
//        setContentView(R.layout.activity_life_tracker);
        binding.setPlayerLifeTotal(LIFE_TOTAL);
    }

    public void updateLife(View view) {
        Object test = view.getTag();
        int modifier = Integer.parseInt((String)test);
        LIFE_TOTAL.updateTotal(modifier);
    }

}
