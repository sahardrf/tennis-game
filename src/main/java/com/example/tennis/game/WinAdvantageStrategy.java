package com.example.tennis.game;

public class WinAdvantageStrategy implements TennisScoringStrategy {

    @Override
    public String getScore(int player1Score, int player2Score) {
      int minusResult = player1Score - player2Score;
      if (minusResult == 1) return "Advantage player1";
      else if (minusResult == -1) return "Advantage player2";
      else if (minusResult >= 2) return "Win for player1";
      else return "Win for player2";
    }
  }
  