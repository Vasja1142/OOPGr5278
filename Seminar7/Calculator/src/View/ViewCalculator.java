package View;

import Interfaces.iCalculableComplexNumber;

import java.util.Scanner;

public class ViewCalculator {
    private iCalculableComplexNumber calculator;


    public ViewCalculator(iCalculableComplexNumber calculator) {
        this.calculator = calculator;
    }

    public void run(){
        boolean flag = true;
        while (flag){
            int realArg = promptInt("Введите вещественное целочисленное число: ");
            int imaginaryArg = promptInt("Введите мнимое целочисленное число: ");
            calculator.sum(realArg, imaginaryArg);
            while (true){
                String cmd = prompt("Введите команду (*, +, /, =): ");
                if (cmd.equals("*")) {
                    int realNum = promptInt("Введите вещественное целочисленное число: ");
                    int imaginaryNum = promptInt("Введите мнимое целочисленное число: ");
                    calculator.multi(realNum, imaginaryNum);
                    continue;
                }
                if (cmd.equals("+")) {
                    int realNum = promptInt("Введите вещественное целочисленное число: ");
                    int imaginaryNum = promptInt("Введите мнимое целочисленное число: ");
                    calculator.sum(realNum, imaginaryNum);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = promptInt("Введите число: ");
                    calculator.div(arg);
                    continue;
                }

                if (cmd.equals("=")) {
                    double realResult = calculator.getRealArg();
                    double imaginaryResult = calculator.getImaginaryArg();
                    System.out.printf("Результат %.2f + %.2fi\n", realResult, imaginaryResult);
                    break;
                }
            }

            while (true) {
                String cmd = prompt("Еще посчитать(Y/N)?: ");
                if (cmd.equals("N")) {
                    flag = false;
                    break;
                } else if (cmd.equals("Y")) {
                    break;
                }
            }
        }
    }
    private String prompt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    private int promptInt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return Integer.parseInt(in.nextLine());
    }
}























