package ss6_ke_thua.exersice;

public class Ccircle_class {
    double radius;
    double pi =3.14;
    String color;
    double acreage;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public Ccircle_class(double radius, double pi, String color, double acreage) {
        this.radius = radius;
        this.pi = pi;
        this.color = color;
        this.acreage = acreage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }
}
