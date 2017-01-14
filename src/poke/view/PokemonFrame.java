package poke.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import poke.controller.pokeController;

public class PokemonFrame extends JFrame {
	
	private pokeController baseController;
	private PokemonPanel panel;

	public PokemonFrame(pokeController baseController){
		super();
		this.baseController = baseController;
		this.panel = new PokemonPanel(baseController);
		
		this.setupFrame();
	}
	
	
	private void setupFrame()
	{
		super.setContentPane(panel);
		super.setTitle("POKEMON");
		super.setSize(new Dimension(900, 600));
		super.setVisible(true);
		super.setLocationRelativeTo(null);
		super.setMinimumSize(new Dimension(600,450));
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public PokemonPanel getPanel()
	{
		return this.panel;
	}
}