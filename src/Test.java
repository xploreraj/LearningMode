import java.util.*;
class Animal{
    void eat(){
        System.out.println("eat");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("eat");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("eat");
    }
}

public class Test{

    public static void main(String[] args) {

        Animal a = new Animal();
        Animal obj = a;
        obj.eat();

        
    }

}