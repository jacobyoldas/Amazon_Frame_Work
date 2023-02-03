package Java_Interview_Practice;

import java.util.Scanner;

public class PracticeIF_Else {

  /**
   * // get string input from the user
   * // check if it contains 'a' and 'b'
   * // check if it contains  * 'a' or 'c'
   * // check if it does NOT contain 'c'
   * // check if it does not contain both 'c' and
   * 'd'
   */

   public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     System.out.println("Please enter a string: ");
     String userInput = scanner.nextLine();

     if (userInput.contains("a") && userInput.contains("b")){
     System.out.println("UserInput contains A and B ");
     }

     if(userInput.contains("a") || userInput.contains("c")) {
       System.out.println("UserInput contains A or C: ");
     }
     if(!userInput.contains("c")) {
       System.out.println("UserInput does not contain C: ");
     }
     if(!userInput.contains("c") && !userInput.contains("d")) {
       System.out.println("UserInput does not contain C and D: ");
     }
  }
}
