/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package net.putfirstthingsfirst.extends_threading;

public class Start {
	public String getGreeting() {
		return "Hello world.";
	}

	public static void main(String[] args) {

		System.out.println("Start Thread A");
		TaskThread task1 = new TaskThread("Thread A");
		task1.start();
		
		System.out.println("Start Thread B");
		
		TaskThread task2 = new TaskThread("Thread B");
		task2.start();
	}
}