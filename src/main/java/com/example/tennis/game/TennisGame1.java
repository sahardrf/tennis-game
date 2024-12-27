package com.example.tennis.game;

public class TennisGame1 implements TennisGame {

    private Player player1;
    private Player player2;
  
    public TennisGame1(String player1Name, String player2Name) {
      this.player1 = new Player(player1Name);
      this.player2 = new Player(player2Name);
    }
  
    public void wonPoint(String playerName) {
      if (playerName.equals(player1.getName())) {
        player1.incrementScore();
      } else if (playerName.equals(player2.getName())) {
        player2.incrementScore();
      }
    }
  
    public String getScore() {
      TennisScoringStrategy tennisScoringStrategy;
      int score1 = player1.getScore();
      int score2 = player2.getScore();
  
      if (score1 == score2) {
        tennisScoringStrategy = new EqualScoringStrategy();
      } else if (score1 >= 4 || score2 >= 4) {
        tennisScoringStrategy = new WinAdvantageStrategy();
      } else {
        tennisScoringStrategy = new ThirdScoringStrategy();
      }
      return tennisScoringStrategy.getScore(score1, score2);
    }
  }
  