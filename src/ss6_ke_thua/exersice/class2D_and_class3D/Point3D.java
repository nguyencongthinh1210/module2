package ss6_ke_thua.exersice.class2D_and_class3D;

public class Point3D extends Point2D{
    float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }


    public void setXYZ(float x, float y, float Z) {
        super.setXY(x, y);
        this.z = z;
    }


    public float[] getXYZ() {
        return new float[] {this.getX(),this.getY(),z} ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
