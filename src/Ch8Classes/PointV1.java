//this class is a template to represent a point on
//the cartesian coordinate
package Ch8Classes;

public class PointV1 {
    //static field below (variables)
    public int x;
    public int y;

    //behaviors below (methods)

    //setter (mutator) methods below
    public void translate (int dx, int dy) {
        x += dx;
        y += dy;

    }

    public void setLocation(int newX, int newY){
        x = newX;
        y = newY;
    }

    //getter (accessor) methods below
    public double distance(PointV1 other){
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt((dx*dx) + (dy + dy));
    }

    public double distanceFromOrign(){
        int dx = x;
        int dy = y;
        return Math.sqrt((dx*dx) + (dy + dy));


    }
}
