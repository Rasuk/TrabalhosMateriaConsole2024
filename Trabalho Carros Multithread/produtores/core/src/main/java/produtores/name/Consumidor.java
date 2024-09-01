package produtores.name;

import com.badlogic.gdx.graphics.Texture;

public class Consumidor extends Thread {
public int ID;
public Armazem Armazem;
public boolean TurnedOn = true;
public Texture ConsumerTexture;
	public Consumidor(int IDRecebido, Armazem armazemRecebido)
	{
		this.ID = IDRecebido;
		this.Armazem = armazemRecebido;
	}
	
	public void run()
	{
		while(TurnedOn)
		{
			Armazem.RemoveItem(this.ID);
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
