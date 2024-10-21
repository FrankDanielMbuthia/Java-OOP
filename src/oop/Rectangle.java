package oop;
//Rectangle r1=new Rectangle(2,4)
public class Rectangle {
	private double width;
	private double height;
	
	Rectangle(){
		this(1.0,1.0);
	}
	
	Rectangle(double width, double height){
		this.setHeight(height);
		this.setWidth(width);
	}
	
	public double getArea() {
		if(this.height>0 && this.width>0) {                          
			return (height*width);
		}
		else {
			System.out.println("Invalid values");
			return 0;
		}
	}
	
	public double getPerimeter() {
		if(height>0 && width>0) {
			return ((height+width)*2);
		}
		else {
			System.out.println("Invalid values");
			return 0;
		}
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width>0) {
			this.width=width;	
		}
		else {
			System.out.println("Invalid. Width reset to zero");
			this.width=1.0;
		}
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height>0) {
			this.height=height;	
		}
		else {
			System.out.println("Invalid. Height reset to zero");
			this.height=1.0;
		}
	}
	
}
