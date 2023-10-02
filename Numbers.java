class Numbers {

    public static void main(String args[]){

        for(int i=1;i<=9;i++){
            System.out.print(" ".repeat(9-i));

            for(int j=1 ; j<=i ; j++){
            
            System.out.print("*");
            System.out.print(" ");


            }

            System.out.print("\n");

        }
    }
}