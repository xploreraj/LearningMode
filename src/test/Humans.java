package test;

/**
 * Created by rbiswas on 7/31/2014.
 */
public class Humans {
    static String skinColor = "wheaty";
    static String hairColor = "black";
    String name;
    int age;
}

class HumanDemo{
    public static void main(String[] args) {
        Humans human1 = new Humans();
        human1.name="Ram";
        human1.age=23;
       Humans human2= new Humans();
        human2.name="Sita";
        human2.age=22;

        System.out.println("human1 is " + human1.name + " of " + human1.age + " having " + human2.skinColor + " complexion with " + Humans.hairColor + " hair. ");
        System.out.println("human2 is " + human2.name + " of " + human2.age + " having " + Humans.skinColor + " complexion with " + Humans.hairColor + " hair. ");
    }
}
