package ss6_ke_thua.exersice;

public class Cylinder extends Ccircle_class{
    double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double pi, String color, double acreage, double height) {
        super(radius, pi, color, acreage);
        this.height = height;
        System.out.println("");
    }
}
