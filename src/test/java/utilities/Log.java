package utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	
   //Class designed to Log information(info-warn-error) into console and text file
  //Log4J properties has to be stored into src/main/java folder and contains logging configuration
	private static Logger Log = LogManager.getLogger(Log.class.getName());

			public static void info(String message) {
				Log.info(message);
			}

			public static void warn(String message) {
				Log.warn(message);
			}

			public static void error(String message) {
				Log.error(message);
			}

			public static void fatal(String message) {
				Log.fatal(message);
			}

			public static void debug(String message) {
				Log.debug(message);
			}

		}




