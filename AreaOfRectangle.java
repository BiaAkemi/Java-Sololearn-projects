/*Let's imagine that you are writing a program that will help your sibling pass an exam. It should calculate and output the area of the rectangle.
The code you are given takes the length and width of a rectangle as input and has a “printArea” method which is incomplete.

Task:
Complete the method to take length and width  as parameters.*/

import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        try (Scanner read = new         
        Scanner(System.in)) {
            int width = read.nextInt();
            int height = read.nextInt();
            printArea(width, height);
        }
        
    }
    
    public static void printArea(int width, int height){
        System.out.println(width*height); 
    }
}