package interpreter;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Weslei
 */
public class InterpreterTest {
    
    @Test
    public void mustCalculateAmountOfnstallment() {
        Interpreter interpreter = new InterpretPortionAmount("100.0 * 0.6 - 100 / -2");
        assertEquals(20.0, interpreter.interpret(),0.01);
    }
    
    @Test
    public void mustReturnInvalidElement() {
        try {
            Interpreter interpreter = new InterpretPortionAmount("100.0 * 0.6 + 100 / -2");
            assertEquals(20.0, interpreter.interpret(), 0.01);
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressao com elemento invalido", e.getMessage());
        }
    }
    
    @Test
    public void mustReturnInvalidExpression() {
        try {
            Interpreter interpreter = new InterpretPortionAmount("2 *");
            assertEquals(50.0, interpreter.interpret(), 0.01);
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressao invalida", e.getMessage());
        }
    }
    
}
