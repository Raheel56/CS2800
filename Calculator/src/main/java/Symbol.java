/**
 * @author Raheel 
 *         Defines the enum class Symbol and its enum constants. This enumeration's purpose
 *         is to declare the possible non-numbers tokens in an expression or calculation.
 */
public enum Symbol {
  LEFT_BRACKET("("), RIGHT_BRACKET(")"), TIMES("*", "x"), DIVIDE("/",
      "÷"), PLUS("+"), MINUS("-"), INVALID("");


  private String str1;
  private String str2;

  // Constructor for one parameter of the enum
  Symbol(String str1) {
    this.str1 = str1;
  }

  // Constructor for two parameters of the enum
  Symbol(String str1, String str2) {
    this.str1 = str1;
    this.str2 = str2;
  }

  /**
   * Checks if the first symbol object str1 is empty. Returns the first symbol object which is
   * already in a string format. Prompts an invalid message if the symbol object is empty. Checks
   * the second symbol object str2 and returns it in a string format if it's not null.
   * 
   * @return symbol object as a string.
   */
  public String toString() {
    if (str1 == "") {
      return "SYMBOL INVALID";
    } else if (str2 != null) {
      return str2;
    }
    return str1;
  }
}
