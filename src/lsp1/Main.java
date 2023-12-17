package lsp1;

import lsp1.shape.Quadroilateral;
import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,6);
        rectangle.setSideA(3);
        rectangle.setSideB(7);
        Square squre = new Square(7);

        System.out.printf("In a rectangle side A = %d, side B = %d\n",rectangle.getSideA(),rectangle.getSideB() );
        System.out.printf("In a rectangle side A = %d \n",squre.getSide());
        ShapeView view = new ShapeView(rectangle);

        view.showArea();
    }
}
