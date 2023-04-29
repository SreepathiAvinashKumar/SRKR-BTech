public class eight_one {
    public static void main(String[] args) {
        
        A a = new A();
        B b = new B(1,2);
        C c = new C(5,6);

        A e;
        e = a;
        e.display();
        e = b;
        e.display();
        e = c;
        e.display();

    }
}


class A {

void display(){
  System.out.println("Inside A Class");
}

}

class B extends A{
    int a ;
    int b;
     B(int a, int b){
        this.a =a;
        this.b = b;

     }
    void display(){
        System.out.println("A value is Inside B :"+a);
        System.out.println("B value is Inside B : "+b);
    }

}

class C extends B{
    int a;
    int b;
    int c=20;
    C(int a ,int  b){
        super(a, b);
        this.a = a;
        this.b = b;
    }
    void display(){
     System.out.println("A value is Inside C :"+a);
     System.out.println("B value is Inside C : "+b);
    }
}
