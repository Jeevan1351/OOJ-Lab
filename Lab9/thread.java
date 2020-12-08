class Thread1 implements Runnable
{
    String name;
    Thread t;
	int n;
    int time;
    Thread1(String threadname,int time, int ni)
	{
    	name = threadname;
    	this.time=time;
		n = ni;
    	t = new Thread(this, name);
    	System.out.println("thread:"+ t);
    	t.start();
    }
    public void run() {
    	try
		{
    		for(int i = n; i > 0; i--)
			{
    		System.out.println(name);
    		Thread.sleep(time);
    		}
    	}
		catch (InterruptedException e)
		{
    		System.out.println(name + "Interrupted");
    	}
    	System.out.println(name + " exiting.");
    }
}
class thread
{
    public static void main(String args[])
	{
		Thread1 t1=new Thread1("BMS college of engineering!",10000, 3);
		Thread1 t2=new Thread1("CSE",2000, 15);
    }
}
