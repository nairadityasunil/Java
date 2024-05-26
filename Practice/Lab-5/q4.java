class Account
{
	String cust_name,act_type,branch;
	Integer acno;
	void getCustInfo(String cname,String acttype,String b,Integer ano)
	{
		this.cust_name = cname;
		this.act_type = acttype;
		this.branch = b;
		this.acno = ano;
	}
	void displayInfo()
	{
		System.out.println("Customer Name : " + cust_name);
		System.out.println("Account Number : " + acno);
		System.out.println("Account Type : " + act_type);
		System.out.println("Branch Name : " + branch);
	}
}
class Savings extends Account
{
	double amount,rate,year,cal_interest;
	void getSavingInfo(double amt,double y)
	{
		this.rate = 3.5;
		this.amount = amt;
		this.year = y;
	}
	void calIntAmt()
	{
		cal_interest = (amount*rate*year)/100;
	}
	void displayInfo()
	{
		super.displayInfo();
		System.out.println("Amount for Savings : " + amount);
		System.out.println("Rate for Savings : " + rate);
		System.out.println("Year for Savings : " + year);
		System.out.println("Interst for Savings : " + cal_interest);
	}
}
class FixedDeposite extends Account
{
	double amount,year,cal_fix_interest,rate;
	void getFDInfo(Integer amt,Integer y)
	{
		this.amount = amt;
		this.year = y;
		if(year<=2)
			this.rate = 6.5;
		else if(year>2 && year<=5)
			this.rate = 7.5;
		else if(year>5 && year<=10)
			this.rate = 8;
		else if(year>10)
			this.rate = 9;
	}
	void calIntAmt()
	{
		cal_fix_interest = (amount*rate*year)/100;
	}
	void displayInfo()
	{
		super.displayInfo();
		System.out.println("Amount for Fixed Deposite : " + amount);
		System.out.println("Rate for Fixed Deposite : " + rate);
		System.out.println("Year for Fixed Deposite : " + year);
		System.out.println("Interest for Fixed Deposite : " + cal_fix_interest);
	}
}
class q4
{
	public static void main(String[] args)
	{
		Savings s1 = new Savings();
		FixedDeposite f1 = new FixedDeposite();
		s1.getCustInfo("Maharshi_Prajapati_","Saving","Umreth",20002561);
		s1.getSavingInfo(200000,2);
		s1.calIntAmt();
		s1.displayInfo();
		f1.getCustInfo("Jainil_Patel_","Current","Karamsad",20001411);
		f1.getFDInfo(400000,6);
		f1.calIntAmt();
		f1.displayInfo();
	}
}
