import java.util.Random;

class FigSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Shape getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Square(color, 1 + random.nextDouble() * 10);
            case 1:
                return new Rectangle(color, 1 + random.nextDouble() * 10, 1 + random.nextDouble() * 10);
            case 2:
                return new RightTriangle(color, 1 + random.nextDouble() * 10, 1 + random.nextDouble() * 10);
            case 3:
                return new Circle(color, 1 + random.nextDouble() * 10);
            case 4:
                return new IsoscelesTrapezoid(color, 1 + random.nextDouble() * 10, 1 + random.nextDouble() * 10, 1 + random.nextDouble() * 10);
            default:
                return getDefaultFigure();
        }
    }
        public Shape getDefaultFigure() {
            return new Circle("White", 10);
    }
}