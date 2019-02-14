
package Ch8Classes;

public class Address {
    //state fields
    private int houseNum;
    private String aptNum;
    private String street;
    private String city;
    private String state;
    //we are assuming country is the USA
    //private String country;
    private int zipCode;

    //constructors
    //house
    public Address(int houseNum, String street, String city, String state, int zipCode){
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    //apartment
    public Address(int houseNum, String aptNum, String street, String city, String state, int zipCode){
        this.houseNum = houseNum;
        this.aptNum = aptNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //getters and setters

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getAptNum() {
        return aptNum;
    }

    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    //to String
    public String toString(){
        return(houseNum + " " + street + ", " + city + ", " + state + ", " + zipCode);
    }
}
