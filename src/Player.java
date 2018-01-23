import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Player {
	public Player(int spawnX, int spawnY ) {
		playerXLocation = spawnX;
		playerYLocation = spawnY;
	}

	public int playerXLocation = 10;
	public int playerYLocation = 10;
	
	
	 public ImageView playerUnit = new ImageView();   
     public Image playerImage = new Image(getClass().getResourceAsStream("images/player.png"));
     
	public void createPlayer() {
		playerUnit.setImage(playerImage);
		playerUnit.relocate( IndexToPixel.indexToPixelX(playerXLocation,  playerYLocation),IndexToPixel.indexToPixelY(playerXLocation,  playerYLocation));
//		playerUnit.isResizable();
		playerUnit.setFitWidth(Game.currentWindowHeight/10);
		playerUnit.setFitHeight(Game.currentWindowHeight/10);
	}
	
	
	
	
	
}
