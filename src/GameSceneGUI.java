//this class populates the main game screen
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
public class GameSceneGUI {
	public GameSceneGUI() {}

	private static Pane gameSceneLayout = new Pane();
	public Scene gameScene = new Scene(gameSceneLayout, Game.windowWidth, Game.windowHeight);	
//	public ToggleButton cueBallButton = new ToggleButton(Game.windowWidth / 2 - 15, Game.windowHeight / 2 - 240, "images/cueball.png", ballID++);

	public void populateGameScene() {	
		EventLog.logEvent("populate game scene");
		
//		cueBallButton.generateToggleButton();			
		gameSceneLayout.setStyle("-fx-background-color: #002266");
		gameSceneLayout.getChildren().addAll();
	}
}
