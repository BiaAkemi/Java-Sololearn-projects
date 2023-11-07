/*The emotion-aware robot
Your robot can recognize your emotions and can assign them a number to represent each of them:

You are happy!
You are sad!
You are angry!
You are surprised!
The given code takes the emotion number as an user input.

Task:
Complete the code to output the corresponding message in the given format.
If the input is an emotion that the program doesn’t know, it should output: "Unknown emotion".*/

import java.util.Scanner;

class Demo{
   public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
          int emotion = scanner.nextInt();

    switch(emotion){
           case 1:
           System.out.println("You are happy!");
             break;
           case 2:
             System.out.println("You are sad!");
             break;
            case 3:
             System.out.println("You are angry!");
             break;
             case 4:
             System.out.println("You are surprised!");
             break;
            default:
             System.out.println("Unknown emotion");
    }
        }
    }
}