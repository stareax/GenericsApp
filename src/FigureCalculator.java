public class FigureCalculator<T extends Figures, R extends Figures> {
    Double sumSquares(T fig1, R fig2){
        return fig1.getSquare()+ fig2.getSquare();
    }

}
