package poke.controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import poke.model.*;
import poke.model.pokemon.Geodude;
import poke.model.pokemon.Pikachu;
import poke.model.pokemon.Raichu;
import poke.model.pokemon.Squirtle;
import poke.model.pokemon.Wartortle;
import poke.view.PokemonFrame;

public class pokeController
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	
	public void PokeController()
	{
		this.pokedex = new ArrayList<Pokemon>();
		this.buildPokedex();
		
		baseFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Welcome to Pokemon Inheritance");
	}
	
	public void buildPokedex()
	{
		 pokedex.add(new Geodude("datboi"));
		 pokedex.add(new Pikachu("doge"));
		 pokedex.add(new Pikachu("bark"));
		 pokedex.add(new Squirtle("memeMan"));
		 pokedex.add(new Wartortle("KnocksEmDead"));
		 pokedex.add(new Raichu("memeMan"));
	}
	
	public String[] buildPokedexText()
	{
		String [] pokemonNames = new String[pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		
		return pokemonNames;
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setSpeed(speed);
		current.setHealthPoints(health);
	}
	
	public ArrayList<Pokemon> getPokedex()
	{
		return this.pokedex;
	}
	
	public PokemonFrame getBaseFrame()
	{
		return this.baseFrame;
	}
}
