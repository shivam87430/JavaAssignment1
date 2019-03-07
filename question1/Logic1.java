package Questions.question1;

public class Logic1 {

        public void ques1(){
        CharSequence str="shivam";
        CharSequence str2="IV";
        CharSequence charSequence=str.subSequence(2,4);
        System.out.println("replace " +charSequence+" with "+str2);
        CharSequence str3=((String) str).replace(charSequence,str2);
        System.out.println(str3);
    }

}
