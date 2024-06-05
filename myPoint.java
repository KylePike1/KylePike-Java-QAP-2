public class myPoint {
    private int x = 0;
    private int y = 0;
    

    public myPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return ("(" + this.x + "," +  this.y + ")");
    }
    public double distance(int x, int y)
    {
        int xDiff = this.x -x;
        int yDiff = this.y-y;

        return (Math.sqrt((xDiff*xDiff) + (yDiff*yDiff)));
    }
    public double distance(myPoint p)
    {
        int xDiff = this.x-p.x;
        int yDiff = this.y-p.y;
        return (Math.sqrt((xDiff*xDiff) + (yDiff*yDiff)));
    }
    public double distance()
    {
        int xDiff = this.x-0;
        int yDiff = this.y-0;
        return (Math.sqrt((xDiff*xDiff) + (yDiff*yDiff)));
    }

   
}


