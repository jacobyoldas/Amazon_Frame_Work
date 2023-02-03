package Java_Interview_Practice;

import java.util.Scanner;

public class PracticeIF_Else2 {
//          TASK
  // get an int from user
  // if it is greater than 100, print "PASSED"

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number: ");

    int num= scanner.nextInt();

    if (num>100){
      System.out.println("PASSED");
    } else {
      System.out.println("It's not greater than 100!");
    }

  }
}
