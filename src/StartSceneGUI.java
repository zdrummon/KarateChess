//this class populates the scene
import javafx.scene.layout.Pane;

public class StartSceneGUI {
	public StartSceneGUI() {}
	
	public Pane startSceneLayout = new Pane();
	public QuitGame quitGame = new QuitGame();
	public StartGame startGame = new StartGame();

	public void populateScene() {
		EventLog.logEvent("populate startScene");
		
		quitGame.createQuitButton();
		startGame.createStartButton();
		
		startSceneLayout.setStyle("-fx-background-color: #0f770f");
		startSceneLayout.getChildren().addAll(quitGame.quitButton, startGame.startButton);
	}
}