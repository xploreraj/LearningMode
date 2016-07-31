package test;

interface I1{
    void m1();
    void m2();
}
interface I2{
    void m2();
}
public class Test implements I1, I2{

    public void m1() {

    }

    public void m2() {

    }

    public static void main(String[] args) {
        int n = 3;
        while(n-->0)
            System.out.println(n);
    }
}