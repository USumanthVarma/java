package ciet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable{
	private String taskName;
	MyTask(String taskName) {
		this.taskName=taskName;
	}
	public void run() {
		System.out.println(taskName + " " + Thread.currentThread().getName());
	try {
		Thread .sleep(3000);
	}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		}
	}
class cai{
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2); 
		executor.execute(new MyTask("Task 1"));
		executor.execute(new MyTask("Task 2"));
		executor.execute(new MyTask("Task 3"));
		executor.execute(new MyTask("Task 4"));
		executor.execute(new MyTask("Task 5"));
	}
}