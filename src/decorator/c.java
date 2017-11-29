package decorator;

import java.io.PrintStream;

public class c
  extends a
{
  public c(h paramH)
  {
    super(paramH);
  }
  
  public boolean a(Applicant paramD)
  {
    boolean bool = false;
    System.out.println("Inside Medical Decorator");
    if (paramD.getMCAT() >= 30)
    {
      System.out.println("MCAT score " + paramD.getMCAT() + " is greater/equal than reqd. min. score of 30.");
      bool = a.a(paramD);
    }
    else
    {
      System.out.println("MCAT score " + paramD.getMCAT() + " is less than 30. Hence rejected.");
    }
    System.out.println("Exiting Medical Decorator");
    return bool;
  }
}
