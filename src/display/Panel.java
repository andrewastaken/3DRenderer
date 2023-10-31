package display;

import javax.swing.JPanel;

public class Panel extends JPanel implements Runnable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final int WIDTH = 800;
	private final int HEIGHT = 600;
	
	public Panel()
	{
		
	}

	@Override
	public void run() 
	{
		long last = System.nanoTime( );
		long timer = System.currentTimeMillis( );
		final double ns = 1000000000.0 / 60;
		double delta = 0;

		while(true)
		{
			long now = System.nanoTime( );
			delta += (now - lastTime) / ns;
			lastTime = now;
			
			while(delta >= 1)
			{
				update();
				delta--;
				render();
			}	
	}
}
