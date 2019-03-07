package Questions.question3;

public class logic3 {
    int count(String[] s, String c){
        int count=0;
        for(int i=0;i<s.length;i++){
            if(s[i].equals(c))
                count++;
        }
        return count;
    }
}
