package Questions.question6;

public class CheckElement {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,2,1,3,5,5};
        int arr_size=arr.length;
        Logic6 lg=new Logic6();
        int res=lg.searchElement(arr,arr_size);
        System.out.println(res);

    }

}
