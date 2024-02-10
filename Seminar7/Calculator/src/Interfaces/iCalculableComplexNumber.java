package Interfaces;

public interface iCalculableComplexNumber {
    iCalculableComplexNumber sum(int realArg, int imaginaryArg);
    iCalculableComplexNumber multi(int realArg, int imaginaryArg);
    iCalculableComplexNumber div(int arg);
    double getRealArg();
    double getImaginaryArg();
}
