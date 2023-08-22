public class CommandLineTest{

    public static void main (String args[]){

        int i = 0;

        int count = args.length;

        System.out.println(count);
        
        System.out.println(args[0] + args[1]);
        while(i < count ){
            System.out.println(i + " " + args[i]);
            i++;
        }
    }
}