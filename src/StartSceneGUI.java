//this class populates the scene
import javafx.scene.layout.Pane;

public class StartSceneGUI {
	public StartSceneGUI() {}
	
	public Pane startSceneLayout = new Pane();

	public void populateScene() {
		EventLog.logEvent("populate startScene");
		
		startSceneLayout.setStyle("-fx-background-color: #0f770f");
		startSceneLayout.getChildren().addAll();
	}
}