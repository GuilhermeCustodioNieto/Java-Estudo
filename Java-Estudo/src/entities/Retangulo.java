package entities;

public class Retangulo {
	public double height, widht;
	
	public double area() {
		return height * widht;
	}
	public double perimeter() {
		return (height + widht) * 2;
	}
	public double diagonal() {
		return Math.sqrt((height*height) + (widht*widht));
		
	}

}
