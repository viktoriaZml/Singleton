import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
  protected int num = 1;
  private static Logger logger = null;

  public void log(String msg) {
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss ");

    System.out.println("[" + formatForDateNow.format(dateNow) + num + "] " + msg);
  }

  private Logger() {
  }

  public static Logger getInstance() {
    if (logger == null) logger = new Logger();
    return logger;
  }
}
