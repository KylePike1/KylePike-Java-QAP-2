public class person {
    private String firstName;
    private String lastName;
    private address home;

    public person(String firstName, String lastName, address home){
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    public String toString(){
        return "First Name:" + firstName + " Last Name:" + lastName + " Home Address:" + home.getStreet();
    }


}




