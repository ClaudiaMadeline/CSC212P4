package edu.smith.cs.csc212.p4;

public class SecretExit extends Exit
{
	/**
	 * How do we describe this exit to a user, e.g., "A door with a spiderweb."
	 */
	private String description;
	/**
	 * How do we identify the Place that this is going.
	 */
	private String target;
	
	private boolean hidden = true;
	
	/**
	 * Create a new SecretExit.
	 * @param target - where it goes.
	 * @param description - how it looks.
	 */
	public SecretExit(String target, String description) 
	{
		super(description, target);
	}
	
	@Override
	public boolean isSecret()
	{
		return hidden;
	}
	
	@Override
	public void search()
	{
		hidden = false;
	}
}
