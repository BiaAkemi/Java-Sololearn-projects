/*Celsius to Fahrenheit
You are making a Celsius to Fahrenheit converter. 

Task:
Write a method to take the Celsius value as an argument and return the corresponding Fahrenheit value.
The given code takes the celsius value as input and passes it to a fahr() method, which you need to create.*/


import java.util.Scanner;

public class CelsiusToFahr {
    static double fahr (double celsius) {
	   double tot = 1.8 * celsius + 32;
      return tot;
}
    
    public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
        double c = sc.nextDouble(); 

        System.out.println(fahr(c));
    }
    }
}