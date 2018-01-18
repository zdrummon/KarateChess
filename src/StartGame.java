import javafx.scene.control.Button;

public class StartGame {
	public StartGame () {}

	public Button startButton = new Button("Start Game");
//	private GameplayGUI gmeplayGUI = new GameplayGUI();
			
	public void createStartButton() {
		EventLog.logEvent("generate startButton");	
		startButton.relocate(200, 200);
		startButton.setOnAction(e -> {
			EventLog.logEvent("start game");	
			
//			Game.mainStage.setScene(GameSceneContent.gameScene);
//			gameSceneContent.populateGameScene();
		});	
	}
}
