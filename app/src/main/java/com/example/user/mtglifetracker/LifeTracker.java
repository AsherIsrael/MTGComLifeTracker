package com.example.user.mtglifetracker;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.user.mtglifetracker.databinding.ActivityLifeTrackerBinding;



public class LifeTracker extends AppCompatActivity {

    public ObservableArrayList<Player> players;
    public int playerCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        players = new ObservableArrayList<Player>();
        playerCount = 1;
        players.add(new Player(this.playerCount));
        players.add(new Player(2));


        ActivityLifeTrackerBinding binding;
        binding = DataBindingUtil.setContentView(this, R.layout.activity_life_tracker);

        binding.setAppListener(this);
        binding.setPlayers(players);
        binding.testDisplay.setPlayer(players.get(0));
        binding.testDisplay2.setPlayer((players.get(1)));
    }

    public void updateLife(View view) {
        int modifier = ((LifeButtonView)view).getModifier();
        int idx = ((LifeButtonView)view).getPlayerIdx();
        players.get(idx).updateLifeTotal(modifier);
    }

    public void testButton(View view) {
        players.get(0).setName("it worked");
    }
}
