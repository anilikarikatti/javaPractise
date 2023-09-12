
public class sorting{
    public static void main(String args[]){
        char arr[] = {'a','b','c'};

        boolean a = maxElement(arr);
           
        }
   

    boolean maxElement(char[] arr){
         char largeElement = arr[0];
            for(char elem : arr){
            if(elem > largeElement ){
                largeElement = elem;
            }
        System.out.println(largeElement);

    }

    return true;

}
 }