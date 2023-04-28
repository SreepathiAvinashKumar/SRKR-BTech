package Excercise2;
class Two_two {
   public static void main(String[] args) {
    int[] arr = {1,5,2,3,6,1,4,9};
    int size = arr.length;
    int temp;

    for(int i =0;i<size-1;i++){
     for(int j=0;j<size-i-1;j++){
     if(arr[j]>arr[j+1]){
     temp = arr[j];
     arr[j] = arr[j+1];
     arr[j+1] = temp;
     }
     }
    }

    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+"\t");
    }
   } 
}
