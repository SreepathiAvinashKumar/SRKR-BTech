package Excercise2;
public class Two_four {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("String is"+sb);

        sb.delete(0,2);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
