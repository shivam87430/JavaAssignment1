package Questions.question3;

import java.util.Scanner;

public class CharacterOccurence {
    public static void main(String[] args) {
        System.out.println("Enter the String :");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split("");
        System.out.println("Enter the words to check the occurences");
        String c=sc.next();
        logic3 lg=new logic3();
        int occurence=lg.count(str,c);
        System.out.println("Occurence of word (" + c + ") in "+ s +" is :" +occurence);
    }
}