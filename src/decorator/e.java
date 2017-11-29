package decorator;

import java.io.PrintStream;

public class e
  extends a
{
  public e(h paramH)
  {
    super(paramH);
  }
  
  public boolean a(Applicant paramD)
  {
    boolean bool = false;
    System.out.println("Inside Graduate Decorator ");
    if (paramD.getGRE() >= 1200)
    {
      System.out.println("GRE score " + paramD.getGRE() + " is greater/equal than reqd. min. score of 1200.");
      bool = a.a(paramD);
    }
    else
    {
      System.out.println("GRE score " + paramD.getGRE() + " is less than 1200. Hence rejected.");
    }
    System.out.println("Exiting Graduate Decorator ");
    return bool;
  }
}
