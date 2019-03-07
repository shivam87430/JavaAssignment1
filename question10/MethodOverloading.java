package Questions.question10;

public class MethodOverloading {
    public static void main(String[] args) {
    MethodOverloading methodOverloading=new MethodOverloading();
     int sum_int=methodOverloading.add(10,12);
        System.out.println("Two Integer Sum : "+sum_int);
     double sum_double=methodOverloading.add(11.07,12.03);
        System.out.println("Two Double Sum : " +sum_double);
     float mul_float=methodOverloading.multiply(11.02f,12.02f);
        System.out.println("Two Float Multiplication : "+mul_float);
     int mul_int=methodOverloading.multiply(12,11);
        System.out.println("Two Integer Multiply : " +mul_int);
     String str=methodOverloading.concatString("Shivam"," Saxena");
        System.out.println("Two Concat String : "+str);
     String str1=methodOverloading.concatString("Nitin"," Kumar"," Singh");
        System.out.println("Three concat String : "+str1);
    }

    public int add(int a,int b){
        int c=a+b;
        return c;
    }

    public double add(double a,double b){
        double c=a+b;
        return c;
    }

    public float multiply(float a,float b){
        float c=a*b;
        return c;
    }

    public int multiply(int a,int b){
        int c=a*b;
        return c;
    }

    public String concatString(String str1,String str2){
        String str3=str1.concat(str2);
        return str3;
    }

    public String concatString(String str1,String str2,String str3){
        String str4=(str1.concat(str2)).concat(str3);
        return str4;
    }
}
