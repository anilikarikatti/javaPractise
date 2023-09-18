
import java.util.*;
import java.util.Scanner;
class StringOperations {


   static String Userinput(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    static String Paterninput(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    static String Replaceinput(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    static String MatchString(String main,String pat,String replacedStr){
        String matched = "";
          ArrayList <String> matches = new ArrayList<String>(); 
        int PatternIndex = 0;
        int i=0;
        while( i < main.length()){
            System.out.println(main.charAt(i));
            if(main.charAt(i) == pat.charAt(PatternIndex)){

                matched += main.charAt(i);
                System.out.println(PatternIndex);

                 PatternIndex+=1;
                if(PatternIndex > pat.length()-1){
                    // System.out.println("called");
                    main = ReplaceString(i-(pat.length()-1),main,replacedStr,i);
                    
                    matches.add(matched);
                    matched = "";
                    PatternIndex = 0;
                    
                }
                i++;
               
    

              }   
            else{
                if(PatternIndex > 0){
                    PatternIndex = 0;
                    matched = "";
                    if(main.charAt(i) == pat.charAt(PatternIndex)){

                        matched += main.charAt(i);
                        // System.out.println(PatternIndex);
        
                         PatternIndex+=1;
                        if(PatternIndex > pat.length()-1){

                            matches.add(matched);
                            matched = "";
                            PatternIndex = 0;
                            
                        }
                        i++;
                       
            
        
                      }   
                }
                else{
                matched = "";
                PatternIndex = 0;
                i++;
                }
                
            
            }
            
           

        }
        System.out.print("matched " + matches.toString());
        return main;

    }

    public static String ReplaceString(int index,String str,String replacedStr,int ind){
        

        String[] arr = str.split("");
        System.out.println(index);


        String[] reparr = replacedStr.split("");

        System.out.println(Arrays.toString(arr));

        int repindex = 0;

        // to shift elements

        String[] tempArr = new String[arr.length+replacedStr.length()];
        for(int i=0;i<arr.length;i++){
                if(i == ind){

                    tempArr[i+replacedStr.length()-1] = arr[i];
                    ind++;
                }
        }

        System.out.println(Arrays.toString(tempArr));
        


        for(int i=0;i<arr.length;i++){
            if(index == i){
                 if(repindex <= replacedStr.length()-1){
                    tempArr[i] = reparr[repindex];
                    index+=1;
                    repindex+=1;
                    

                 }
            }
        }
        String str1= "";
        
        for(String a : arr){
            str1+=a;
        }
        System.out.println(str1);

            return str1;
    }
    public static void main(String[] args){
        
        // System.out.println("Enetr the main String");
        // String mainString = Userinput();
        
        // System.out.println("Enetr the patern String");
        // String patternString = Paterninput();

        // System.out.println("Enetr the replace String");
        // String replaceString = Replaceinput();

        String mainString = "anilsdsdsdddfsgfsfszzfz";
        String patternString = "sd";
        String replaceString = "ggggg";
        String afterReplace = MatchString(mainString,patternString,replaceString);
        System.out.println(afterReplace);

    }
}