package fcu.iecs.oop.password;

public class PasswordEncoder {
  /**
   * Encoding original password to the new one.
   * @param password String.
   * @return string.
   */
  public String encode(String password) {
    
    password = password.replaceAll("A", "4");
    password = password.replaceAll("a", "4");
    password = password.replaceAll("E", "3");
    password = password.replaceAll("e", "3");
    password = password.replaceAll("I", "1");
    password = password.replaceAll("i", "1");
    password = password.replaceAll("O", "0");
    password = password.replaceAll("o", "0");
    password = password.replaceAll("T", "7");
    password = password.replaceAll("t", "7");
    
    return password;
  }
  
}