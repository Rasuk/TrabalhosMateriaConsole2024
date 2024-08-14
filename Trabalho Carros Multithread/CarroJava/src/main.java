
public class main {

	public static void main(String[] args) {
	for(int i = 0; i<10;i++)
	{
		Carros carro = new Carros(i, 500);
		
		carro.start();
	}
		
	}

}
