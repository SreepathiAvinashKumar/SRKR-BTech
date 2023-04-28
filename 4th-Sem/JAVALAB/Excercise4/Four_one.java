package Excercise4;
class Four_one {
    int a;
    int b;

    Four_one() {
System.out.println("Default Constructor");
    }

    Four_one(int a, int b) {
       this.a = a;
       this.b = b;
    }

    Four_one(int d) {
System.out.println(d*10);
    }

    void getValue(){
        System.out.println(a);
        System.out.println(b);
    }

    Four_one(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
Four_one f1 = new Four_one();
Four_one f2 = new Four_one("Avinash");
Four_one f4 = new Four_one(1, 2);
Four_one f3 = new Four_one(2);
f4.getValue();
    }
}
