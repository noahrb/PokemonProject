package poke.model.pokemon;

import poke.model.Pokemon;
import poke.model.types.Water;

public class Wartortle extends Pokemon implements Water
{
	public Wartortle(String name)
	{
		super(10, 20, 3, "Wartortle", 25);
	}

	@Override
	public void waterThrow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sprinkler() {
		// TODO Auto-generated method stub
		
	}
}