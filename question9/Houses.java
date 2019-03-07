package Questions.question9;

public enum Houses {
    HOUSES_2BHK(100000L),
    HOUSES_3BHK(200000L),
    HOUSES_4BHK(300000L);
    Long price;

    Houses(Long p){
        this.price=p;
        System.out.println("fetching through Constructor --> "+this.toString()+" and price is --> "+p);
    }

    Long getPrice(){
        return price;
    }
}

class DisplayHouses{
    public static void main(String[] args) {
        for(Houses i: Houses.values()) {
            System.out.println("this is through getPriceMethod() --> "+i+" cost price is --> "+i.getPrice());
    }
}
}