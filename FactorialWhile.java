/*While Loops
For your math class you need a program to calculate the factorial of a number.
The given code takes the number from user input and declares a "fact" variable for calculation.

Task:
Complete the code to calculate the factorial of the given number and output it.*/

import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            int  number = scanner.nextInt();
            int fact = 1;
            while(number>=1){
            	fact *= number;
            	number--;
            }
System.out.println(fact);
        }
    }
}

