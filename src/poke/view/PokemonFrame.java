package poke.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import poke.controller.pokeController;

public class PokemonFrame extends JFrame
{
	private pokeController baseController;
	private PokemonPanel appPanel;
	
	public PokemonFrame(pokeController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new PokemonPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("POKEMON");
		this.setSize(new Dimension(900, 600));
		this.setVisible(true);
	}
}