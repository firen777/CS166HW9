package decorator;

public class f
{
  Evaluator h;
  
  f(Evaluator paramH)
  {
    h = paramH;
  }
  
  /**Check if paramD is accepted base of Student type (?)
 * @param paramD Student
 * @return
 */
public boolean boolF(Student paramD)
  {
    return h.evaluate(paramD);
  }
}
