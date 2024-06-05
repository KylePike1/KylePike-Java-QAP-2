public class money {
    private long dollars;
    private long cents;
    
    public money(long dollars, long cents){
        this.dollars = dollars;
        this.cents = cents;
    }
    public money(long dollars){
        this.dollars = dollars;
    }

    public long getDollars(){
        return dollars;
    }
    public long getCents(){
        return cents;
    }

    public money(money other){
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public void add(money other){
        long newDollars = this.dollars + other.dollars;
        long newCents = this.cents + other.cents;
        this.dollars = newDollars;
        this.cents = newCents;
    }
    public void subtract(money other){
        long newDollars = this.dollars - other.dollars;
        long newCents = this.cents - other.cents;
        if (newDollars < 0){
           
        }
        else{
            this.dollars = newDollars;
            this.cents = newCents;
        }
        
    }

    public long compareTo(money other){
        long newDollars = this.dollars - other.dollars;
        long newCents = this.cents - other.cents;

        return newDollars +  newCents;
    }
    public String toString(){
        return "Balance: $" + this.dollars + "." + this.cents;
    }

    public boolean equals(money other){
      
        if(this.dollars == other.dollars){
            return true;
        }else{
            return false; 
    }

   

}

}
