public class Circle extends Shapes {

    // Circle(int age){
    //     super(age);
    // }

    void draw(){
        System.out.println("hello draw a circle");
    }
     void log(){
        System.out.println("this is log ");
    }

   
    public static void main(String[] args) {
        
        // Circle circle = new Circle();

        Shapes.area();

        Circle circle = new Circle();

        circle.draw();


    }
    
}
