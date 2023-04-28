package Exercise5;

public class Five_three {
    public static void main(String[] args) {
        double r1;
        double r2;
        double r3;
        Rectangle r = new Rectangle();
        Traingle t = new Traingle();
        Square s = new Square();


        r1 = r.area();
       r2 = t.area();
       r3 = s.area();

       System.out.println(r1);
       System.out.println(r2);
       System.out.println(r3);

}

}


abstract class Shape{

    abstract double area();
}

class Rectangle extends Shape{

    int l=10;
    int b=20;


    @Override
    double area(){
    
        return l*b;
    } 

}

class Traingle extends Shape{
int a=10;
int b=20;
double c = 1/2.0;


    @Override
    double area(){
   
        return c*(a*b);
    }
}

class Square extends Shape{

    int s = 20;

    
    @Override
    double area(){
        return s*s;
    }


}




