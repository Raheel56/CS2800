import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SymbolsTest {
	
    // Checks to see the instance of the s value
	@Test
  void testEnum() {
    Symbol s = Symbol.PLUS;
    assertEquals(s, Symbol.valueOf("PLUS")); 
    }
    
    // Checks the toString for only one parameter of the enum
  	@Test
  void testtoString1() {
    Symbol s = Symbol.PLUS;
    assertEquals("+", s.toString());
    }
    
    // Check the toString for two parameters of the enum
  	@Test
  void testtoString2() {
    Symbol s = Symbol.MINUS;
    assertEquals("-", s.toString());
    }
}
