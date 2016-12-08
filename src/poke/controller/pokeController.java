package poke.controller;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import poke.model.*;
import poke.view.PokemonFrame;

public class pokeController
{
	private ArrayList<Pokemon> pokedex;
	private PokemonFrame baseFrame;
	
	public void PokeController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
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
		return pokedex;
	}
	
	public PokemonFrame getBaseFrame()
	{
		return baseFrame;
	}
}
