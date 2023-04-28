import java.util.*;
public class one_two {
    public static void main(String[] args) {
        double a,b,c;
        double r1,r2,D;
        Scanner s = new Scanner(System.in);
        System.out.println("Give a Quadratic Equation in the form of ax^2+bx+c");
        System.out.println("enter a value:");
        a  = s.nextDouble();
        System.out.println("enter b value");
        b = s.nextDouble();
        System.out.println("enter c value:");
        c = s.nextDouble();

        D = b*b-4*a*c;

        if(D>0){
        System.out.println("You have real and unequal roots");
        r1  =((-b+Math.sqrt(D))/(2*a));
        r2 = ((-b-Math.sqrt(D))/(2*a));
        System.out.println(r1+" and "+r2);
        }
        else if (D==0){
        System.out.println("You have real and equal roots");
        r1 = ((-b+Math.sqrt(D))/(2*a));
        System.out.println("You have root "+r1);
        }
        else{
            System.out.println("You have imaginary roots");
        }
        s.close();

    }
}
