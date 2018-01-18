//this class prints logged events to the console
import java.text.SimpleDateFormat;
import java.util.Date;

public class EventLog {
	public EventLog() {}
	
	public static Date logDate;
	private static SimpleDateFormat dateFormatter = new SimpleDateFormat(" dd-MM-yy' | 'hh:mm:ss");

	public static String programVersion = "Karate Chess v0 \n\n";
	private static String logColumns = "   DATE   |   TIME   |  EVENT  |  LOG ITEM";
	private static int logCounter = 0;

	public static void startLog() {
		System.out.println(programVersion + logColumns);
	}	
		
	public static void endLog() {	
		System.out.println(logColumns);
	}
	
	//formats log items and timestamps them
	public static void logEvent(String logItem) {
		String logCounterString = String.format(" | % 7d | ", ++logCounter);
		String logFormatPrint = dateFormatter.format(logDate = new Date()) + logCounterString + logItem;
		System.out.println(logFormatPrint);
	}
}