package Questions.question2;

import java.util.Scanner;

public class logic2 {
    public void que2(){
        System.out.println("Enter the string to check Duplicacy");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("String is : "+str);
        String[] str1=str.split(" ");
        int wc=1;
        for(int i=0;i<str1.length;i++){
            for(int j=i+1;j<str1.length;j++) {
                if (str1[i].equals(str1[j])) {
                    wc = wc + 1;
                    str1[j] = "0";

                }
            }
                if(str1[i]!="0"){
                    System.out.println(str1[i] + "---->" + wc);
                    wc=1;
                }

        }
    }
}