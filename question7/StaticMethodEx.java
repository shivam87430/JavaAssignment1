package Questions.question7;

public class StaticMethodEx {
    static private String FirstName;
    static private String LastName;
    static private int Age;

    public static void main(String[] args) {
            StaticMethodEx.My_info("shivam","saxena",20);
            System.out.println(FirstName);
            System.out.println(LastName);
            System.out.println(Age);

    }
    public static void My_info(String f,String l,int a){
        FirstName=f;
        LastName=l;
        Age=a;
    }
}
