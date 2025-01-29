class sample38 implements Runnable
{
	Thread t;
	private String name;
	public sample38(String n)
	{
		t = new Thread(this);
		t.start();
		name = n;
		System.out.println( t.threadId() );
	}
	public void run()
	{
		int i;
		System.out.println("Entering the function fn" + t.threadId());
		for(i = 1 ; i <= 10 ; i++)
		{
			System.out.println( "Function fn I of : " + t.threadId() +  name + " = " + i  );
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
		System.out.println("Exiting the function fn");
	}
}
class pin38
{
	public static void main(String args[])
	{
		System.out.println("Entering the main() function");
		sample38 s1 = new sample38("ONE");
		sample38 s2 = new sample38("TWO");
		sample38 s3 = new sample38("THREE");
		sample38 s4 = new sample38("FOUR");
        System.out.println(s1.t.isAlive());
        // once thread is executed it status become false(dead) or it cannnot be revised
		try
		{
			s1.t.join();
			s2.t.join();
			s3.t.join();
			s4.t.join();
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("Exiting the main() function");
	}
}
