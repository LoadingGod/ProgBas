package opdrachten;

public class Rectangle {

	public int x;
	public int y;
	public int height;
	public int width;

	public int getArea() {
		return height * width;
	}

	public int getPerimeter() {
		return (width + height) * 2;
	}

	public void grow(int h, int w) {
		this.height += h;
		this.width += w;
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
