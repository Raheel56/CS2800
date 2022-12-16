/**
 * @author Raheel 
 *         Declaration of the Entry class and it's fields. This class represents the entry
 *         values stored in the stack.
 */
public class Entry {
  private float number;
  private Symbol symbol;
  private String str;
  private Type type;

  /**
   * Constructor for number.
   * 
   * @param number
   */
  public Entry(float number) {
    this.number = number;
    this.symbol = Symbol.INVALID;
    this.str = Float.toString(number);
    this.type = Type.NUMBER;
  }

  /**
   * Constructor for symbol.
   * 
   * @param symbol
   */
  public Entry(Symbol symbol) {
    this.symbol = symbol;
    this.str = symbol.toString();
    this.type = Type.SYMBOL;
  }

  /**
   * Returns the entry value for number and throws an exception error if the object in an illegal
   * type.
   * 
   * @return number object if it is an acceptable type.
   * 
   * @throws IllegalArgumentException to indicate that the method has passed an illegal argument
   *         type.
   */
  public Float getValue() {
    if (type == Type.NUMBER) {
      return number;
    }
    throw new IllegalArgumentException();
  }

  /**
   * Returns the entry value for symbol and throws an exception error if the object isn't found.
   * 
   * @return symbol object if it is not null.
   * 
   * @throws NullPointerException to indicate that the method could not find a symbol object.
   */
  public Symbol getSymbol() {
    if (symbol == null) {
      throw new NullPointerException();
    }
    return symbol;
  }

  public Type getType() {
    return type;
  }

  public String getString() {
    return str;
  }
}
