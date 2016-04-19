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

    public void addPointForTeamA(View view) {
        int points = 0;

        switch (view.getId()) {
            case R.id.one_point_team_a_button:
                points = 1;
                break;
            case R.id.two_points_team_a_button:
                points = 2;
                break;
            case R.id.three_points_team_a_button:
                points = 3;
                break;
        }

        scoreTeamA = scoreTeamA + points;
        refreshScoreTeamA();
    }

    public void addPointForTeamB(View view) {
        int points = 0;

        switch (view.getId()) {
            case R.id.one_point_team_b_button:
                points = 1;
                break;
            case R.id.two_points_team_b_button:
                points = 2;
                break;
            case R.id.three_points_team_b_button:
                points = 3;
                break;
        }

        scoreTeamB = scoreTeamB + points;
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
