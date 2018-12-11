//this class is a template to represent a point on
//the cartesian coordinate
package Ch8Classes;

public class PointV4 {
    //static field below (variables)
    private int x;
    private int y;

    //Constructor Methods
    //constructor dose not nave a return type and is called implicitly when a object is created
    public PointV4(int x, int y){
        this.x = x;
        this.y = y;
    }

    //when you make a constructor the default constructor is terminated
    //this method brings it back
    public PointV4(){
        x = 0;
        y = 0;
    }

    //getter (accessor) methods below
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setter (mutator) methods below
    //if the variables have the same name us "this." to specify that it is the State field
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

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
    public double distance(PointV4 other){
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt((dx*dx) + (dy + dy));
    }

    public double distanceFromOrign(){
        int dx = x;
        int dy = y;
        return Math.sqrt((dx*dx) + (dy + dy));
    }

    //we're overriding the object's built-in toSting() methed
    //to print the contents of the object insted of its location in memory
    public String toString(){
        return("(" + x + ", " + y + ")");
    }

}

