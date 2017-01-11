package poke.model.pokemon;

import poke.model.Pokemon;
import poke.model.types.Electric;

public class Raichu extends Pokemon implements Electric
{
	public Raichu()
	{
		super(15, 25, 4, "Raichu", 26);
	}
		
	public int staticZap()
	{
		return 50;
	}
	
	public int thunder()
	{
		return this.getAttackPoints() * 15;
	}

	@Override
	public void spark() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void thunderbolt() {
		// TODO Auto-generated method stub
		
	}
}
