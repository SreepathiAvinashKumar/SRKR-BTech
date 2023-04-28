public class Three_two {
    //Default Constructor 
    Three_two(){
    System.out.println("Default Constructor Called !");
    }
    // Parameterized Constructor
    Three_two(int a, int b){
        System.out.println("Sum is: "+(a+b));
    }


    public static void main(String args[]){
        Three_two t = new Three_two();
        Three_two t1 = new Three_two(1,2);
        
    }
}

