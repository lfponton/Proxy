public class SeaBear implements VisitSeaBear
{

  @Override public void view(Enum personType)
  {
    System.out.println(personType + " is watching the sea bear intensely.");
  }

  @Override public void feed(Enum personType)
  {
    System.out.println(personType + " is feeding the sear bear aggressively.");
  }

  @Override public void pet(Enum personType)
  {
    System.out.println(personType + " is petting the sea bear vigorously.");
  }
}
