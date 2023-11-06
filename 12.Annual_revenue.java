/*Annual Revenue
The given code declares an array that holds the monthly revenues for a company for a year.

Task:
You need to calculate the average monthly revenue for the year.
For that, calculate the sum of the revenue for all the months and divide it by the number of items in the array.*/

public class Program {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
       double sum = 0;
       for(double x: revenue){
       	sum += x;
       }
       double average = sum/revenue.length;
       System.out.println(average);
    }
}