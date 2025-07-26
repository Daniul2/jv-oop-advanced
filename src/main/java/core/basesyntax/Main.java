package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int size = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        AbstractFigure[] figures = new AbstractFigure[size];

        for (int i = 0; i < size / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = size / 2; i < size; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (AbstractFigure figure : figures) {
            figure.draw();
        }
    }
}
