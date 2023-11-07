/*Factorial
The factorial of a number N is equal to 1 * 2 * 3 * ... * N
For example, the factorial of 5 is 1* 2 * 3 * 4 * 5  = 120.

Task:
Create a program that takes a number from input and output the factorial of that number.*/

import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        try (Scanner sc = new
        Scanner(System.in)) {
            int num = sc.nextInt();
            long fact = 1;
            for(int x=1; x<=num; x++){
fact*=x;
}
System.out.println(fact);
        }
   }
}