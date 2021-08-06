package interpreter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Weslei
 */
public class InterpretPortionAmount implements Interpreter{
    private Interpreter initialInterpreter;

    public InterpretPortionAmount(String expression) {

        Stack<Interpreter> interpreterStack = new Stack<>();
        List<String> elements = Arrays.asList(expression.split(" "));
        Iterator<String> iterator = elements.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.matches("\\d+(\\.\\d*)?")) {
                interpreterStack.push(new Number(Double.parseDouble(element)));
            } else if (element.equals("-")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressao invalida");
                Number leftNumber = (Number) interpreterStack.pop();
                Number rigthNumber = new Number(Double.parseDouble(iterator.next()));
                Subtraction interpreter = new Subtraction(leftNumber, rigthNumber);
                interpreterStack.push(new Number(interpreter.interpret()));
            } else if (element.equals("*")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressao invalida");
                Number leftNumber = (Number) interpreterStack.pop();
                Number rigthNumber = new Number(Double.parseDouble(iterator.next()));
                Multiplication interpreter = new Multiplication(leftNumber, rigthNumber);
                interpreterStack.push(new Number(interpreter.interpret()));
            } else if (element.equals("/")) {
                if (!iterator.hasNext())
                    throw new IllegalArgumentException("Expressao invalida");
                Number leftNumber = (Number) interpreterStack.pop();
                Number rigthNumber = new Number(Double.parseDouble(iterator.next()));
                Division interpreter = new Division(leftNumber, rigthNumber);
                interpreterStack.push(new Number(interpreter.interpret()));
            } else {
                throw new IllegalArgumentException("Expressao com elemento invalido");
            }
        }
        initialInterpreter = interpreterStack.pop();
    }

    public double interpret() {
        return initialInterpreter.interpret();
    }
}
