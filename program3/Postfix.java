import java.util.*;

class Postfix {

    static String[] toArray(String str){
        String[] arr = str.split("");

        return arr;
    }

    static void check(String[] arr,ArrayList <String> stack){
        String str = "";
        // String totStr = "";
        ArrayList <String> operators = new ArrayList <String>(Arrays.asList("+","-","*","/"));
        // operators.add("+");
        for(String elem : arr){
            if(operators.contains(elem)){
                System.out.println(elem);
                
                stack.add(elem);

               
        }
        else{

            if(stack.size() > 0){
                str+=elem;
                str+=stack.get(0);
                
                // str = "";
                stack.remove(0);

            }else{
            str +=elem;

            }
        }
            // switch(elem){
            //     case "+":
            //         System.out.println("entered");
            //         stack.add(elem);
            //         break;
            // }
              
            
        }

        // System.out.println(stack);
        System.out.println(str);
            
        }


    
    public static void main  (String[] args){


        
    
        System.out.println("enter the expresssion");
        Scanner sc = new Scanner(System.in);
        
        String expre = sc.next();

        // String expre = "a+b-c";

        ArrayList <String> stack = new ArrayList <String>();

        String[] arr = toArray(expre);

        System.out.println(Arrays.toString(arr));

        check(arr, stack);

        
        
    }    
}