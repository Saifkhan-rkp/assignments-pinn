class sender
{
	public synchronized void send(String msg)
	{
        // synchronized(this){
            System.out.print("[ " +  msg  );
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
            }
            System.out.println( " " + msg + " ] ");
        // }
	}
}
class sample39 implements Runnable
{
	private String message;
	private sender s;

	public sample39(String msg,sender sobj)
	{
		message = msg;
		s = sobj;
	}
	public void run()
	{
        // synchronized(s);
		s.send(message);
	}
}
class pin39
{
	public static void main(String args[])
	{
		sender s = new sender();
		sample39 ss1 = new sample39("Nagpur",s);
		sample39 ss2 = new sample39("Pune",s);
		sample39 ss3 = new sample39("Ahmedabad",s);
		Thread t1 = new Thread( ss1 );
		Thread t2 = new Thread( ss2 );
		Thread t3 = new Thread( ss3 );
		t1.start();
		t2.start();
		t3.start();
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e)
		{
		}

	}
}