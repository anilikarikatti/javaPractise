// import java.util.ArrayList;
// class Generics {
//     public static void main(String[] args){
//         ArrayList <Integer> list = new ArrayList<Integer>();

//         list.add(10);

//         // list.add("10");
        
//         // list.add("anil karikatti");


//         for(int i=0;i<list.size() ; i++){
//             System.out.println(list.get(i));
//         }
//     }
// }

// create generic class
class Generics<Anil> {
    Anil age;
    Anil name;

    void ins(Anil age, Anil name){
        this.age = age;
        this.name = name;
    }

    Anil reta(){
        return age  ;
    }

    Anil retn(){
        return name  ;
    }
}


class M{
    public static void main(String[] args){
        Generics  m= new Generics();

        m.ins("20","anil");

        Generics ans =m.reta();
        System.out.println(ans);
    }
}