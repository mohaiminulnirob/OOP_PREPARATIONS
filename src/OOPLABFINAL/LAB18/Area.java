package OOPLABFINAL.LAB18;

public class Area {
    protected double base;
    protected double height;
    public Area(double base, double height) {
        this.base = base;
        this.height = height;
        System.out.println("Parent class Area is initialized.");
    }
    public void displayDimensions() {
        System.out.println("Base: " + base + ", Height: " + height);
    }
}

