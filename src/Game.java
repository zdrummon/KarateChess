import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class Game {
	public Game() {}	
	
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int windowHeight = (int) screenSize.getHeight() / 2;
	public static int windowWidth = (int) screenSize.getWidth() / 2;	
	public static int buttonWidth = 30;
	public static int buttonHeight = 30;
	private static StartSceneGUI startSceneGUI = new StartSceneGUI(); 
	public static Scene startScene = new Scene(startSceneGUI.startSceneLayout, windowWidth, windowHeight);
	public static Stage stage = new Stage();
		
	public void createStage() {
		EventLog.logEvent("display game window");	
		
		startSceneGUI.populateStartScene();		
		stage.setTitle(EventLog.programVersion);
		stage.setResizable(false);
		stage.setScene(startScene);
		stage.show();
	}
} 