package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
  /**
   * Exercise1: Encoding the password.
   * @param args input.
   */
  public static void main(String[] args) {
    PasswordEncoder password1 = new PasswordEncoder();
    Scanner scanner = new Scanner(System.in);
    String str;

    while (true) {

      System.out.print("Please enter a password: ");
      str = scanner.nextLine();
      
      if (str.equals("exit")) {
        break;
      }
      
      System.out.println(password1.encode(str));
      
    }
    scanner.close();
  }

}