package com.example.tennis.game;

public class ThirdScoringStrategy implements TennisScoringStrategy{

    @Override
    public String getScore(int score1, int score2) {
        String[] scoreNames = {"Love", "Fifteen", "Thirty", "Forty"};
        return scoreNames[score1] + "-" + scoreNames[score2];
    }
}
