package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import add2Num.MyBigNumber;

public class Main {
    public static void main(String[] args) {
        MyBigNumber calc = new MyBigNumber();
        String r = calc.sum("1234", "897");
        System.out.println("Result = " + r);
    }
}
