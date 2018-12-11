package Ch8Classes;

public class PointClientV4 {
    public static void main(String[] args){

        //instantiate a point called p1 of type PointV3

        //this is the tedious way to instantiate and initialize
        //PointV3 p1 = new PointV3();
        //System.out.println("p1: " + p1);
        //p1.x = 3;
        //p1.y = 6;
        //System.out.println("p1: " + p1);

        //this is the better way
        PointV3 p1 = new PointV3(3,6);
        System.out.println("p1: " + p1);

        PointV3 p2 = new PointV3(7, 25);
        System.out.println("p2: " + p2);

        System.out.println(p2.distance(p1));
        System.out.println(p2.distanceFromOrign());

        PointV3 p3 = new PointV3();
        System.out.println("p3: " + p3);


    }
}
