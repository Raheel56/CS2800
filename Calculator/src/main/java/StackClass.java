import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author Raheel
 *         Declaration of the Stack Class and it's fields. The stack class is used to
 *         represent a stack of Entry values. This is performed through the stacks LIFO structure
 *         and functionalities such as removing and checking from the stack.
 */
public class StackClass {
  private int size;
  private Stack<Entry> entryStack;

  // StackClass size first initialised as empty
  public StackClass() {
    this.entryStack = new Stack<Entry>();
    this.size = 0;
  }

  public int size() {
    return this.size;
  }

  // Push or adds an entry onto the top of the stack.
  public void push(Entry entry) {
    this.entryStack.push(entry);
    this.size = this.entryStack.size();
  }

  /**
   * Removes the top element of the stack and returns it.
   * 
   * @return top element
   */
  public Entry pop() {
    Entry ent = this.entryStack.pop();
    this.size = this.entryStack.size();
    return ent;
  }

  /**
   * Returns the top element of the stack. if the stack is empty throws an error.
   * 
   * @return top element
   * 
   * @throws EmptyStackException to indicate stack is empty
   */
  public Entry top() {
    try {
      return this.entryStack.peek();
    } catch (EmptyStackException e) {
      throw new EmptyStackException();
    }
  }
}
