package poke.model;

public class Pokemon
{
	private int attackPoints;
	private int healthPoints;
	private double speed;
	private String name;
	private int number;
	
	public Pokemon(int attackPoints, int healthPoints, double speed, 
			String name, int number)
	{
		this.attackPoints = attackPoints;
		this.healthPoints = healthPoints;
		this.speed = speed;
		this.name = name;
		this.number = number;
	}
	
	public String getPokemonTypes()
	{
		String pokemonTypes = "This pokemon has following types:\n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		for(int index = 0; index < types.length; index++)
		{
			String temp = types[index].getCanonicalName();
			
			pokeTypes[index] = temp;
		}
		
		for(String current : pokeTypes)
		{
			String temp = current.replace(this.getClass().getPackage().getName() + ".", "");
			pokemonTypes += temp + "\n";
		}
		
		return pokemonTypes;
	}
	public String toString()
	{
		String myToString = "Pokemon is the best!";

		return myToString;
	}

	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		return pokemonInfo;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public int getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
}
