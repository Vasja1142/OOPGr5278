package Classes;

import Interfaces.iCalculableComplexNumber;

public class Calculator implements iCalculableComplexNumber {
    private double realArg;
    private double imaginaryArg;

    public Calculator(int realArg, int imaginaryArg) {
        this.realArg = realArg;
        this.imaginaryArg = imaginaryArg;
    }


    @Override
    public iCalculableComplexNumber sum(int realArg, int imaginaryArg) {
        this.realArg += realArg;
        this.imaginaryArg += imaginaryArg;
        return this;
    }

    @Override
    public iCalculableComplexNumber multi(int realArg, int imaginaryArg) {
        double rArg = this.realArg;
        double iArg = this.imaginaryArg;
        this.realArg *= realArg;
        this.realArg += iArg * imaginaryArg;
        this.imaginaryArg = iArg * realArg;
        this.imaginaryArg += rArg * imaginaryArg;
        return this;
    }

    @Override
    public iCalculableComplexNumber div(int arg) {
        this.realArg /= arg;
        this.imaginaryArg /= arg;
        return this;
    }

    @Override
    public double getRealArg() {
        return realArg;
    }

    @Override
    public double getImaginaryArg() {
        return imaginaryArg;
    }
}






















