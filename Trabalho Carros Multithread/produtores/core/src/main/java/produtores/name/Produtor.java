package produtores.name;

import java.util.Random;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Produtor extends Thread {
public int ID;
public int Tier;
public Armazem armazem;
public boolean TurnedOn = true;
public Random random;
public Texture ProdutorTexture;
public Sprite ProdutorSprite;
public float posX,posY;
public float speed;
public Produtor(int IDRecebido, Armazem ArmazemRecebido) 
{
	
this.ID = IDRecebido;
this.armazem = ArmazemRecebido;
random = new Random();
speed = random.nextFloat(2.0f);
ProdutorTexture = new Texture("kitty.png");
ProdutorSprite = new Sprite(ProdutorTexture);
posX= 750;
posY= 10;
}
	
public void run()
{
	while(TurnedOn)
	{ 
		System.out.println("O produtor:"+this.ID+ " Produziu");
		int producao = random.nextInt(10);
		armazem.AddItem(this.ID, producao);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
	public void MoveProdutor()
	{
		
	}
}
