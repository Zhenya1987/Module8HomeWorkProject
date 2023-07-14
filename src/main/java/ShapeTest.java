public class ShapeTest {

    public static void main(String[] args) {

        new ShapePrinter().printName(new Circle());
        new ShapePrinter().printName(new Parallelogram());
        new ShapePrinter().printName(new Quad());
        new ShapePrinter().printName(new Rectangle());
        new ShapePrinter().printName(new Triangle());
    }
}
