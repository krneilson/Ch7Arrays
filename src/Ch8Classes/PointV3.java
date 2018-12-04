//this class is a template to represent a point on
//the cartesian coordinate
package Ch8Classes;

public class PointV3 {
    //static field below (variables)
    public int x;
    public int y;

    //Constructor Methods
    //constructor dose not nave a return type and is called implicitly when a object is created

    public PointV3(int initialX, int initialY){
        x = initialX;
        y = initialY;
    }

    //when you make a constructor the default constructor is terminated
    //this method brings it back
    public PointV3(){
        x = 0;
        y = 0;
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
    public double distance(PointV3 other){
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

