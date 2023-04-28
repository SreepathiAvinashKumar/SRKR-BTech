package Exercise5;
public class Five_two extends Teacher {

    Five_two(int age, String name) {
        super(age, name);
    }
    public static void main(String[] args) {
        Five_two f = new Five_two(20, "Avinash");
        f.walk();
        f.run();
        f.talk();
    }
}

class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void walk() {
        System.out.println(name + " is walking");
    }

    void run() {
        System.out.println(age + " is his running");
    }
}

class Teacher extends Person {
    Teacher(int age, String name) {
        super(age, name);
    }

    void talk() {
        System.out.println(name + " is talking");
    }

}
