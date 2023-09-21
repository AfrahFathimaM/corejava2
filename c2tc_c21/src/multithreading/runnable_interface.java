package multithreading;

public class runnable_interface implements Runnable{
public void run() {
	System.out.println("inside run function");
	for(int i=0; i<3; i++)
	{
		System.out.println(i + "from Thread ");
	}
}
public void main(String [] args) {
	runnable_interface t1=new runnable_interface();
	Thread t=new Thread(t1);
	t.start();
	for(int i=0; i<3; i++)
	{
		System.out.println(i + "from Main" + t.getName());
	}
}
}
