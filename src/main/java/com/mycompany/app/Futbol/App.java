package com.mycompany.app.Futbol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
	public static String[] teamsList = { "Italy", "Spain", "Mexico", "Canada", "Brazil", "Germany", "France",
			"Australia", "Argentina", "Uruguay" };

	public static void main(String[] args) throws Exception {
		List<FootballGame> games = runGames(teamsList);
		games.forEach(game->printScore(game.getHome(), game.getAway(),"current"));
		games.sort(Comparator.comparing(FootballGame::getTotalScore).reversed());
		
		System.out.println("---------------------------");
		games.forEach(game->printScore(game.getHome(), game.getAway(),"final"));
	}

	public static List<FootballGame> runGames(String[] teams)  throws Exception{

		int teamsLength = teams.length;
		String[] copy = Arrays.copyOf(teams, teamsLength);
		Utils.shuffle(copy);
		List<FootballGame> games = new ArrayList<>();

		for (int i = 0; i < teamsLength; ++i) {
			Team home = new Team(copy[i], Utils.randomScore());
			Team away = new Team(copy[++i], Utils.randomScore());
			FootballGame game = startGame(home, away);
			updateScore(games,game);
		}
		return games;
	}

	public static void printScore(Team home, Team away,String state) {
		if (state.equals("current")){
		System.out.print(home.name + " - " + away.name + ": ");
		System.out.println(home.score + " - " + away.score); }
		else if (state.equals("final")) {
			System.out.print(home.name + " " +home.score + " - ");
			System.out.println(away.name + " " + away.score);
		}
		else {
			System.out.print("The status of game is not correct! It should be 'current' or 'final' ");
		}
	}
	
	public static FootballGame startGame(Team home, Team away) {
		return new FootballGame(home, away);
	}
	
	public static void updateScore(List<FootballGame> games,FootballGame game) throws Exception {
			games.add(game);
	}
}
