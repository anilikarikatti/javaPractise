class Primitive{

    public static void main(String args[]){

        int num = 123_345_678;

        System.out.println(num);

        float f = 1234.45_4F;

        System.out.println(f);

        String f1 = Float.toString(f);

        System.out.println(f1);

        int arr[] = {1,3,5,2,7};
        // int arr[];
        // arr = new int [4];

        // arr[0] = 100;
        // arr[2] = 200;
        // arr[3] = 300;
        // arr[1] = 400;

    int[] copArr = new int[3];

    System.arraycopy(arr,1,copArr,1,2);


    for(int a : copArr){
        System.out.println(a);
    }
}
}