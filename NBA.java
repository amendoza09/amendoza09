//Name: Antonio Mendoza
//PantherID: 002-54-0550
//Due Date: July 6
//================================
import java.util.*;
public class NBA {

    public static void main (String [] args) {
    	//initiates variables used throughout the client program
        Scanner scan = new Scanner(System.in);
        String ifAddPlayer;
        String playerName;
        //Starts by asking the user to create the heats team
        System.out.println("Create the team of Heats ...... ");
        NBATeam heat = new NBATeam("Heats");
        //asks the player if they want to add a player
        System.out.print("Add a play to heats? (yes/no): ");
        ifAddPlayer = scan.next();
        //while-loop to check if the player want to continue adding to the team
        while (ifAddPlayer.equalsIgnoreCase("yes")) {
            System.out.print("What is the name to be added? ");
            playerName = scan.next();
            //adds the players input to the team
            heat.addAPlayer(playerName);
            System.out.print("Add one more player to Heats? (yes/no): ");
            ifAddPlayer = scan.next();
        }
        //asks the player to create the team for the Spurs
        System.out.println("Create the team of Spurs ...... ");
        NBATeam spurs = new NBATeam ("Spurs");
        //asks the player if they want to start adding players to the team
        System.out.print("Add a player to Spurs? (yes/no): ");
        ifAddPlayer = scan.next();
        //while-loop to check if the player wants to continue adding players to the team
        while (ifAddPlayer.equalsIgnoreCase("yes")) {
            System.out.print("What is the name to be added? ");
            playerName = scan.next();
            //adds the users input to the team of spurs
            spurs.addAPlayer(playerName);
            System.out.print("Add one more play to Spurs? (yes/no): ");
            ifAddPlayer = scan.next();
        }
        //lets the user know that the results are being calculated
        System.out.println("Game on Now......");
        //simulates the number of games played
        int round = 1;
        while(round <= 7) {
        	//generates a random number to see what team wins the game
        	double point = Math.random();
            if (point < 0.51) {
                spurs.Win();
                heat.Loss();
                round++;
            }
            else if (point > 0.5){
                heat.Win();
                spurs.Loss();
                round++;
            }
            //if the heat or the spurs win the majority of the games it announces it to the user
            if(heat.getWinNum() == 3) {
                System.out.println("Heats ***WIN the series***");
                break;
            }
            else if (spurs.getWinNum() == 3) {
                System.out.println("Spurs ***WIN the series***");
                break;
            }
            
        }
        //prints out the results of the teams to the user
        System.out.println(heat);
        System.out.println(spurs);
        
        scan.close();
    }

}
