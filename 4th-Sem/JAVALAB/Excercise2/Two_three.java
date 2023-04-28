package Excercise2;
import java.util.Scanner;

class Two_three{
    public static void main(String[] args) {
        int n1,n2;

  
        
        Scanner s = new Scanner(System.in);

        System.out.println("enter size of array 1");
        n1 = s.nextInt();
        int[] array1 =new int[n1];

        System.out.println("Enter Array1 elements");
        for (int i = 0; i < n1; i++)
        array1[i] = s.nextInt();
        
        System.out.println("enter size of array 2");
        n2 = s.nextInt();     
        int[] array2 = new int[n2];

        System.out.println("Enter array 2 elements");
        for (int i = 0; i < n1; i++)
			array2[i] = s.nextInt();

            s.close();

    int[] array3 = new int[n1+n2];

        int i=0,j=0,k=0;

        while((i<n1) && (j<n2)){
       
        if(array1[i]>array2[j]){
            array3[k++] = array2[j++];
        }
        else{
            array3[k++] = array1[i++];
        }
        }
        while(i<n1){
           array3[k++] = array1[i++];
        }
        while(j<n2){
            array3[k++] = array2[j++];
        }

        System.out.println("Sorted Array");

        for(k=0;k<(array2.length+array1.length);k++){
       System.out.println(array3[k]+"\t");
        }
       
    }
}