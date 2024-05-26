class Course
{
	String course_name;
	Integer no_of_semester;
	Course(String cnm,Integer sem)
	{
		course_name = cnm;
		no_of_semester = sem;
	}
	void disp_course()
	{
		System.out.println("Course Name : "+course_name);
	}
}
class Subject extends Course
{
	String sub_name;
	Integer sub_code,max_credit;
	Subject(String subnm,Integer code,Integer credit,String cnm,Integer nosem)
	{
		super(cnm,nosem);
		sub_name = subnm;
		sub_code = code;
		max_credit = credit;
	}
	void setData(String sname,Integer code,Integer credit)
	{
		sub_name = sname;
		sub_code = code;
		max_credit = credit;
	}
	void disp()
	{
		System.out.println("Subject name : "+sub_name);
		System.out.println("Subject Code: "+sub_code);
		System.out.println("Student Credit : "+max_credit);
	}
}
class Student extends Subject
{
	Integer sem;
	String name;
	double per,marks;
	Student(Integer s,double mark,String s_nm,String s_name,Integer s_code,Integer s_credit,String coursename,Integer noofsem)
	{
		super(s_name,s_code,s_credit,coursename,noofsem);
		this.name = s_nm;
		this.sem = s;
		this.marks = mark;
	}
	void cal_per()
	{
		per = (marks/100)*100;
	}
	void disp()
	{
		super.disp();
		System.out.println("Student name : "+name);
		System.out.println("Student Semester : "+sem);
		System.out.println("Student Marks : "+marks);
		System.out.println("Percetange : "+ per);
	}
}
class q3
{
	public static void main(String[] args)
	{
		Student s1 = new Student(2,90,"JAVA","Maharshi",51,4,"MCA",4);
		s1.cal_per();
		s1.disp();
	}
}