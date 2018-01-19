import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;

public class Player {
	public Player() {}

	public int playerXLocation = 1;
	public int playerYLocation = 1;
	
	
	 public ImageView playerUnit = new ImageView();   
     public Image playerImage = new Image(getClass().getResourceAsStream("images/player.png"));
     
	public void createPlayer() {
		playerUnit.setImage(playerImage);
		playerUnit.relocate(playerXLocation, playerYLocation);
	
		
		
		
		
		
		
	}
	
	
	
	
	
}
