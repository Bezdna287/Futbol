package com.mycompany.app.Futbol;

public class FootballGame 
{
	private Team home;
	private Team away;
	private int totalScore;
	
	public FootballGame(Team home, Team away) {
		super();
		this.home = home;
		this.away = away;
		this.totalScore = home.score+away.score;
	}

	public Team getHome() {
		return home;
	}

	public Team getAway() {
		return away;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	
}
