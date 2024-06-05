public class myRectangle {
    private myPoint topLeft =  new myPoint(0,0);
    private myPoint bottomRight = new myPoint(0,0);

    public myRectangle(myPoint topLeft, myPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public myRectangle(int x1, int y1, int x2, int y2){
        topLeft.setX(x1);
        topLeft.setY(y1);
        bottomRight.setX(x2);
        bottomRight.setY(y2);
    }
    public myPoint getTopLeft(){
        return topLeft;
    
    }
    public myPoint getBottomRight(){
        return bottomRight;
    
    }

    public void setTopLeft(myPoint point){
        this.topLeft = point;
    }

    public void setBottomRight(myPoint point){
        this.bottomRight = point;
    }

    public int getWidth(){
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }
    public int getHeight(){
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }
    public int getArea(){
        return getWidth() * getHeight();
    }

}
