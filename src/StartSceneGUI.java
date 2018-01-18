//this class populates the scene
import javafx.scene.layout.Pane;

public class StartSceneGUI {
	public StartSceneGUI() {}
	
	public Pane startSceneLayout = new Pane();
	public QuitGame quitGame = new QuitGame();
	public StartGame startGame = new StartGame();

	public void populateStartScene() {
		EventLog.logEvent("populate start scene");
		
		quitGame.createQuitButton();
		startGame.createStartButton();		
		startSceneLayout.setStyle("-fx-background-color: #002266");
		startSceneLayout.getChildren().addAll(quitGame.quitButton, startGame.startButton);
	}
}