//a file contains two classes emp; were when we storing one object data into another by "e3 = e1;" 
// we are transferring the reference unlike in C++ copying the ones data to other     
class emp
{
	private String name;
	private int age;
	private double bs;

	public void setdata(String n,int a,double b)
	{
		name = n;
		age = a;
		bs = b;
	}
	public void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Basic Salary : " + bs);
	}
}
class pin4
{
	public static void main(String args[])
	{
		emp e1 = new emp();
		emp e2 = new emp();
		e1.setdata("Ramesh",44,567893);
		e2.setdata("Ganesh",44,765433);
		e1.display();
		e2.display();
		emp e3;
		e3 = e1;/*In C++,name,age,bs of e1 is copied into name,age,bs of e3. In java,
		address or reference stored in e1 is copied into e3*/
		e3.display();
		e3.setdata("Suresh", 34, 876544);
		e3.display();
		e1.display();

	}
}