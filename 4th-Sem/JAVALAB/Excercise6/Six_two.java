package Excercise6;
public class Six_two implements Father, Mother {

    @Override
    public void working() {
    System.out.println("Working");
    }
    @Override
    public void coocking() {
System.out.println("Coocking");
    }

    public static void main(String[] args) {
        Six_two st = new Six_two();

        st.working();
        st.coocking();
    }

}

interface Father {

    void working();

}

interface Mother {

    void coocking();

}
