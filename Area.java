
class Values{
    int length;
    int breadth;

   void getVal(int a ,int b){
        length = a;
        breadth = b;
    }
}

public class Area {

    public static void main(String args[]){

        Values val = new Values();

        val.getVal(20,40);

        System.out.println(val.length * val.breadth);
    }   
}