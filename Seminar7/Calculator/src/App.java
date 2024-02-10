import Classes.Calculator;
import Interfaces.iCalculableComplexNumber;
import View.ViewCalculator;

public class App {
    public static void main(String[] args) {
        iCalculableComplexNumber calc = new Calculator(0, 0);
        ViewCalculator view = new ViewCalculator(calc);
        view.run();
    }
}
