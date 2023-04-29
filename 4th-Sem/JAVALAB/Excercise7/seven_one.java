package Excercise7;
public class seven_one {
  
    public static void main(String[] args) {
        
    try{
        int[] a = new int[2];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Accessing index of array is less than array size");
        System.out.println(e.toString());
    }
    finally{
        System.out.println("Program execution finished");
    }

    }
}

