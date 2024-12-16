package OOPLABFINAL.LabFinalEven;

public  abstract class Person {
    public String name;
    public String phoneNumber;
    public String emailAddress;
    public Address address;
    public Person(String name, String phoneNumber, String emailAddress, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }
    public abstract void purchaseParkingPass() ;
    public String getAdreess(){
        String s=address.outputAsLabel();
        return s;
    }

}
