package palindrome;
import java.util.*;
class Palindrome {
    
    // static boolean palindrome(int num){
    //     String str = "";
    //     int num2 = num;
    //     while(num > 0){
    //         int rem = num % 10;
    //         str+=rem;
    //         num/=10;
    //     }

    // int num1 = Integer.parseInt(str);

    // System.out.println(num1);


    // if(num2 == num1){
    //  return true;

    // }
    // return false;
    // }

    static boolean palindrome(int num){
       String str = Integer.toString(num);
       
    //    ArrayList<String> arr1 =  new ArrayList<String>();

    String[] arr = str.split("");
    
    String[] arr1 = arr;
    Collections.reverse(Arrays.asList(arr));

    System.out.println(Arrays.toString(arr1) + " " + "array" + " " + Arrays.toString(arr1));

    return false;
    }
    public static void main(String[] args){

        boolean ans = palindrome(102);

        System.out.println(ans);
    }
}
