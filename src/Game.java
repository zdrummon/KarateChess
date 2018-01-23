import java.awt.Dimension;
import java.awt.Toolkit;
import javafx.stage.Stage;
import javafx.scene.Scene;
public class Game {
	public Game() {}
	
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static int initialWindowHeight = (int) screenSize.getHeight() / 2;
	private static int initialWindowWidth = (int) screenSize.getWidth() / 2;

	private static StartSceneGUI startSceneGUI = new StartSceneGUI(); 
	public static Scene startScene = new Scene(startSceneGUI.startSceneLayout, initialWindowWidth, initialWindowHeight);
	
	public static int currentWindowHeight = (int)startScene.getHeight();
	public static int currentWindowWidth = (int)startScene.getWidth();
	public static double windowRatio = currentWindowWidth / currentWindowHeight;

	public static int buttonWidth = currentWindowWidth / 5;
	public static int buttonHeight = currentWindowHeight / 5;
	
	public static Stage stage = new Stage();
		
	public void createStage() {
		EventLog.logEvent("display game window");	
		
		startScene.widthProperty().addListener(ea -> rescale());
		startScene.heightProperty().addListener(ea -> rescale());
		
		startSceneGUI.populateStartScene();		
		stage.setTitle(EventLog.programVersion);
		stage.setResizable(true);
		stage.setScene(startScene);
		stage.show();
	}
	
	public void rescale() {
		currentWindowHeight = (int)startScene.getHeight();
		EventLog.logEvent("the new height is " + currentWindowHeight);
		currentWindowWidth = (int)startScene.getWidth();
		EventLog.logEvent("the new width is " + currentWindowWidth);
	}
	
} 