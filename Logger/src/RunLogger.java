public class RunLogger
{
  public static void main(String[] args)
  {
    Logger logger = new LogLevelController(LogLevelController.LOG_LEVEL.SPARSE,
        new ConsoleLogger());

    logger.log("Warning: bvalabnlawsbnd");
    logger.log("Error: nmceiowqnf");
  }
}
