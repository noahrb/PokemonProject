package poke.model.pokemon;

import poke.model.Pokemon;
import poke.model.types.Electric;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu(String name)
	{
		super(10, 20, 3, "Pikachu", 25);
	}

	@Override
	public void thunderbolt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void spark() {
		// TODO Auto-generated method stub
		
	}
}
