package interpreter;

/**
 *
 * @author Weslei
 */
public class Number implements Interpreter{
    private double number;

    public Number(double number) {
        this.number = number;
    }

    public double interpret() {
        return number;
    }

    public double getNumber() {
        return this.number;
    }

}
