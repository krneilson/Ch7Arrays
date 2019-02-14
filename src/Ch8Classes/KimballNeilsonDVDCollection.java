package Ch8Classes;
import java.util.Arrays;

/**
 * this class that creates a movie collection
 * @author Kimball Neilosn
 *
 */
public class KimballNeilsonDVDCollection {

    private KimballNeilsonDVD[] collection;
    private int count;
    private double totalCost;

    /**
     * This method constructs the DVD collection
     */
    public KimballNeilsonDVDCollection() {
        collection = new KimballNeilsonDVD[0];
        count = 0;
        totalCost = 0.00;
    }

    /**
     * this method adds a DVD to the Collection
     */
    public void addDVD(String title, String director, int year, double cost, boolean blueray) {
        increaseSize();
        collection[count-1] = new KimballNeilsonDVD(title, director, year, cost, blueray);
        totalCost += cost;
    }

    /**
     * this method increases the size of the collection
     */
    private void increaseSize() {
        collection = Arrays.copyOf(collection, collection.length+1);
        count++;
    }

    /**
     * this method is the toStrinng for DVDCollection
     */
    public String toString() {
        String myCollection = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "My DVD Collection\n\nNumber of DVDs:" + count + "\nTotal cost: $" + (Math.round(totalCost*100.0)/100.0)
                + "\nAverage cost: $" + (Math.round((totalCost/count)*100.0)/100.0) + "\n\nDVD List:\n\n";
        for(int i = 0; i < count; i++) {
            myCollection = myCollection + collection[i] + "\n";
        }
        return myCollection;
    }

}
