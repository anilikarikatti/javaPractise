abstract class Name{
    
     public abstract void name();
    public   void age(){
        System.out.println("hello ");
    }

    public static String getName(String name){
        return name;
    }
}

interface One{
     public  void age1();
}


interface Two{
     int sum = 100000;
}

class Interface extends Name implements One,Two{
    
    // @Override
    @Override
    public  void name(){

    }


    
    public  void age(int age){
        System.out.println("hell asdasddo ");

    }

    @Override
    public  void age1(){
        System.out.println("age12 ");

    }
    public static int getName(int age){
        return age;
    }

    static String type ;

    static int sum = 110;

    final int aggg = 12;
    public static void main(String args[]){

        Interface i = new Interface();

        i.age();

        System.out.println(Interface.getName("anil"));

        System.out.println(Interface.sum);


        i.age1();
        // Interface.age1();

        

    }   
}


