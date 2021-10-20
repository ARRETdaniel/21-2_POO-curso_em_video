public class EmployeeDatabaseAccessor {
  private FileLog file_log;
  private ScreenLog screen_log;
  private int log_type;
  // some ‘useful’ constants
  private final static int FILE_LOG = 0;
  private final static int SCREEN_LOG = 1;

  public EmployeeDatabaseAccessor(FileLog log) throws InitDBException {
    file_log = log;
    log_type = FILE_LOG;
    init();
  }

  public EmployeeDatabaseAccessor(ScreenLog log) throws InitDBException {
    screen_log = log;
    log_type = SCREEN_LOG;
    init();
  }

  public Employee retrieveEmployee(String first_name, String last_name) throws EmployeeNotFoundException {
    try {
      // attempt to retrieve the employee
      return null;
    } catch (EmployeeNotFoundException ex) {
      if (log_type == FILE_LOG) {
        file_log.warning("cannot locate employee: " + last_name + ", " + first_name);
      } else if (log_type == SCREEN_LOG) {
        screen_log.warning("cannot locate employee: " + last_name + ", " + first_name);
      }
      throw new EmployeeNotFoundException(last_name, first_name);
    }
  }

  private void init() throws InitDBException {
    try {
      // initialize the db connection
    } catch (DBException ex) {
      if (log_type == FILE_LOG) {
        file_log.fatal("cannot access database: " + ex.getMessage());
      } else if (log_type == SCREEN_LOG) {
        screen_log.fatal("cannot access database: " + ex.getMessage());
      }
      throw new InitDBException(ex.getMessage());
    }
  }
  // and so on, each method uses error_log to log errors
}
