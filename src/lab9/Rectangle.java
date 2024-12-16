package lab9;

public class Rectangle implements Polygon{
    double x,y;
    Rectangle(int x,int y){
        this.x=x;
        this.y=y;
    }

    public String getType(){
        return "rectangle";
    }
    public double getArea(){
        return x*y;
    }
}
