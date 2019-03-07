package Questions.question11;

public class BankDetails {
    public static void main(String[] args) {
        Banks obj=new Banks();
        obj.getDetails();
        Banks obj1=new SBI();
        obj1.getDetails();
        Banks obj2=new PNB();
        obj2.getDetails();
        Banks obj3=new OBI();
        obj3.getDetails();

    }

}
class Banks{
    public void getDetails(){
        System.out.println("Bank Information\n");
    }
}

class SBI extends Banks{
    public void getDetails(){
        System.out.println("State Bank Of India\nRate of Interest is : 10\n");
    }
}

class PNB extends Banks{
    public void getDetails(){
        System.out.println("Punjab National Bank\nRate of Interest is : 14\n");
    }
}

class OBI extends Banks{
    public void getDetails(){
        System.out.println("Oriental Bank Of India\nRate of Interest is : 12\n");
    }
}