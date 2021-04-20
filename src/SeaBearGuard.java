public class SeaBearGuard implements VisitSeaBear
{
  public enum PERSON_TYPE {
    ZOOKEEPER, CHILD, ADULT;
  }
  private SeaBear seaBear;

  public SeaBearGuard(SeaBear seaBear)
  {
    this.seaBear = seaBear;
  }

  @Override public void view(Enum personType)
  {
    seaBear.view(personType);
  }

  @Override public void feed(Enum personType)
  {
    if(personType == PERSON_TYPE.ZOOKEEPER) {
      seaBear.feed(personType);
    }
    else {
      System.out.println("Only pros can feed the sea bear!");
    }
  }

  @Override public void pet(Enum personType)
  {
    if(personType == PERSON_TYPE.CHILD) {
      seaBear.pet(personType);
    }
    else {
      System.out.println("You may not pet the sea bear!");
    }
  }
}
