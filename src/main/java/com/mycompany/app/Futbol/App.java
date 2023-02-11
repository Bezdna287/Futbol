package com.mycompany.app.Futbol;

public class App 
{
	public static String [] teamsList = {"Italy", "Spain", "Mexico", "Canada", "Brazil", "Germany", "France", "Australia", "Argentina", "Uruguay"};
	
	public static void main( String[] args )
    {
    	FootballGame fbg = new FootballGame();
    	fbg.startNewGameSet(teamsList);

    }
}
