//Import scanner utility
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Create scanner
    Scanner s = new Scanner(System.in);

    // Prompt the user for input
    System.out.println("Enter a number to count down or up from");
    int number;
    number = s.nextInt();

    // Check to see if the user entered a negative or positive number
    if (number >= 0) {
      while (number >= 0)
      {
        System.out.println(number);
        number--;
      }
    }
    else {
      while (number <= 0)
      {
        System.out.println(number);
        number++;
      }
    }
    System.out.println("Blast off!");
  }
}