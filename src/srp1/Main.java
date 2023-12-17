package srp1;

import srp1.figure.*;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
       CalculableArea area = shape -> {
           Square square1 = (Square) shape;
           return square1.getSide()*square1.getSide();
       };
        System.out.printf("Square area: %s \n",area.getArea(square));
        Painteble<Square> painteble = new SqurePainter();
        painteble.draw(square);
    }
}
