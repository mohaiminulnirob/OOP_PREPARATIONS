package lab9;

public class Square implements Polygon{
    double x;
    Square(int x){
        this.x=x;
    }
    public String getType(){
        return "square";
    }
    public double getArea(){
        return x*x;
    }

}
