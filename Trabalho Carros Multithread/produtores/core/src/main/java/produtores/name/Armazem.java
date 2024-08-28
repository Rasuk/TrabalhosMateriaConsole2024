package produtores.name;

import java.util.concurrent.Semaphore;

public class Armazem {
public int Capacidade1=10,Capacidade2=10,Capacidade3=10;

public Semaphore semaphore = new Semaphore(2);







public void AdicionaItem(int IDRecebido,int TierRecebido,int ProducaoRecebida)
{
	try {
		semaphore.acquire();
		if(TierRecebido==1)
		{
			Capacidade1-=ProducaoRecebida;
			System.out.println("O produtor: "+IDRecebido+" depositou: "+ ProducaoRecebida+"! Agora o espaço de armazenamento de material Tier 1 é igual à"+Capacidade1 );
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		semaphore.release();
	}
	
	
	
	
	
}























}