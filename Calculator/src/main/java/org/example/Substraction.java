package org.example;

public class Substraction {
    private  int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Substraction(int a, int b) {
        this.a = a;
        this.b = b;

    }
    public int Print()
    {
        return a-b;
    }

}
