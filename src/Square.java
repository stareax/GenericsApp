public class Square implements Figures {
    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    @Override
    public Double getPerimeter() {
        return 2*this.side;
    }

    @Override
    public Double getSquare() {
        return side*side;
    }
}
