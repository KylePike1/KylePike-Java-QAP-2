public class myRectangleTest {
    public static void main(String[] args) {
        myPoint topLeft = new myPoint(35, 89);
        myPoint bottomRight = new myPoint(1, 80);
        myRectangle rectangle = new myRectangle(topLeft, bottomRight);
        System.out.println(rectangle.getBottomRight());
        System.out.println(rectangle.getTopLeft());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getArea());
        
        

    }
    
}
