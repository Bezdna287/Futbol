package com.mycompany.app.Futbol;

import java.util.Arrays;
import java.util.Random;


public class App 
{
	public static String [] teamsList = {"Italy", "Spain", "Mexico", "Canada", "Brazil", "Germany", "France", "Australia", "Argentina", "Uruguay"};
	
	public static void main( String[] args )
    {
		startNewGameSet(teamsList);
		FootballGame fbg = new FootballGame(null, null);
    	
    }
	
	public static void startNewGameSet(String[] teams) {
		int teamsLength = teams.length;
		String [] copy = Arrays.copyOf(teams, teamsLength);
		Utils.shuffle(copy);

        for (int i = 0; i < teamsLength; ++i) {
        	Team home = new Team(copy[i],Utils.randomScore());
        	Team away = new Team(copy[++i],Utils.randomScore());
        	
            System.out.print("Home Team: "+home.name + " " +home.score + "   ");
            System.out.println("Away Team: "+away.name + " " +away.score);
            }
	}
	

	

	
	
}
