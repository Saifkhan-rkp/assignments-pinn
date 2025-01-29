class sample36 implements Runnable
{
	Thread t;
	public sample36()
	{
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		int i;
		System.out.println("Entering the function fn");
		for(i = 1 ; i <= 10 ; i++)
		{
			System.out.println( "Function fn I = " + i );
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
class pin36
{
	public static void main(String args[])
	{
		System.out.println("Entering the main() function");
		new sample36();
		int i;
		for(i = 1 ; i <= 10 ; i++)
				{
					System.out.println( "Main function I = " + i );
					try
					{
						Thread.sleep(1000);
					}
					catch(InterruptedException e)
					{
					}
		}

		System.out.println("Exiting the main() function");
	}
}