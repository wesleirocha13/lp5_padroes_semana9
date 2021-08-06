package interpreter;

/**
 *
 * @author Weslei
 */
public class Division implements Interpreter{
    private double number1;
    private double number2;

    public Division(Number leftNumber, Number rigthNumber) {
        number1 = leftNumber.getNumber();
        number2 = rigthNumber.getNumber();
    }

    public double interpret() {
        return number1 / number2;
    }
}
