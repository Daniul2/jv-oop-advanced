package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES = 5;
    private static final double MAX_SIZE = 20.0;
    private static final double MIN_SIZE = 1.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_TYPES);
        String color = colorSupplier.getRandomColor();
        switch (type) {
            case 0:
                return new Square(
                        color,
                        MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE)
                );
            case 1:
                return new Rectangle(
                        color,
                        MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE),
                        MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE)
                );
            case 2:
                return new RightTriangle(
                        color,
                        MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE),
                        MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE)
                );
            case 3:
                return new Circle(
                        color,
                        MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE)
                );
            case 4:
                return new IsoscelesTrapezoid(
                        color,
                        MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE),
                        MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE),
                        MIN_SIZE + random.nextDouble() * (MAX_SIZE - MIN_SIZE)
                );
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
