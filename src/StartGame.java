import javafx.scene.control.Button;

public class StartGame {
	public StartGame () {}

	public Button startButton = new Button("Start Game");
	private GameSceneGUI gameSceneGUI = new GameSceneGUI();
			
	public void createStartButton() {
		EventLog.logEvent("create start button");

		//TODO set button size
		startButton.relocate(Game.currentWindowWidth / 2 - Game.buttonWidth * 3 / 2, Game.currentWindowHeight / 3 - Game.buttonHeight / 2);
		startButton.setOnAction(e -> {
			EventLog.logEvent("start game");	
			
			Game.stage.setScene(gameSceneGUI.gameScene);
			gameSceneGUI.populateGameScene();
		});	
	}
}
