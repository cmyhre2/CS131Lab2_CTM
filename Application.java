/*
 * This class tests the Wizard cass & implemented methods from Lockable.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 2 Lab)
 * Spring 2023
 */
public class Application extends Wizard{
	public static void main(String[]args) {
		/*
		 * Wizard class and implemented methods from Lockable put to the test.
		 */
		Wizard harry = new Wizard();
		harry.setName("Harry");
		System.out.println("Name: " + harry.getName());
		harry.setHealth(20);
		System.out.println("Health: " + harry.getHealth());
		harry.setKey(5);
		System.out.println("Key: " + harry.getKey());
		System.out.println("Protection spell is active: " + harry.isLocked());
		harry.lock(5);
		harry.takeDamage(5);
		harry.unlock(5);
		harry.takeDamage(5);
		
		
		/*
		 * Preferred Wizard() constructor put to the test and prints its stats
		 */
		System.out.println();
		System.out.println();
		Wizard harry1 = new Wizard("Harry1");
		System.out.println("Name: " + harry1.getName());
		System.out.println("Health: " + harry1.getHealth());
		System.out.println("Key: " + harry1.getKey());
		System.out.println("Protection spell is active: " + harry1.isLocked());
	}//end main() method
}//end Application class