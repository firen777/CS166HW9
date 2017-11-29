package decorator;

import java.io.PrintStream;

/**GPA >=3.5
 * Problem 4a) change to GPA >= 3.4
 *
 */
public class GPAEvaluator
  implements Evaluator
{
  /**GPA >=3.5
 *  Problem 4a) change to GPA >= 3.4
 */
public GPAEvaluator() {}
  
  /**Check if GPA >=3.5
   * Problem 4a) change to GPA >= 3.4
   * @param paramD Student
   * @return
   */
@Override
  public boolean evaluate(Student paramD)
  {
    System.out.println("Inside Concrete Class of GPAEvaluator ");
    boolean bool = false;
    if (paramD.getGPA() >= 3.4D)
    {
      System.out.println("GPA score " + paramD.getGPA() + " is greater/equal than reqd. min. score of 3.4. Hence accepted");
      bool = true;
    }
    else
    {
      System.out.println("GPA score " + paramD.getGPA() + " is less than 3.4. Hence rejected.");
    }
    System.out.println("Exiting Concrete Class of GPAEvaluator ");
    return bool;
  }
}
