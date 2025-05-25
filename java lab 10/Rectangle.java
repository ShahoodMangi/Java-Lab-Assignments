class Rectangle extends Shape implements Printable{
	double area(double length,double width){
		return length*width;
	}

	public void Print(){
		System.out.println("Rectangle is Printable...");
	}
}