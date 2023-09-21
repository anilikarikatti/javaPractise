package program4;

import java.util.ArrayList;

public class DuplicateCount {
    
    public  static void main(String[] args){
        int[] arr = {10,20,10,20,10,30};
        int total = 0;

        ArrayList <Integer> values = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ArrayList <Integer> val = new ArrayList<>();
            if(!values.contains(arr[i])){
                values.add(arr[i]);

            for(int j=i;j<arr.length;j++){
                    if(arr[i] == arr[j])
                        val.add(j);
                }
            }
            int count=0;
            for(int k = val.size()-1 ; k  >= 0 ; k--){
                if(val.get(k) > count){
                    count = val.get(k)-count;
                }else{
                    count -= val.get(k);
                }
            }
            // System.out.println(val);
            total +=count;
            // System.out.println(count);
        }
            System.out.println(values);
            System.out.println(total);


    }
}
