import java.util.*;

class nine_one {
    public static void main(String args[]) {

        nine_one f = new nine_one();
        try {
            f.checkNum();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public void checkNum()  throws ArithmeticException{
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        result = sc.nextInt();

        if (result < 0) {
            throw new ArithmeticException() ;
        } else {
            System.out.println("Result is:" + result);
        }
    }
}