package Questions.question8;

public class StringReverseEx {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Successfully");
        stringBuffer.reverse().replace(4,9,"");
        System.out.println(stringBuffer);
    }
}
