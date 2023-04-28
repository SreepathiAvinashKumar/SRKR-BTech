package Exercise5;
class Five_one extends Person{

    Five_one(int age, String name) {
        super(age, name);
    }

    public static void main(String[] args) {
        
    Five_one f = new Five_one(20,"Avinash");
    f.getAge();
    f.getName();

    }
}


class Person{
    int age;
    String name;
    Person(int age,String name){
    this.age  = age;
    this.name = name;
    }
    void getName(){
        System.out.println("His name is"+name);
    }
    void getAge(){
        System.out.println("His age is "+age);
    }


}