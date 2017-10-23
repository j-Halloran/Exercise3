import org.junit.Test;
import static org.junit.Assert.*;

import halloran.IntegerSequenceProject;

public class IntegerSequenceProjectTest {

    @Test
    public void testTriangle0() {
    	assertEquals(IntegerSequenceProject.triangleSequence(0), 0);
    }

    
    @Test
    public void testTriangle5() {
    	assertEquals(IntegerSequenceProject.triangleSequence(5), 15);
    }

    @Test
    public void testTriangle0xFF() {
    	assertEquals(IntegerSequenceProject.triangleSequence(0xFF), 32640);
    }
    
     @Test
    public void testIntegerSequence0() {
      assertEquals(IntegerSequenceProject.lazyNumber(0), 1);
    }

    
    @Test
    public void testIntegerSequence5() {
      assertEquals(IntegerSequenceProject.lazyNumber(5), 16);
    }
    
    @Test
    public void testIntegerSequence10() {
      assertEquals(IntegerSequenceProject.lazyNumber(10), 56);
    }
}