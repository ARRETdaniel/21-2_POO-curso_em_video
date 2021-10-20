public class FileLog extends BaseLog {
  private java.io.PrintWriter pw;

  public FileLog(String filename) throws java.io.IOException {
    pw = new java.io.PrintWriter(new java.io.FileWriter(filename));
  }

  protected void log(String message, String level, String time) {
    pw.println(level + ": " + time + ": " + message);
    pw.flush();
  }

  public void close() {
    pw.close();
  }

 //// public class ScreenLog extends BaseLog {
 //   protected void log(String message, String level, String time) {
 //     System.out.println(level + ": " + time + ": " + message);
 //   }
 // }
}
