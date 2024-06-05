import java.util.*;
public class myLine{
    private myPoint startPoint =  new myPoint(0,0);
    private myPoint endPoint = new myPoint(0,0);


    public myLine(myPoint startPoint, myPoint endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public myLine(int x1, int y1, int x2, int y2){
        startPoint.setX(x1);
        startPoint.setY(y1);
        endPoint.setX(x2);
        endPoint.setY(y2);
        

    }

    public myPoint getBegin(){
        return startPoint;
    
    }
    public myPoint getEnd(){
        return endPoint;
    
    }

    public void setBegin(myPoint point){
        this.startPoint = point;
    }

    public void setEnd(myPoint point){
        this.endPoint = point;
    }

    public int getBeginX(){
        return startPoint.getX();
    }
    public int getBeginY(){
        return startPoint.getY();
    }
    public int getEndX(){
        return endPoint.getX();
    }
    public int getEndY(){
        return endPoint.getY();
    }
    public void setBeginX(int x){
        startPoint.setX(x);
    }
    public void setBeginY(int y){
        startPoint.setY(y);
    }
    public void setEndX(int x){
        endPoint.setX(x);
    }
    public void setEndY(int y){
        endPoint.setY(y);
    }
    public int getBeginXY(){
        return startPoint.getX() + startPoint.getY();
    }
    public void setBeginXY(int x, int y){
        startPoint.setXY(x, y);
    }
    public int getEndXY(){
        return endPoint.getX() + endPoint.getY();
    }
    public void setEndXY(int x, int y){
        endPoint.setXY(x, y);
    }
    public double getLength(){
        return Math.sqrt(((getEndX() - getBeginX())*(getEndX()-getBeginX())) + ((getEndY() - getBeginY())*(getEndY() - getBeginY())));
    }
    public double getGradient(){
        return Math.atan2((getEndX() - getBeginX()),(getEndY() - getBeginY()));
    }
    public String toString(){
        return "MyLine[Begin = (" + startPoint.getX() + "," + startPoint.getY() +"), End = (" + endPoint.getX() + "," + endPoint.getY() + ")]";
    }
}