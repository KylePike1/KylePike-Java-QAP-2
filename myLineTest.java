public class myLineTest {
    public static void main(String[] args){
        myPoint point1 = new myPoint(35,12);
        myPoint point2 = new myPoint(3, 30);
        myLine line1 = new myLine(3,7,1,12);
        myLine line2 = new myLine(point1, point2);
        System.out.println(line1.getBegin());
        System.out.println(line2.getBegin());
        System.out.println(line1.getEnd());
        System.out.println(line2.getEnd());
        line1.setBegin(point2);
        line2.setEnd(point1);
        System.out.println(line1.getBeginX());
        System.out.println(line1.getBeginY());
        System.out.println(line1.getEndX());
        System.out.println(line1.getEndY());
        line1.setBeginX(48);
        line1.setBeginY(50);
        line1.setEndX(84);
        line1.setEndY(48);
        System.out.println(line1.getEndXY());
       
        System.out.println(line1.toString());
        System.out.println(line2.toString());
        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());
        System.out.println(line2.getGradient());

    }

    
}
