package decorator;

import java.io.PrintStream;

/**
 * GRE >=1200
 *
 */
public class GraduateDecorator
  extends EvalDecorator
{
  /**GRE >=1200
 * @param paramH previous req
 */
public GraduateDecorator(Evaluator paramH)
  {
    super(paramH);
  }

/**
 * Graduate Student require GRE>=1200
 * @param paramD Student
 * @return
 */
@Override  
public boolean evaluate(Student paramD)
  {
    boolean bool = false;
    System.out.println("Inside Graduate Decorator ");
    if (paramD.getGRE() >= 1200)
    {
      System.out.println("GRE score " + paramD.getGRE() + " is greater/equal than reqd. min. score of 1200.");
      bool = previousEval.evaluate(paramD);
    }
    else
    {
      System.out.println("GRE score " + paramD.getGRE() + " is less than 1200. Hence rejected.");
    }
    System.out.println("Exiting Graduate Decorator ");
    return bool;
  }
}
