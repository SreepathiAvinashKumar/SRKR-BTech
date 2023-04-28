package Excercise2;
import java.util.Scanner;

class Two_one{
    public static void main(String args[]) {
        int[] array = {1,2,3,5,6};
        int size = array.length;
        int element;
        Scanner s = new Scanner(System.in);
        element = s.nextInt();
        int found = Two_one.binarySearch(array,0,size-1,element);
s.close();
 if(found==-1){
    System.out.println("element not found");
 }
 else{
    System.out.println("element found");
 }
 s.close();
    }

    static int binarySearch(int[] arr, int start, int end,int element) {

        if (start <= end) {
            int mid = (start + end) / 2;
           
                if (element ==  arr[mid]) {
                    return mid;

                } else if (element < arr[mid]) {
                    return binarySearch(arr, start, mid-1,element);
                }
                else{
                    return  binarySearch(arr, (mid + 1), end,element);
                }
            }
            else{
                return -1;
            }

          
        }



}
