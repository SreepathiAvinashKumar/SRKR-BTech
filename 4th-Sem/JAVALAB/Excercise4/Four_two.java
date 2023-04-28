package Excercise4;
public class Four_two {
int l = 10,b=20;
    public static void main(String[] args) {
        Four_two f = new Four_two();
        System.out.println(f.area());
        System.out.println(f.area(2,3));
        System.out.println(f.area(1.24,3.24));
        

    }

    int area(int l ,int b){
        return l*b;
    }

    int area(){
        return l*b;
    }
    double area(double a, double b){
        return a*b;
    }

}
