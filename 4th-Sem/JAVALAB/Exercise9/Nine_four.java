import java.util.*;

public class Nine_four {
  public static void main(String[] args) {

    Nine_four e = new Nine_four();
    try {
      e.validate();
    } catch (MyEx w) {
      System.out.println(w.getMessage());
    }

  }

  void validate() throws MyEx {
    int result;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number");
    ;
    result = s.nextInt();
    if (result % 2 == 0) {
      System.out.println(result);
    } else {
      throw new MyEx("You should enter even number");
    }
  }
}

class MyEx extends Exception {
  MyEx(String s) {
    super(s);
  }

}
