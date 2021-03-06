package org.cloudname.mon;

import org.junit.Test;
import static org.junit.Assert.*;

public class VariableTest {

    private static Variable variableOne = Variable.getVariable("test.cloudname.one");
    private static Variable variableTwo = Variable.getVariable("test.cloudname.two");
    
    @Test
    public void testVariables() {
        // Trivial test of getName()
        assertEquals("test.cloudname.one", variableOne.getName());
        assertEquals("test.cloudname.two", variableTwo.getName());
        
        variableOne.set(100);
        Variable.getVariable("test.cloudname.two").set(50);
        
        assertEquals(100, Variable.getVariable("test.cloudname.one").getValue());
        assertEquals(50, variableTwo.getValue());
    }
    
}
