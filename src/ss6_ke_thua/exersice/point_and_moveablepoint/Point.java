package ss6_ke_thua.exersice.point_and_moveablepoint;

public class Point {
    float x;
    float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[] {x,y};
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }
}
