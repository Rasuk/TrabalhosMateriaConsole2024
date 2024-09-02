package produtores.name;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.g2d.Sprite;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;
    private Texture loonie;
    private Texture kitty;
    private Sprite sprite;
    public Produtor produtor,produtor2,produtor3,produtor4,produtor5,produtor6;
    public Consumidor[]Consumidores = new Consumidor[4];
    float posx, posy;
    Armazem armazem = new Armazem(this.Consumidores);  
 


    boolean v = true;
    @Override
    public void create() {
        batch = new SpriteBatch();
        posx = 0;
        posy= 0;
        loonie = new Texture("loona.png");
        kitty = new Texture("kitty.png");
        sprite = new Sprite(kitty);
        
        produtor = new Produtor(1,armazem);
        produtor2 = new Produtor(2,armazem);
        for(int i =0;i<3;i++)
        {
        	Consumidores[i] = new Consumidor(i,armazem);
        	Consumidores[i].start();
        }
      
      //  produtor3=new Produtor(3,1,armazem);
      //  produtor4 = new Produtor(4,1,armazem);
       // produtor5 = new Produtor(5,1,armazem);
       // produtor6=new Produtor(6,1,armazem);
        produtor.start();
        produtor2.start();
       
      //  produtor3.start();
      //  produtor4.start();
      //  produtor5.start();
      //  produtor6.start();
       
        //image = new Texture("libgdx.png");
        image = new Texture("bg.png");
        
    }

    @Override
    public void render() {
    	
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        
        batch.begin();
        batch.draw(image, 0, 0,1280,720);  
       for(int i = 0; i<3; i++)
       {
    	  batch.draw(Consumidores[i].sprite,Consumidores[i].posX, Consumidores[i].posY,120,120);
    	//Consumidores[i].MoveConsumidor();
       } 

        batch.draw(sprite,posx,posy,100,100); 
        
        
        
   
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
    
    public void moveloona()
    {
    	
    		posx+=0.7f;
    		    	
    }
}
