import javafx.scene.control.Button;
public class QuitGame {
	public QuitGame() {}
	
	public Button quitButton = new Button("Quit Game");
	
	public void createQuitButton() {
		EventLog.logEvent("generate exitButton");	
		quitButton.relocate(200, 400);
		quitButton.setOnAction(e -> {
			EventLog.logEvent("end program");		
			
			Game.stage.close();
			EventLog.endLog();
		});
	}
}