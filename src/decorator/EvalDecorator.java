package decorator;

public abstract class EvalDecorator
  implements Evaluator
{
  protected Evaluator previousEval;
  
  public EvalDecorator(Evaluator paramH)
  {
    previousEval = paramH;
  }
  
  public boolean evaluate(Student paramD)
  {
    return previousEval.evaluate(paramD);
  }
}
