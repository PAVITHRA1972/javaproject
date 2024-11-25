package javabasics;

public abstract class shape {
	String colour;
	int area;
    shape(String colour){
    	this.colour=colour;
    }
    abstract void calcArea();
    
    public void setOutercolour(String colour) {
    	
    }
    
	public static void main(String[] args) {
		circle c=new circle(8,"blue");
		c.calcArea();
		rectangle r=new rectangle(10,10,10,"black");
		r.calcArea();
		
		
		
	}
	
	

}
