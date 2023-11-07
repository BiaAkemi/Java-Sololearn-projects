/*Chess Tournament Scores
You are making a program for a chess tournament, that needs to calculate the points earned by a player.
A win is worth 1 point, while a tie is worth 0.5 points.
The given program declares two variables: wins and ties with the corresponding values.

Task:
Create a program to calculate and output the points earned by the player.
Multiply the ties value by 0.5, to get the points earned for ties.*/

public class ChessTournamentScores {
    public static void main(String[] args) {
        double wins = 54.0;
        double ties = 31.0;
        double total = (wins*1.0)+(ties*0.5);

System.out.print(total);
    
    }
}