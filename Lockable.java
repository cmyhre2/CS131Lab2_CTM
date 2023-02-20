/*
 * This interface of methods that should be made for any class implements them.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 2 Lab)
 * Spring 2023
 */
public interface Lockable {
	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean isLocked();
}//end Lockable interface
