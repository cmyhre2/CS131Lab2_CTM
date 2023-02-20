/*
 * This class represents a wizard for a D&D type game.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-131 Module 2 Lab)
 * Spring 2023
 */
public class Wizard implements Lockable{
	private String name;//String variable for a wizard's name
	private int health;//int variable for a wizard's health
	private int key;//int variable for a wizard's key
	private boolean locked;//boolean variable to track if the wizard's health is locked or unlocked
	
	
	/*
	 * Creates a default Wizard object with empty fields
	 */
	public Wizard() {
		name = "";
		health = 0;
		key = 0;
		locked = false;
	}//end default Wizard() constructor
	
	
	/*
	 * Creates a Wizard object with a set name
	 */
	public Wizard(String name) {
		this.name=name;
		health=20;
		key=0;
		locked=false;
	}//end preferred Wizard() constructor
	
	
	/*
	 * This method decreaes a wizard's health by power if the wizard isn't locked
	 */
	public void takeDamage(int power) {
		if(isLocked() == false) {
			health=health-power;
			System.out.println("You've been hit! -" + power + " health. New Health: " + health);
		}
		else 
			System.out.println("Damage prevented, protection spell is currently active!");
	}//end takeDamage()
	
	
	/*
	 * 
	 */
	public boolean isLocked(){
		return locked;
	}//end isLocked
	
	
	/*
	 * This method grants the protection spell and locks a Wizard object's 
	 * health from taking damage if the correct key is passed in.
	 * @param key
	 */
	public void lock(int key) {
		if(this.key==key) {
		locked=true;
		System.out.println("Protection spell now active!");
		}
	}//end lock()
	
	
	/*
	 * This method lifts the protection spell and unlocks a Wizard object's 
	 * health to now take damage if the correct key is passed in.
	 * @param key
	 */
	public void unlock(int key) {
		if(this.key==key) {
		locked=false;
		System.out.println("Protection spell no longer active!");
		}
	}//end unlock()
	
	
	/**
	 * Setter for key
	 * @param key
	 */
	public void setKey(int key) {
		if(this.key==0) {
			this.key=key;
			System.out.println("Protection spell key has now been set.");
		}
		else {
			System.out.println("Error: Key has already been set.");
		}
	}//end setKey()
	
	
	/**
	 * Getter for the key
	 * @return key
	 */
	public int getKey() {
		return key;
	}//end getKey()
	
	
	/**
	 * Getter for health
	 * @return health
	 */
	public int getHealth() {
		return health;
	}//end getHealth()
	
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health=health;
	}//end setHealth()
	
	
	/**
	 * Getter for name
	 * @return name
	 */
	public String getName() {
		return name;
	}//end getName()


	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName()
}//end Wizard class()