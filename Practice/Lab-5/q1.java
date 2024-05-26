class Items
{
	String i_name;
	Integer price;
	Items()
	{
		this.i_name = null;
		this.price = 0;
	}
	Items(String nm,Integer p)
	{
		i_name = nm;
		price = p;
	}
	void display()
	{
		System.out.println("Item Name : " + i_name);
		System.out.println("Item Price : " + price);
	}
}
class Orders extends Items
{
	Integer no_of_units;
	Orders()
	{
		super();
		this.no_of_units = 0;
	}
	Orders(String nm, Integer p,Integer unit)
	{
		super(nm,p);
		no_of_units = unit;
	}
	Integer getUnit()
	{
		return no_of_units;
	}
	void cal_price()
	{
		System.out.println("The Total Price : "+(no_of_units*price));
	}
}
class q1
{
	public static void main(String[] args)
	{
		Items i1 = new Items("I-Phone",1500000);
		i1.display();
		Orders o1 = new Orders("I-Phone",1500000,20);
		o1.display();
		Integer unit = o1.getUnit();
		System.out.println("The Unit is : " + unit);
		o1.cal_price();
	}
}