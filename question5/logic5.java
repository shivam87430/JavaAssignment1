package Questions.question5;

public class logic5 {
    public static void main(String[] args) {

    int[] arr=new int[]{1,2,3,4,5,6,7,8};
    int[] arr1=new int[]{2,21,23,3,5,4,123,231};
    int[] arr_withoutduplicacy=new int[]{};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr1.length;j++){
            if(arr[i]==arr1[j]){
                System.out.println(arr[i]);
             }
        }

        }
    }
}
