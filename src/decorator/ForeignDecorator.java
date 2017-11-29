package decorator;

import java.io.PrintStream;

/**
 * TOEFL score >= 100
 *
 */
public class ForeignDecorator
  extends EvalDecorator
{
  /**TOEFL score >= 100
 * @param paramH previous minimal requirement
 */
public ForeignDecorator(Evaluator paramH)
  {
    super(paramH);
  }
  
  /**Foreign Student need to have TOEFL score >= 100
   * @param paramD Student
   * @return
   */
@Override
  public boolean evaluate(Student paramD)
  {
    boolean bool = false;
    System.out.println("Inside ForeignStudent Decorator");
    if (paramD.getTOEFL() >= 100)
    {
      System.out.println("TOEFL score " + paramD.getTOEFL() + " is greater/equal than reqd. min. score of 100.");
      bool = previousEval.evaluate(paramD);
    }
    else
    {
      System.out.println("TOEFL score " + paramD.getTOEFL() + " is less than 100. Hence rejected.");
    }
    System.out.println("Exiting ForeignStudent Decorator");
    return bool;
  }
}
