package Questions.question7;

public class StaticExample {
    static String First_name;
    static String Last_name;
    static int Age;
    public static void main(String[] args) {
        System.out.println("FirstName : "+First_name);
        System.out.println("LastName :"+Last_name);
        System.out.println("Age :"+Age);
    }
    static{
        System.out.println("This is a static block");
        First_name="Shivam";
        Last_name="Saxena";
        Age=20;
    }


}
