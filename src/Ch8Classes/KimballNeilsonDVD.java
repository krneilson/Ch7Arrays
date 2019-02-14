package Ch8Classes;

/**
 * this class creates a DVD for the DVDCollection  class
 * @author Kimball Neilson
 *
 */
public class KimballNeilsonDVD {

    //state fields
    private String title;
    private String director;
    private int year;
    private double cost;
    private boolean blueray;

    /**
     * This method constructs a movie whit all the relevant information
     * @param title is the title of the movie
     * @param director the name of the director of the movie
     * @param year the year the movie was released
     * @param cost the cost of the movie
     * @param blueray if the disc is blueray or not
     */
    public KimballNeilsonDVD(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    /**
     * this if the toString method for the DVD class
     */
    public String toString() {
        String detals = ("$" + cost  + " " + year + " " + title + " " + director);
        if(blueray == true) {
            detals += "\tBlue-Ray";
        }
        return(detals);
    }

}