package poke.model;

public class Geodude extends Pokemon implements Rock
{
	
	public Geodude()
	{
		super(attackPoints, attackPoints, speed, "Geodude", 74);
	}
	
	public Geodude(String name)
	{
		super(attackPoints, attackPoints, speed, name, 74);
	}
}
