package produtores.name;

import java.util.Random;

public class Produtor extends Thread {
public int ID;
public int Tier;
public Armazem armazem;
public boolean TurnedOn = true;
public Random random;

public Produtor(int IDRecebido, Armazem ArmazemRecebido) 
{
	
this.ID = IDRecebido;
this.armazem = ArmazemRecebido;
random = new Random();

}
	
public void run()
{
	while(TurnedOn)
	{ 
		System.out.println("O produtor:"+this.ID+ " Produziu");
		int producao = random.nextInt(10);
		armazem.AddItem(this.ID, producao);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
	
}
