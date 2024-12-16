package lab9;

public interface Polygon {
    public double getArea();
    public default String getType(){
        return "polygon";
    }

}
