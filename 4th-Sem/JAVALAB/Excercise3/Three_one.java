class Three_one{
    public static void main(String[] args) {
        
        Example e = new Example();
        System.out.println(e.a);
        e.printSomething();
        
    }
}

class Example{
    int a = 10;
    void printSomething(){
        System.out.println("Welcome to JAVA !");
    }
}