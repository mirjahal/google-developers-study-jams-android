package com.almir.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.score_team_a_text_view) TextView scoreTeamATextView;
    @Bind(R.id.score_team_b_text_view) TextView scoreTeamBTextView;

    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        refreshScoreTeamA();
        refreshScoreTeamB();
    }

    public void addThreePointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        refreshScoreTeamA();
    }

    public void addTwoPointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        refreshScoreTeamA();
    }

    public void addOnePointForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        refreshScoreTeamA();
    }

    public void addThreePointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        refreshScoreTeamB();
    }

    public void addTwoPointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        refreshScoreTeamB();
    }

    public void addOnePointForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        refreshScoreTeamB();
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        refreshScoreTeamA();
        refreshScoreTeamB();
    }

    private void refreshScoreTeamA() {
        scoreTeamATextView.setText("" + scoreTeamA);
    }

    private void refreshScoreTeamB() {
        scoreTeamBTextView.setText("" + scoreTeamB);
    }

}
