import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TypeTest {
    private Type t;
    @BeforeEach
    void setup() {
        t = Type.NUMBER;
    }
    // Tests whether type enum t can be instantiated through NUMBER
    @Test
    void testTypeEnum() {
        assertEquals(t,Type.valueOf("NUMBER"));
    }
    // Tests type of enum which NUMBER can create a toString for
    @Test 
    void testToString() {
        assertEquals(t.toString(),"NUMBER");
    }
}