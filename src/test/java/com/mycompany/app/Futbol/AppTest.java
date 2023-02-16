package com.mycompany.app.Futbol;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testCreateTeam()
    {
        Team team = new Team("teamName", 3);
    	assertTrue("Wrong team",team.getName().equals("teamName"));
    }
    
    @Test
    public void testGetHomeTeam()
    {
        Team homeTeam = new Team("Argentina", 5);
        Team awayTeam = new Team("Jamaica", 0);
        FootballGame fg =new FootballGame(homeTeam,awayTeam);
    	assertTrue("Wrong home team",fg.getHome().getName().equals("Argentina"));
    }
    
    @Test
    public void testGetAwayTeam()
    {
        Team homeTeam = new Team("Germany", 3);
        Team awayTeam = new Team("Lalaland", 3);
        FootballGame fg =new FootballGame(homeTeam,awayTeam);
    	assertTrue("Wrong away team",fg.getAway().getName().equals("Lalaland"));
    }
    
    @Test
    public void testGetHomeScore()
    {
        Team homeTeam = new Team("Argentina", 5);
        Team awayTeam = new Team("Jamaica", 0);
        FootballGame fg =new FootballGame(homeTeam,awayTeam);
    	assertTrue("Wrong home team score",fg.getHome().getScore().intValue()==5);
    }
    
    @Test
    public void testGetAwayScore()
    {
        Team homeTeam = new Team("Germany", 3);
        Team awayTeam = new Team("Lalaland", 3);
        FootballGame fg =new FootballGame(homeTeam,awayTeam);
    	assertTrue("Wrong away team score",fg.getAway().getScore().equals(3));
    }
    
    @Test
    public void testGetTotalScore()
    {
        Team homeTeam = new Team("Mexico", 10);
        Team awayTeam = new Team("Alaska", 3);
        FootballGame fg =new FootballGame(homeTeam,awayTeam);
    	assertTrue("Wrong total score",fg.getTotalScore()==13);
    }
    
    @Test
    public void testNewGameStarts()
    {
        Team homeTeam = new Team("Germany", 3);
        Team awayTeam = new Team("Lalaland", 3);
        FootballGame fg =new FootballGame(homeTeam,awayTeam);
    	assertTrue("This is bad game!",App.startGame(homeTeam, awayTeam).equals(fg));
    }
    

    
}
