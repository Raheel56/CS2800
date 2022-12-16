/**
 * @author Raheel
 *         Defines the enum class Type and its enum constants. This enumeration is designed
 *         to list the acceptable types of value an Entry can represent.
 */
public enum Type {
  NUMBER("NUMBER"), SYMBOL("SYMBOL"), STRING("STRING"), INVALID("INVALID");

  private String str1;

  Type(String str1) {
    this.str1 = str1;
  }

  // toString method which returns the Type in a string format
  public String toString() {
    return str1;
  }
}
