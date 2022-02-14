public class main {
    public static void main(String[] args) {
        Point point = new Point(1,3);
        MoveablePoint moveablePoint = new MoveablePoint(3,6,5,7);
        System.out.println(moveablePoint.move());
    }
}
