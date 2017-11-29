package decorator;

import java.io.PrintStream;

/**
 * 
 *
 */
public class b
  implements h
{
  public b() {}
  
  public boolean a(Applicant paramD)
  {
    System.out.println("Inside Concrete Class of GPAEvaluator ");
    boolean bool = false;
    if (paramD.getGPA() >= 3.5D)
    {
      System.out.println("GPA score " + paramD.getGPA() + " is greater/equal than reqd. min. score of 3.5. Hence accepted");
      bool = true;
    }
    else
    {
      System.out.println("GPA score " + paramD.getGPA() + " is less than 3.5. Hence rejected.");
    }
    System.out.println("Exiting Concrete Class of GPAEvaluator ");
    return bool;
  }
}
