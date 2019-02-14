package Ch8Classes;

public class DateOfBirth {
    //state fields
    private final int day;
    private final int month;
    private final int year;

    //Constructors
    public DateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //getters
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return(year + "/" + month + "/" +day);
    }
}
