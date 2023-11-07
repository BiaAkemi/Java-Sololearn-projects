/*Boiling Water 
You are making a program for a water sensor that should check if the water is boiling.

Task:
Take the integer temperature in Celsius as input and output "Boiling" if the temperature is above or equal to 100.
Output "Not boiling" if it's not.*/

import  java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
       try (Scanner sc = new
       Scanner(System.in)) {
        int water = sc.nextInt();
           if (water>=100){
           	System.out.println("Boiling");
           }
           else {
           	System.out.print("Not boiling");
           }
    }
    }
}