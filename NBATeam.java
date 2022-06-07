//Name: Antonio Mendoza
//PantherID: 002-54-0550
//Due Date: July 6
//================================

import java.util.Arrays;

public class NBATeam {
    //initiates variables used in the blueprint
    private final String teamName;
    private int nLoss;
    private int nWins;
    private final String [] playerArray;

    //assigns the team name and initiates the number of wins and loses to 0
    //initiates the playerArray with the maximum amount of players allowed on the court
    public NBATeam (String name) {
        teamName = name;
        nWins = 0;
        nLoss = 0;
        playerArray = new String[12];
    }
    //if the team wins the number of wins is incremented by 1
    public int Win() {
    	nWins += 1;
        return nWins;
    }
    //if the team loses the number of loses is incremented by 1
    public int Loss() {
    	nLoss += 1;
        return nLoss;
    }

    //returns the number of loses
    public int getNumberofLoss() {
        return nLoss;
    }
    //returns the number of wins of the team
    public int getWinNum(){
        return nWins;
    }
    //creates an array of the players inputed by the user
    public String [] addAPlayer(String playerName) {
        for(int cycle = 0; cycle < playerArray.length; cycle++) {
        	if(playerArray[cycle] == null) {
        		playerArray[cycle] = playerName;
        		break;
        	}
        }
        return playerArray;
    }


    //prints out the win/lose ratio for the team along with the players of the team
    public String toString () {
    	int count = 0;
    	//initiates an array for the number of players input by the user
    	String [] players;
    	for(int a = 0; a < playerArray.length; a++) {
    		if(playerArray[a] != null) {
    			count++;
    		}
    		else break;
    	}
    	//creates an array of the amount of players that where input by the user
    	players = new String [count];
    	for(int a = 0; a < playerArray.length; a++) {
    		if(playerArray[a] != null) {
    			players[a] = playerArray[a];
    		}
    		else break;
    	}
    	//returns the players of the team and the number of wins and loses of the team
    	return teamName  + Arrays.toString(players)  + " Wins: " + Win() + " Loss: " + Loss();
    }

}
