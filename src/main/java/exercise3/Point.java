package exercise3;

public class Point {
	private int x;
	private int y;
	public double distance(Point b){
		return (Math.sqrt(Math.pow(x-b.x,2)+Math.pow(y-b.y,2)));
	}
	public Point(int x, int y) {
		// TODO implement this class internal state and a way to access it.
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public void setX(int a) {x=a;}

	public void setY(int a) {y=a;}
}
