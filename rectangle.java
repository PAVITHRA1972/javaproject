package javabasics;

public class rectangle extends shape{
	int l1;
	int b;
	int h;
	 rectangle(int l,int b,int h,String colour){
		super(colour);
		this.l1=l;
		this.h=h;
		this.b=b;
	}
	public void calcArea() {
		int area=l1*b*h;
		System.out.println("Area of Rectangle:"+area+" "+"colour: "+colour);
	}
}
