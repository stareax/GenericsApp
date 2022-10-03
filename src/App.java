import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        FigureCalculator<Circle, Square> calculator = new FigureCalculator<>();
        System.out.println(calculator.sumSquares(new Circle(4.0), new Square(5.0)));


        List<? super Number> list = new ArrayList<>();
        list.add(3);
        list.add(3.0);
        list.add(5.0f);
        list.add(5L);
    }
}
