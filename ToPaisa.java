import java.io.DataInputStream;

class ToPaisa{


    public static void main(String args[]){

    DataInputStream in = new DataInputStream(System.in);

            float rupees =0 ;
            
            
            try{

                System.out.println("enter rupees");

                rupees = Float.valueOf(in.readLine());


            }
            catch (Exception e){

            }
        
        double paisa = rupees * 100;

        // String p = String(paisa);
        String aa = "assnsidj";
        System.out.println( aa);          


}}