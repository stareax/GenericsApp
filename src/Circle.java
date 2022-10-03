public class Circle implements Figures{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getPerimeter() {
        return 2*3.14*this.radius;
    }

    @Override
    public Double getSquare() {
        return 3.14*this.radius*this.radius;
    }
}
