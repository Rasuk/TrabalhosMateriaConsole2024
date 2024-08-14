
public class Carros extends Thread{
	public int ID;
	public int DistanciaParaPercorrer;
	public int DistanciaAtual = 0;
	public int DistanciaPercorrida;
	int somadist;
	public Carros(int i,int DistanciaRecebida) 
	{
		this.ID = i;
		this.DistanciaParaPercorrer = DistanciaRecebida;
		
	}
	
	public void run()
	{
		while(DistanciaAtual < DistanciaParaPercorrer)
		{
			int ultimaDistanciaRecebida =DistanciaAtual;
			this.DistanciaAtual += VelocidadeCarro();
			
			int DistanciaPercorrida = DistanciaAtual -ultimaDistanciaRecebida;
			somadist += DistanciaPercorrida;
			
			System.out.println("O carro " + ID + " Andou " + DistanciaPercorrida+ " e percorreu "+ somadist );
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(DistanciaAtual >=DistanciaParaPercorrer)
			{
				System.out.println("O carro " + ID+ " Chegou na linha de chegada!!!");
			}
		}
		
	}
	
	
	private int VelocidadeCarro()
	{
		return(int) (Math.random()*15+1);
	}
	
	
	
	
}
