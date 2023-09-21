package multithreading;

public class extending_threadclass extends Thread {
public void run() {
	System.out.println("run method is implemented and the thread has started it's execution");
}
public static void main(String [] args) {
	extending_threadclass t1=new extending_threadclass();
	t1.start();//start method created t1 and the thread began it's execution
	System.out.println("start method has been called in main function");
	
}
}
