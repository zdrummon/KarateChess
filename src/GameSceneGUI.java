//this class populates the main game screen
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
public class GameSceneGUI {
	public GameSceneGUI() {}

	public static Pane gameSceneLayout = new Pane();
	public Scene gameScene = new Scene(gameSceneLayout, 21*24 +10 , 21*26+ 15);	
	
	private int playerSpawnX = 1;
	private int playerSpawnY = 1;
	
	private int enemySpawnX = 20;
	private int enemySpawnY = 20;
		
//	public ToggleButton cueBallButton = new ToggleButton(Game.windowWidth / 2 - 15, Game.windowHeight / 2 - 240, "images/cueball.png", ballID++);
	public Player player = new Player(playerSpawnX,playerSpawnY);
	public Enemy enemy = new Enemy(enemySpawnX,enemySpawnY);
	private GameMap gameMap = new GameMap();
	
	public void populateGameScene() {	
		EventLog.logEvent("populate game scene");
		
//		cueBallButton.generateToggleButton();			
		gameSceneLayout.setStyle("-fx-background-color: #002266");
		
		
			gameMap.drawMap();
		
		
		player.createPlayer();
		controlPlaya();
		enemy.createEnemy();
		
		gameSceneLayout.getChildren().addAll(player.playerUnit, enemy.enemyUnit);
	}
	
	

	    

	   
	
	
	
	
	public void controlPlaya() {
	gameScene.setOnKeyPressed( ae -> {
		 if (ae.getCode() == KeyCode.Q ) {
	        EventLog.logEvent("Q key was pressed");
	        player.playerYLocation =  player.playerYLocation - 1 * ( player.playerXLocation % 2);
	        player.playerXLocation =  player.playerXLocation - 1;
	        player.playerUnit.relocate( IndexToPixel.indexToPixelX(player.playerXLocation,  player.playerYLocation),IndexToPixel.indexToPixelY(player.playerXLocation,  player.playerYLocation));
	    			 } else if (ae.getCode() == KeyCode.W && player.playerYLocation > 0) {
		        EventLog.logEvent("W key was pressed");
		        player.playerYLocation =  player.playerYLocation - 1;
		        player.playerUnit.relocate( IndexToPixel.indexToPixelX(player.playerXLocation,  player.playerYLocation),IndexToPixel.indexToPixelY(player.playerXLocation,  player.playerYLocation));
		 }
		 else if (ae.getCode() == KeyCode.E ) {
		        EventLog.logEvent("E key was pressed");
		        player.playerYLocation =  player.playerYLocation - 1 * ( player.playerXLocation % 2);
		        player.playerXLocation =  player.playerXLocation + 1;
		        player.playerUnit.relocate( IndexToPixel.indexToPixelX(player.playerXLocation,  player.playerYLocation),IndexToPixel.indexToPixelY(player.playerXLocation,  player.playerYLocation));
		    			} else if (ae.getCode() == KeyCode.D && player.playerYLocation > 0) {
	        EventLog.logEvent("D key was pressed");
	        player.playerYLocation =  player.playerYLocation + 1 * ( (player.playerXLocation + 1) % 2);
	        player.playerXLocation =  player.playerXLocation + 1;
	        player.playerUnit.relocate( IndexToPixel.indexToPixelX(player.playerXLocation,  player.playerYLocation),IndexToPixel.indexToPixelY(player.playerXLocation,  player.playerYLocation));
	    			 } else if (ae.getCode() == KeyCode.S && player.playerYLocation > 0) {
		        EventLog.logEvent("S key was pressed");
		        player.playerYLocation =  player.playerYLocation + 1;
		        player.playerUnit.relocate( IndexToPixel.indexToPixelX(player.playerXLocation,  player.playerYLocation),IndexToPixel.indexToPixelY(player.playerXLocation,  player.playerYLocation));
		    			 }
		 else if (ae.getCode() == KeyCode.A && player.playerYLocation > 0) {
		        EventLog.logEvent("A key was pressed");
		        player.playerYLocation =  player.playerYLocation + 1 * (  (player.playerXLocation + 1)  % 2);
		        player.playerXLocation =  player.playerXLocation - 1;
		        player.playerUnit.relocate( IndexToPixel.indexToPixelX(player.playerXLocation,  player.playerYLocation),IndexToPixel.indexToPixelY(player.playerXLocation,  player.playerYLocation));
		    				 }		 
	    });
	}
	

	
	
	
}
