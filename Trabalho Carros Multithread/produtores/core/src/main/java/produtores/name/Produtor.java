package produtores.name;

public class Produtor extends Thread {

	private int ID;
	private int Tier;
	private Armazem armazem;
	public Boolean TurnedOn = true;
	public Produtor(int IDRecebido, int TierRecebido, Armazem armazemRecebido)
	{
		this.ID = IDRecebido;
		this.Tier= TierRecebido;
		this.armazem = armazemRecebido;		
	}
	
	
	
	public void run()
	{
		while(TurnedOn)
		{
			switch(Tier)
			{
				case 1:
					
					System.out.println("O produtor: "+ID+" Produziu");
					armazem.AdicionaItem(ID, Tier, 1);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					
				break;
				
				
				
				case 2:
					
					
				break;
				
				
				case 3:
					
					
					
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int GetID()
	{
		System.out.println(this.ID);
		return this.ID;
	}
	public int GetTier()
	{
		System.out.println("O tier do produtor [ "+ID+" ] é : " +Tier );
		return this.Tier;
	}
	
	
}
