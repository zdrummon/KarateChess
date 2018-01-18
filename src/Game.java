//this class creates the game window and applies the scene
import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Game {
	public Game() {}	
	
	//screen and window dimensions
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int windowHeight = (int) screenSize.getHeight() / 2;
	public static int windowWidth = (int) screenSize.getWidth() / 2;
	
	//window initial layout and source
	private static StartSceneGUI startSceneGUI = new StartSceneGUI(); 
	public static Scene startScene = new Scene(startSceneGUI.startSceneLayout, windowWidth, windowHeight);
	public static Stage stage = new Stage();
		
	//build and display the main program window
	public void makeStage() {
		EventLog.logEvent("show window");	
		
		startSceneGUI.populateScene();
		
		stage.setTitle(EventLog.programVersion);
		stage.setResizable(false);
		stage.setScene(startScene);
		stage.show();
	}
}