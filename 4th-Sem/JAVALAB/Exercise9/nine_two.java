public class nine_two {
    public static void main(String[] args) {
    int a= 10;
    int b = 0;
    int c;
    
    try{
        c = a/b;
    }
    catch(ArithmeticException e){
        e.printStackTrace();
    }
    finally{
        System.out.println("A value is :"+a);
        System.out.println("B value is :"+b);
    }
    }
}
