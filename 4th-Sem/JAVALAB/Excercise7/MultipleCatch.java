public class MultipleCatch {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c;
        int[] arr = new int[2];

        try {
            c = a / b;
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 45;
            arr[3] = 33;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
