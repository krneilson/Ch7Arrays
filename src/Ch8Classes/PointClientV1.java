package Ch8Classes;

public class PointClientV1 {
    public static void main(String[] args){
        //instantiate a point called p1
        PointV1 p1 = new PointV1();
        System.out.println("p1: (" + p1.x + ", " + p1.y + ")");
        p1.x = 3;
        p1.y = 6;
        System.out.println("p1: (" + p1.x + ", " + p1.y + ")");

        PointV1 p2 = new PointV1();

        p2.x = 7;
        p2.y = 25;
        System.out.println("p2: (" + p2.x + ", " + p2.y + ")");
        System.out.println(p2.distance(p1));
        System.out.println(p1.distanceFromOrign());
    }
}
