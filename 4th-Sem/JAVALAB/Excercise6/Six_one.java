package Excercise6;
public class Six_one extends B {

    Six_one(int a, int b) {
        super(a, b);
    }

    public static void main(String[] args) {
        int c;

        Six_one s = new Six_one(1, 2);
        s.displayValue();
        c = s.getcValue();
        System.out.println(c);
    }

    void displayValue() {
        super.printValues();
    }

}

class A {
    int a;
    int b;

    int c = 3;

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void printValues() {
        System.out.println("A value is: " + a);
        System.out.println("B value is: " + b);
    }

}

class B extends A {

    B(int a, int b) {
        super(a, b);
    }

    int getcValue() {
        return super.c;
    }

}
