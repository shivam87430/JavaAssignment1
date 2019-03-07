package Questions.question4;

import java.util.Scanner;

public class Character_Percentage {
    public static void main(String[] args) {
        System.out.println("Enter String to check");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        logic4 lg=new logic4();
        lg.charPercent(str);

    }
}
