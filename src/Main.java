
 /*===============================================
 *Karate Chess v0		 *
 *coded by										 *
 *	Trevor Haggerty 	- cesismalon@gmail.com	 *
 *	Zachary Drummond 	- zdrummon@gmail.com	 *
 ===============================================*/

import javafx.application.*;
import javafx.stage.Stage;
public class Main extends Application {
	public static void main(String[] arg) {
		launch(arg);
	}
	
	public Game game = new Game();
	
	//executes the main program
	@Override
	public void start(Stage stage) throws Exception {				
		EventLog.startLog();
		EventLog.logEvent("start program");	
		
		game.makeStage();	
	}
}