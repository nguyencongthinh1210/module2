package ss05;

public class acessmodifite {
    class Student{
        private String name = "John";
        private String classes = "C02";

        public Student() {
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setClasses(String classes) {
            this.classes = classes;
        }
    }

    public class Test {
        public static void main(String[] args) {
            Student student = new Student();
            student.setName(" ");
            student.setClasses(" ");
        }
    }
    class Circle{
        private double radius = 1.0;
        private String color = "red";

        public Circle() {
        }

        public Circle(double r) {
            this.radius = r;
        }

        public double getRadius() {
            return radius;
        }
        public double getArea() {
            return radius*radius*3.14;
        }
    }
    public class TestCircle {
        public static void main(String[] args) {
            Circle circle1=new Circle();
            System.out.println(circle1.getRadius());
            System.out.println(circle1.getArea());
            circle1.getArea();
            Circle circle2=new Circle(5);
            System.out.println(circle2.getRadius());
            System.out.println(circle2.getArea());
        }
    }
}
