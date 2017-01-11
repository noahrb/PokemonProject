package poke.model.pokemon;
import poke.model.Pokemon;
import poke.model.types.Rock;

public class Geodude extends Pokemon implements Rock
{
	
	public Geodude(String name)
	{
		super(7, 25, 2, "Geodude", 74);
	}

	@Override
	public void rockSmash() 
	{
		
	}

}
