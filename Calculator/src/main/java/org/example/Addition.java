package org.example;

import org.springframework.stereotype.Component;
@Component
public class Addition{
    private int a;
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

    public Addition() {
        this.a=getA();
        this.b=getB();
    }

    public int print()
    {
        return a+b;
    }
}

