public class InteractWithSearBear
{
  public static void main(String[] args)
  {
    VisitSeaBear seaBearGuard = new SeaBearGuard(new SeaBear());

    seaBearGuard.feed(SeaBearGuard.PERSON_TYPE.CHILD);
    seaBearGuard.feed(SeaBearGuard.PERSON_TYPE.ADULT);
    seaBearGuard.feed(SeaBearGuard.PERSON_TYPE.ZOOKEEPER);
    seaBearGuard.pet(SeaBearGuard.PERSON_TYPE.CHILD);
    seaBearGuard.pet(SeaBearGuard.PERSON_TYPE.ADULT);
    seaBearGuard.pet(SeaBearGuard.PERSON_TYPE.ZOOKEEPER);
    seaBearGuard.view(SeaBearGuard.PERSON_TYPE.CHILD);
    seaBearGuard.view(SeaBearGuard.PERSON_TYPE.ADULT);
    seaBearGuard.view(SeaBearGuard.PERSON_TYPE.ZOOKEEPER);
  }
}
