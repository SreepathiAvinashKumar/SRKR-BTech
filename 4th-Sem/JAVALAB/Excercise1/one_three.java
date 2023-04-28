import java.util.*;
public class one_three {
    public static void main(String[] args) {
        double racer1,racer2,racer3,racer4,racer5,avg;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Racer speed");
        racer1 = s.nextDouble();
        System.out.println("Enter Second Racer speed");
        racer2 = s.nextDouble();
        System.out.println("Enter Third Racer speed");
        racer3 = s.nextDouble();
        System.out.println("Enter Fourth Racer speed");
        racer4 = s.nextDouble();
        System.out.println("Enter Fifth Racer speed");
        racer5 = s.nextDouble();

        avg = (racer1+racer2+racer3+racer4+racer5)/5;

        if(racer1>avg){
            System.out.println("Racer 1 Qualified with speed"+racer1);
        }
        if(racer2> avg){
System.out.println("Racer 2 qualifeid with the speed of "+racer2);
        }
        if(racer3>avg){
            System.out.println("Racer 3 is qualified with speed of "+racer3);
        }
        if(racer4>avg){
            System.out.println("Racer 4 is qualifeid with the speed of "+racer4);
        }
        if(racer5 > avg){
            System.out.println("Racer 5 is qualified with speed of "+racer5);
        }
s.close();
    }
}
