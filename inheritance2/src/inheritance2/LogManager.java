package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Logged to Database");
		}else if(logType == 2) {
			System.out.println("Logged to File");
		}else {
			System.out.println("Logged to eMail");
		}
		
	}

}
