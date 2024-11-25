package javabasics;

public class circle extends shape{
	int radius;
	
	circle(int radius,String colour){
		super(colour);
		this.radius=radius;
	}
	public void calcArea() {
		this.area=(int)(Math.PI*radius*radius);
		System.out.println("Area of circle:"+area+" "+"colour: "+colour);
	}
	

}
