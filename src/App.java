public class App {
    public static void main(String[] args) {
        Square square = new Square(5, 25, 20);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());

        square.setSide(10);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircuit());
    }
}
