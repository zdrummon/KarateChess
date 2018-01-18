import javafx.scene.control.Button;
public class QuitGame {
	public QuitGame() {}
	
	public Button quitButton = new Button("Quit Game");
	
	public void createQuitButton() {
		EventLog.logEvent("create quit button");	
		
		//TODO set button size
		quitButton.relocate(Game.windowWidth / 2 - Game.buttonWidth * 3 / 2, Game.windowHeight * 2 / 3 - Game.buttonHeight / 2);
		quitButton.setOnAction(e -> {
			EventLog.logEvent("end program");		
			
			Game.stage.close();
			EventLog.endLog();
		});
	}
}