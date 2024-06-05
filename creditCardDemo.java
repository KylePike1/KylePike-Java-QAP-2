public class creditCardDemo {
    public static void main(String[] args){
        final money limit = new money(1000);
        final money firstAmount = new money(200);
        final money secondAmount = new money(10,2);
        final money thirdAmount = new money(25);
        final money fourthAmount = new money(990);
        person owner = new person("Kyle", "Pike", new address("27 Harvey Hall", "Flatrock", "ohio", "123456" ));
        creditCard visa = new creditCard(owner,limit);
        System.out.println(visa.ownerInfo());
        System.out.println(visa.getBal());
        System.out.println("Credit Limit: " + visa.getLimit());
        System.out.println();
        System.out.println("Attempt to Charge " + firstAmount);
        visa.charge(firstAmount);
        System.out.println(visa.getBal());
        System.out.println("Attempt to Charge " + secondAmount);
        visa.charge(secondAmount);
        System.out.println(visa.getBal());
        System.out.println("Attempt to Pay " + thirdAmount);
        visa.pay(thirdAmount);
        System.out.println(visa.getBal());
        System.out.println("Attempt to Charge " + fourthAmount);
        visa.charge(fourthAmount);
        System.out.println(visa.getBal());
    
    }
}
