import java.util.ArrayList;

public class Leaders_in_array {
    static void leader(int[] arr){
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){ 
            boolean flag=true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[i]) {
                    flag =false;
                    break;   
                }
            }
            if (flag==true) {
                list.add(arr[i]);
            }


        }
        for (Integer integer : list) {
                System.out.println(integer);            
        }

    }
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};
        leader(arr);
        
    }
    
}
