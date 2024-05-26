class Shape
{
	double area()
	{
		System.out.println("Calling Shape area method.");
		return 0;
	}
	void disp()
	{
		System.out.println("Inside the shape class.");
	}
}
class Circle extends Shape
{
	double radius;
	Circle(double rad)
	{
		radius = rad;
	}
	double area()
	{
		return (3.14*radius*radius);
	}
	void disp()
	{
		System.out.println("Circle Radius : " + radius);
	}
}
class Rectangle extends Shape
{
	Integer len,width,height;
	Rectangle(Integer l,Integer w,Integer h)
	{
		this.len = l;
		this.width = w;
		this.height = h;
	}
	double area()
	{
		return len*width*height;
	}
	void disp()
	{
		System.out.println("Recatnagle Height : " + height);
		System.out.println("Recatnagle Width : " + width);
		System.out.println("Recatnagle Length : " + len);
	}
}
class q2
{
	public static void main(String[] args)
	{
		Shape s = new Shape();
		s.area();
		s.disp();

		Circle c = new Circle(8);
		c.disp();
		double area = c.area();
		System.out.println("The Area Of Cirlce : " + area);

		Rectangle r = new Rectangle(8,9,10);
		r.disp();
		double rect_area = r.area();
		System.out.println("The Area Of Rectangle : " + rect_area);
	}
}