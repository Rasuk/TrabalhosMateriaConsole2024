package produtores.name;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.ScreenUtils;

public class Consumidor extends Thread {
public int ID;
public Armazem Armazem;
public boolean TurnedOn = true;
public Texture ConsumerTexture;
public Sprite sprite;
public float posX,posY;
	public Consumidor(int IDRecebido, Armazem armazemRecebido)
	{
		this.ID = IDRecebido;
		this.Armazem = armazemRecebido;
		ConsumerTexture = new Texture("Loona.png");
		sprite = new Sprite(ConsumerTexture);
		posX=0; 
		posY=0;
	}
	
	public void run()
	{
			
		while(TurnedOn)
		{
			
			
		
			if(posX>=500)
			{
				Armazem.RemoveItem(this.ID);
			}
		MoveConsumidor();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void MoveConsumidor()
	{
		
		
		
			posX+=10.4f+2*0.5f;
		
		
		
		
	}
	
	
	
}
