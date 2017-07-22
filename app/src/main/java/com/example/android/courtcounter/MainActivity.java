package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Global variable initialization for teams A and B's score counters
    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Test display function
        // displayForTeamA(8);
    }

    /**
     *  Displays for Team A
     */
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

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays for Team B
     */
    public void displayTwoB(View view) {
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }

    public void displayThreeB (View view) {
        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }

    public void displayFreeB (View view) {
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset Button
     */
    public void resetScores(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
