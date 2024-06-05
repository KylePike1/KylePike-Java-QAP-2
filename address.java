public class address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public address(String street, String city, String state, String zip){
        this.street = street;
        this.state = state;
        this.zip = zip;
        this.city = city;
    }
    public String toString(){
        return "Street:" + street + ",City:" + city + ",State:" + state + ",ZIP:" + zip;
    }

    public String getStreet(){
        return this.street;
    }





}
