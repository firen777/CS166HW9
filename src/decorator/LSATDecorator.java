package decorator;

import java.io.PrintStream;

/**
 * LSAT >= 160
 *
 */
public class LSATDecorator
  extends EvalDecorator
{
  /**LSAT >= 160
 * @param paramH previous req.
 */
public LSATDecorator(Evaluator paramH)
  {
    super(paramH);
  }
  
/**LSAT >= 160 for law student
 * @param paramD Student
 * @return
 */
  public boolean evaluate(Student paramD)
  {
    boolean bool = false;
    System.out.println("Inside Law Decorator");
    if (paramD.getLSAT() >= 160)
    {
      System.out.println("LSAT score " + paramD.getLSAT() + " is greater/equal than reqd. min. score of 160.");
      bool = previousEval.evaluate(paramD);
    }
    else
    {
      System.out.println("LSAT score " + paramD.getLSAT() + " is less than 160. Hence rejected.");
    }
    System.out.println("Exiting Law Decorator");
    return bool;
  }
}
