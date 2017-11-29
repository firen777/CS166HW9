package decorator;

import java.io.PrintStream;

public class g
  extends a
{
  public g(h paramH)
  {
    super(paramH);
  }
  
  public boolean a(Applicant paramD)
  {
    boolean bool = false;
    System.out.println("Inside Law Decorator");
    if (paramD.getLSAT() >= 160)
    {
      System.out.println("LSAT score " + paramD.getLSAT() + " is greater/equal than reqd. min. score of 160.");
      bool = a.a(paramD);
    }
    else
    {
      System.out.println("LSAT score " + paramD.getLSAT() + " is less than 160. Hence rejected.");
    }
    System.out.println("Exiting Law Decorator");
    return bool;
  }
}
