public class creditCard {
    
    private money balance = new money(0,0);
    private money limit = new money(1000, 0);
    private person owner;


    public creditCard(person owner, money limit){
        this.owner = owner;
        this.limit = limit;
    }

    public money getBal(){
        long newDollars = balance.getDollars();
        long newCents = balance.getCents();
        return new money(newDollars, newCents );
    }

    public money getLimit(){
        long newDollars = limit.getDollars();
        long newCents = limit.getCents();
        return new money(newDollars, newCents);
    }

    public String ownerInfo(){
        return owner.toString();
    }

    public String charge(money amount){
        if( (amount.getDollars() + balance.getDollars()) > limit.getDollars()){
            return "Amount exceeded Credit Limit";
        }
        else{
            balance.add(amount);
            return "Charge Successfull";
        }
    }
    public String pay(money amount){
        balance.subtract(amount);
        return "Payment Success! New Balance:" + balance;
    }
}



