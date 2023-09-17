// create 
// display 
// insert 
// delete
import java.util.*;
import java.util.Scanner;
class CreateArray{
    int size;
    public CreateArray(int size){
        this.size = size;
    }

    int[] create(){
        int arr[] = new int[this.size];
        // arr[0]=20;
        return arr;
    }
}

class Main{
    public static void main(String[] args){
        boolean running = true;
        
        Scanner sc = new Scanner(System.in);
            int [] arr = {};

        while(running){
            System.out.println("1 : Create");
            System.out.println("2 : Display");
            System.out.println("3 : insert");
            System.out.println("4 : delete");
            System.out.println("5 : exit");

            int inp = sc.nextInt();

            // System.out.println(inp);


            switch(inp){
                case 1 :
                    CreateArray createArr = new CreateArray(10);
                    arr = createArr.create();
                    System.out.println(arr.toString());
                    break;

                case 2 : 
                    DisplayArr(arr);
                    break;
                
                case 3 : 
                    System.out.println("enter the position of element");
                    int pos = sc.nextInt();

                    System.out.println("enter the element");
                    int elem = sc.nextInt();

                    Insert(elem,pos,arr);
                    // arr[pos] = elem;
                    System.out.println("inserted");
                    break;

                case 4 : 
                    System.out.println("enter the position of element");
                    int delpos = sc.nextInt();

                    Delete(delpos,arr);
                   
                    System.out.println("deleted");
                    break;
                
                case 5 : 
                    running = false;
                    System.out.println("Exited ");
                    break;
                
                    
            }

        }
    }

    public static void DisplayArr(int[] arr){
        System.out.println(Arrays.toString(arr));

        // for(int elem : arr){
        //     System.out.println(elem);
        // }

    }


    public static void Insert(int elem,int pos,int[] arr){
        System.out.println(arr);

        arr[pos] = elem;
        
    }

    public static void Delete(int pos,int[] arr){
        System.out.println(arr);

        arr[pos] = 0;
        
    }
} 