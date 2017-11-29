package decorator;

import java.io.PrintStream;

/**
 * MCAT>=30
 * Problem 4a) change to MCAT >=25
 */
public class MCATDecorator
  extends EvalDecorator
{
  /**MCAT>=30
   * Problem 4a) change to MCAT >=25
 * @param paramH previous req.
 */
public MCATDecorator(Evaluator paramH)
  {
    super(paramH);
  }
  
/**Medical Student need MCAT >= 30
 * Problem 4a) change to MCAT >=25
 * @param paramD Student
 * @return
 */
public boolean evaluate(Student paramD)
  {
    boolean bool = false;
    System.out.println("Inside Medical Decorator");
    if (paramD.getMCAT() >= 25)
    {
      System.out.println("MCAT score " + paramD.getMCAT() + " is greater/equal than reqd. min. score of 25.");
      bool = previousEval.evaluate(paramD);
    }
    else
    {
      System.out.println("MCAT score " + paramD.getMCAT() + " is less than 25. Hence rejected.");
    }
    System.out.println("Exiting Medical Decorator");
    return bool;
  }
}
