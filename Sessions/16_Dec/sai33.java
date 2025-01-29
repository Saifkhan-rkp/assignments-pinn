class sai33
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		System.out.println( t );
		t.setName("ABCD");
		System.out.println( t );
		int i;
		for(i = 1 ;  i <= 10 ; i++)
		{
			System.out.println( i );
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}

		}
		System.out.println("Exiting main()");
	}
}