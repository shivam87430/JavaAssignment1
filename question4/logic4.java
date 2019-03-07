package Questions.question4;

import java.util.Calendar;

public class logic4 {
    public void charPercent(String s) {
        int lowerchar=0;
        int upperchar=0;
        int digit=0;
        int specialchar=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch)){
                lowerchar++;
            }else if(Character.isUpperCase(ch)){
                upperchar++;
            }else if(Character.isDigit(ch)){
                digit++;
            }else {
                specialchar++;
            }
        }
        float lower_char_perc=(lowerchar*100)/len;
        float upper_char_perc=(upperchar*100)/len;
        float digit_perc=(digit*100)/len;
        float special_char_perc=(specialchar*100)/len;

        System.out.println("Number of lower case letter :"+lowerchar);
        System.out.println("Number of percentage of lower case letter :"+lower_char_perc);
        System.out.println("Number of Upper case letter :"+upperchar);
        System.out.println("Number of percentage of upper case letter :"+upper_char_perc);
        System.out.println("Number of digit in String : " +digit);
        System.out.println("Number of percentage of Digit :"+digit_perc);
        System.out.println("Number of Special case letter :"+specialchar);
        System.out.println("Number of percentage of lower case letter :"+special_char_perc);
    }
}
