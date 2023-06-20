
import java.util.*;
public class addVal {
    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        int[] function1 = twosums(arr,9);
        int[] function2 = twosum(arr,9);

        System.out.print(Arrays.toString(function1));
        System.out.print(Arrays.toString(function2));

    }
    // implemention using hashing
    public static int[] twosums(int [] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int x=target-current;
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(current, i);
        }
        return null;
    }
    // implemention using simple iteration
    public static int[]twosum(int arr[] ,int target){
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
