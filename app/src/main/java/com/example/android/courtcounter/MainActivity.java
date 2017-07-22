package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Global variable initialization for score
    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Test display function
        // displayForTeamA(8);

    }

    public void displayTwoA(View view) {
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    public void displayThreeA (View view) {
        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA);
    }

    public void displayFreeA (View view) {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
