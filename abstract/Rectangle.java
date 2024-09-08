public class Rectangle extends Shapes {
    
    void draw(){
        System.out.println("hello draw a Rectangle");
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.draw();
    }
}
