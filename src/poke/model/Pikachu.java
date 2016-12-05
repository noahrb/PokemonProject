package poke.model;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu()
	{
		super("Pikechu", 25);
	}
	
	public Pikachu(String name)
	{
		super(name, 25);
	}
}
