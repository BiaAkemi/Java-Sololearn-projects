/*Sum
Your math teacher asked you to calculate the sum of the numbers 1 to N, where N is a given number.

Task: 
Take an integer N from input and output the sum of the numbers 1 to N, inclusive.*/

import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner read = new
        Scanner(System.in);
        int num = read.nextInt();
        int sum = 0;
        int lp = 0;
        while(lp<=num){
        	sum += lp;
        	lp++;
        }
       System.out.println(sum);
        
    }
}