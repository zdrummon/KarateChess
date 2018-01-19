
public class IndexToPixel {
	public IndexToPixel() {}

	public static int indexToPixelX( int x , int y) {
		int pixelX = x * 24;
		return pixelX;
	}
	public static int indexToPixelY( int x, int y) {
		int pixelY = y * 26 - 13 * ( x % 2 );
		return pixelY;
	}
}
