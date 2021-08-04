public class Rectangle implements AreaAndPerimeter{
    public int length;
    public int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        int length=this.length;
        int breadth=this.breadth;
        int area=length*breadth;
        System.out.println("Area = "+area);
    }

    @Override
    public void perimeter() {
        int length=this.length;
        int breadth=this.breadth;
        int perimeter=2*(length+breadth);
        System.out.println("Perimeter = "+perimeter);

    }

}
