package exercise3;

public class Exercise3 {
	static ConvexPolygon buildConvexPolygon(Point[] vertices) {
		ConvexPolygon convexPolygon = new ConvexPolygon(vertices);
		System.out.println("polygone : perimetre = "+ convexPolygon.perimeter() + " aire = " + convexPolygon.area());
		return convexPolygon;
		//return null;
	}

	static ConvexPolygon buildRectangle(Point upperLeft, Point lowerRight) {
		Rectangle rectangle = new Rectangle(upperLeft, lowerRight);
		System.out.println("rectangle : perimetre = "+ rectangle.perimeter() + " aire = " + rectangle.area());
		return  rectangle;
		//return null;
	}

	static ConvexPolygon buildSquare(Point upperLeft, int sideLength) {
		Square square = new Square(upperLeft, sideLength);
		System.out.println("carré : perimetre = "+ square.perimeter() + " aire = " + square.area());
		return square;
		//return null;
	}

	static Ellipsis buildEllipsis(Point center, int xAxisLength, int yAxisLength) {
		Ellipsis ellipsis = new Ellipsis(center, xAxisLength, yAxisLength);
		System.out.println("ellipse : perimetre = "+ ellipsis.perimeter() + " aire = " + ellipsis.area());
		return ellipsis;
		//return null;
	}

	static Ellipsis buildCircle(Point center, int radius) {
		Circle circle = new Circle(center, radius);
		System.out.println("cercle : perimetre = "+ circle.perimeter() + " aire = " + circle.area());
		return circle;
		//return null;
	}

	static double computePerimeter(ConvexPolygon convexPolygon) {
		return convexPolygon.perimeter();
	}

	static double computeArea(ConvexPolygon convexPolygon) {
		return convexPolygon.area();
	}

	static double computePerimeter(Ellipsis ellipsis) {
		return ellipsis.perimeter();
	}

	static double computeArea(Ellipsis ellipsis) {
		return ellipsis.area();
	}
}
