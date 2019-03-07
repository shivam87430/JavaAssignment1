package Questions.question6;

public class Logic6 {
    public int searchElement(int arr[],int arr_size){
        int res=arr[0];
        for(int i=1;i<arr_size;i++){
            res=res^arr[i];
            }
            return res;
        }

}

