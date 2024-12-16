package OOPLABFINAL.LabFinalEven;

public class Address {
    public String street;
    public String city;
    public String state;
    public int postalCode;
    public String country;

    public Address(String street, String city, String state, int postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public boolean validate() {
        return true;
    }

    public String outputAsLabel() {

        return street + ", " + city + ", " + state + " " + postalCode + ", " + country;
    }
}
