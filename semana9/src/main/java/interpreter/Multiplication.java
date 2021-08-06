package interpreter;

/**
 *
 * @author Weslei
 */
public class Multiplication implements Interpreter{
    private double number1;
    private double number2;

    public Multiplication(Number leftNumber, Number rigthNumber) {
        number1 = leftNumber.getNumber();
        number2 = rigthNumber.getNumber();
    }

    public double interpret() {
        return number1 * number2;
    }
}
