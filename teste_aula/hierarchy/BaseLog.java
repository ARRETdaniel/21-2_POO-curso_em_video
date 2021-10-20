public abstract class BaseLog {
  // some useful constants, don’t worry about the syntax
  private final static String DEBUG = "DEBUG";
  private final static String INFO = "INFO";
  private final static String WARNING = "WARNING";
  private final static String ERROR = "ERROR";
  private final static String FATAL = "FATAL";

  java.text.DateFormat df = java.text.DateFormat.getDateTimeInstance();

  public void debug(String message) {
    log(message, DEBUG, getDate());
  }

  public void info(String message) {
    log(message, INFO, getDate());
  }

  public void warning(String message) {
    log(message, WARNING, getDate());
  }

  public void error(String message) {
    log(message, ERROR, getDate());
  }

  public void fatal(String message) {
    log(message, FATAL, getDate());
  }

  // creates a time stamp
  protected String getDate() {
    java.util.Date date = new java.util.Date();
    return df.format(date);
  }

  // let subclasses define how and where to write log to
  protected abstract void log(String message, String level, String time);
}
