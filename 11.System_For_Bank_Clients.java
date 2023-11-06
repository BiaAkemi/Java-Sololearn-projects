/*System for bank clients
You are creating an automated phone system for bank clients.

Number selections should activate the actions noted below as follows:
1 => Language selection
2 => Customer support
3 => Check account balance
0 => Exit
You can use the first 3 commands in a random sequence without interrupting the phone call - only the number 0 interrupts it. The given code takes numbers continuously.

Task:
Complete the code to output the corresponding messages, until the client enters 0.*/

import java.util.Scanner;

class Demo{
   public static void main(String[] args) {
 
       Scanner scanner = new Scanner(System.in);
       int number;
       do {
          number = scanner.nextInt();
          switch(number){
           case 1:
            System.out.println("Language selection");
            break;
            case 2:
            System.out.println("Customer support");
            break;
            case 3:
            System.out.println("Check the balance");
            break;
            case 0:
            System.out.println("Exit");
            break;

            }
        
            
        }
        while(number != 0);
   }
}

