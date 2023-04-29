public class eight_two {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Goat g = new Goat();

        Animal a ;
        a = c;
        a.sounds();
        a = d;
        a.sounds();
        a = g;
        a.sounds();
    }
}
class Animal{
    void sounds(){
    
    }
}
class Cat extends Animal{

    void sounds(){
System.out.println("Meow...");
    }
}

class Dog extends Animal{
    void sounds(){
System.out.println("Bowww...");
    }
}

class Goat extends Animal{
    void sounds(){
System.out.println("Meee...");
    }
}

