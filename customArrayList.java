package generics.customArrayList;

public class customArrayList {
    

    public int[] data ;
    private static int DEFAULT_SIZE = 10;

    private int size = 0;


    public customArrayList(){
        this.data = new int[DEFAULT_SIZE];

    }

    private void add(int num){
        if(data.length == size){
            resize();
        }
        
        data[size++] = num;
    }

    private void resize(){
        int[] temp = new int[size * 2];
        
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private int size(){
        return size;
    }

    private int remove(){
        return data[--size];
    }
    public static void main(String[] args) {

        customArrayList list = new customArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(100);
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);

        list.add(110);
        list.add(111);
        list.add(112);
        list.add(113);
        list.add(114);


        int size = list.size();

        System.out.println(size);

        list.remove();

        System.out.println(list.data.toString());


        

        
        
    }
}
