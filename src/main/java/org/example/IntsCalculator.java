package org.example;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
       Calculator.Formula formula = target.newFormula();
       formula.addOperand((double) arg0);
       formula.addOperand((double) arg1);
       formula.calculate(Calculator.Operation.SUM);
       return  (int)formula.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        Calculator.Formula formula = target.newFormula();
        formula.addOperand((double) arg0);
        formula.addOperand((double) arg1);
        formula.calculate(Calculator.Operation.MULT);
        return  (int)formula.result();
    }

    @Override
    public int pow(int a, int b) {
        //считаем через target
        Calculator.Formula formula = target.newFormula();
        formula.addOperand((double) a);
        formula.addOperand((double) b);
        formula.calculate(Calculator.Operation.POW);
        return  (int)formula.result();
    }
}
