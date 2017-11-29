package decorator;

import java.io.PrintStream;

public class i
  extends a
{
  public i(h paramH)
  {
    super(paramH);
  }
  
  public boolean a(Applicant paramD)
  {
    boolean bool = false;
    System.out.println("Inside ForeignStudent Decorator");
    if (paramD.getTOEFL() >= 100)
    {
      System.out.println("TOEFL score " + paramD.getTOEFL() + " is greater/equal than reqd. min. score of 100.");
      bool = a.a(paramD);
    }
    else
    {
      System.out.println("TOEFL score " + paramD.getTOEFL() + " is less than 100. Hence rejected.");
    }
    System.out.println("Exiting ForeignStudent Decorator");
    return bool;
  }
}
