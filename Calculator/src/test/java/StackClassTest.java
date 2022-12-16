import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackClassTest {
	private StackClass mainStack;
	
	@BeforeEach
	void mainStackTest() {
		mainStack = new StackClass();
	}
	
	// Tests to compare the size of the stack
    @Test
    void testSize() {
        assertEquals(mainStack.size(), 0);
        
    }
    // Creates a new instance of entry and tests whether it is able to be pushed onto the stack
    @Test
    void testPush() {
    	Entry ent = new Entry(1.0f);
    	mainStack.push(ent);
    	assertEquals(mainStack.size(), 1);
    }
    // Creates an entry and tests whether it is able to be pushed onto the stack and then popped after
    @Test
    void testPushPop() {
    	Entry ent = new Entry(1.0f);
    	mainStack.push(ent);
    	assertEquals(mainStack.pop(), ent);
    }
    // Creates an entry which is the pushed onto the stack and checks the top of the stack after
    @Test
    void testTop() {
    	Entry ent = new Entry(1.0f);
    	mainStack.push(ent);
    	assertEquals(mainStack.top(), ent);
    	assertEquals(mainStack.size(), 1);
    }
    // Creates two entries which are both pushed onto the stack and then both popped after
    @Test
    void testPushPushPopPop() {
    	Entry ent = new Entry(1.0f);
    	Entry ent2 = new Entry(3.0f);
    	mainStack.push(ent);
    	mainStack.push(ent2);
    	assertEquals(mainStack.pop(), ent2);
    	assertEquals(mainStack.pop(), ent);
    }
    // Tests the stack by checking whether an exception error is thrown if it is empty
    @Test
    void testNullTop() {
    	assertThrows(EmptyStackException.class, ()->mainStack.top());	
    }
    
}