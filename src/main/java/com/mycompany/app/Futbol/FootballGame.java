package com.mycompany.app.Futbol;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FootballGame 
{
	private String homeTeamName, awayTeamName;
	private int homeTeamScore, awayTeamScore;
	
	
	public void FootballGame(String homeTeamName, String awayTeamName, int homeTeamScore, int awayTeamScore){
		this.homeTeamScore = homeTeamScore;
		this.awayTeamScore = awayTeamScore;
		this.homeTeamName = homeTeamName;
		this.awayTeamName = awayTeamName;
	}

	private static void shuffle(String [] arr)
    {
        int index;
        String temp;
        Random rand = new Random();
        int i = arr.length - 1;
        while ( i > 0)
        {
            index = rand.nextInt(i + 1);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            i--;
        }
    }
	
	public void startNewGameSet(String[] teams) {
		int teamsLength = teams.length;
		String [] copy = Arrays.copyOf(teams, teamsLength);
		shuffle(copy);

        for (int i = 0; i < teamsLength; ++i) {
            System.out.println("Home Team: "+ copy[i]);
            System.out.println("Away Team: "+ copy[++i]);
            }
	}	
	
}
