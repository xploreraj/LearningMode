package justlikethat;

enum Colors {

    INSTANCE(10);
    private int hue;

    Colors(int hue){
        this.hue = hue;
    }

    public void setHue(int hue){
        this.hue = hue;
    }

    public int getHue() {
        return hue;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        Colors color = Colors.INSTANCE;
        System.out.println("hue = " + color.getHue());
        color.setHue(15);
        System.out.println("Modified: hue = " + color.getHue());
    }
}