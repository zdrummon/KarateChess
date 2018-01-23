
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameMap {
	public GameMap() {}
	
		public ImageView[][] arenaArray = new ImageView[84][84];
		
		public Image stoneHexImage = new Image(getClass().getResourceAsStream("images/stoneHex.png"));	
	    
	public void drawMap() {
		for(int i = 0; i < 21; i++) {
			for (int j = 0; j < 21; j++) {
			ImageView bufferHex = new ImageView();   
			bufferHex.setImage(stoneHexImage);
			arenaArray[i][j] = bufferHex ;
			arenaArray[i][j].relocate(IndexToPixel.indexToPixelX( i , j),IndexToPixel.indexToPixelY( i , j ) + 10);
			GameSceneGUI.gameSceneLayout.getChildren().add(arenaArray[i][j]);
			
			arenaArray[i][j].setFitWidth(Game.currentWindowHeight/21);
			arenaArray[i][j].setFitHeight(Game.currentWindowHeight/21);
		}
			}
		
	/*	
	for(int i = 0; i < 21; i++) {
		for(int j = 0; j < 21; j++) {
			
			
			arenaArray[i][j] = bufferHex ;
			
			
		}
	}
	
		
	*/	
	}
	
		

}
