import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Enemy {
	public Enemy(int spawnX, int spawnY ) {
		enemyXLocation = spawnX;
		enemyYLocation = spawnY;
		
	}

		public int enemyXLocation = 10;
		public int enemyYLocation = 10;
		
		
		 public ImageView enemyUnit = new ImageView();   
	     public Image enemyImage = new Image(getClass().getResourceAsStream("images/enemy.png"));
	     
		public void createEnemy() {
			enemyUnit.setImage(enemyImage);
			enemyUnit.relocate( IndexToPixel.indexToPixelX(enemyXLocation,  enemyYLocation),IndexToPixel.indexToPixelY(enemyXLocation,  enemyYLocation) - 32);
			enemyUnit.setFitWidth(Game.currentWindowHeight/10);
			enemyUnit.setFitHeight(Game.currentWindowHeight/10);
			
			
			
			
			
			
		}
		
		
		
		
		
	}
