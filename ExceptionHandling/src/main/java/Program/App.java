package Program;

public class App {

    public static void main(String[] args) {
        int[] intArray = {1, 3, 2, 1, 4, 5, 6, 5, 8};
        int d = 1;

        try {
            double res = intArray[8] / d;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("null");;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index");
        }
        double a = Double.NaN;

    }


}
