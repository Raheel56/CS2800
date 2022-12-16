import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class EntryTest {
	// Creates an entry for float to test to see whether getValue method gets the instance value
	@Test
	void testFloatEnt() {
		Entry ent = new Entry(1.0f);
		assertEquals(ent.getValue(),1.0f);
	}
	// Creates an entry for symbol to see whether getSymbol method gets the instance value
	@Test 
	void testSymbolEnt() {
		Symbol s = Symbol.LEFT_BRACKET;
		Entry ent = new Entry(s);
		assertEquals(ent.getSymbol(),Symbol.valueOf("LEFT_BRACKET"));
	}
	// Tests getter for getType method by creating an entry to retrieve an enum type symbol value
	@Test 
	void testGetType() {
		Symbol s = Symbol.LEFT_BRACKET;
		Entry ent = new Entry(s); 
		assertEquals(ent.getType(),Type.valueOf("SYMBOL"));
	}
	// Creates 2 different entries and compares them to be holding same values equal to True
	@Test 
	void testTrueEnt() {
		Symbol s = Symbol.LEFT_BRACKET;
		Symbol t = Symbol.LEFT_BRACKET;
		Entry ent = new Entry(s);
		Entry ent2 = new Entry(t);
		assertEquals(ent.equals(ent2),false);
	}
	// Compares 2 different entries and compares them to be holding different values equal to False
	@Test
	void testFalseEnt() {
		Symbol s = Symbol.LEFT_BRACKET;
		Symbol t = Symbol.DIVIDE;
		Entry ent = new Entry(s);
		Entry ent2 = new Entry(t);
		assertEquals(ent.equals(ent2),false);
	}
	@Test 
	// Tests for whether an exception error is thrown when there is no entry with a numerical value
	void testNullEnt() {
		Symbol s = Symbol.LEFT_BRACKET;
		Entry ent = new Entry(s);
		assertThrows(IllegalArgumentException.class,()->ent.getValue());
	}
}