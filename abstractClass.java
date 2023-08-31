abstract class Human{
     public abstract void food();
    // public abstract void speaking_language();

    public int height;
    public int weight;
    public int legs;

}

 class indians extends Human{
    int adhar ;
    indians(int adhar){
        this.adhar = adhar;
    }

    @Override
    public void food(){
        System.out.println("Food");
    }

    public int getAdhar() {
        return this.adhar;
    }

    public void setAdhar(int adhar) {
        this.adhar = adhar;
    }


    public static void main(String[] args){
        indians anil = new indians(12345);


        anil.food();

        System.out.println(anil.getAdhar());
    }
}