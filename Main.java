import java.util.Scanner;
/**
 * This program gives the multiplication table for a given integer
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ask for their integer
    System.out.println("Please enter an integer to create a multiplication table for");
    int userNumber = input.nextInt();
    // a for while loop that goes from 0-10 (1-11)
    for (int i = 0; i < 11; i++) {
      // the multiplier is just i + 1 to counter the i starting at 0 not 1
      int multiplier = i + 1;
      int product = multiplier * userNumber;
      // the multiplier * the number = the product
      System.out.println(multiplier + " x " + userNumber + " = " + product);
    }
    
  }
}
