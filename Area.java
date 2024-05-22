public class Area {
    private double length;
    private double breadth;

    
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    
    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area rectangle = new Area();
        rectangle.setDim(15, 10);
        System.out.println( "Area  is: " + rectangle.getArea());
    }
}