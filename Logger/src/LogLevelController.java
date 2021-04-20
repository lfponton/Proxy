public class LogLevelController implements Logger
{

  public enum LOG_LEVEL
  {
    SPARSE, VERBOSE;
  }

  private LOG_LEVEL currentLevel;
  private Logger logger;

  public LogLevelController(LOG_LEVEL currentLevel, Logger logger)
  {
    this.currentLevel = currentLevel;
    this.logger = logger;
  }

  @Override public void log(String text)
  {
    if(currentLevel == LOG_LEVEL.VERBOSE) {
      logger.log(text);
    }
    else if(text.toLowerCase().contains("error")) {
      logger.log(text);
    }
  }
}
