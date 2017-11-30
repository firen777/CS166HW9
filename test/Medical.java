import java.io.PrintStream;

public class Medical extends AdmissionsDecorator { public Medical(AdmissionEvaluator evaluator) { super(evaluator); }
  
  public boolean evaluate(Application app) {
    boolean value = false;
    System.out.println("Inside Medical Decorator");
    if (app.getMcatScore() >= 30) {
      System.out.println("MCAT score " + app.getMcatScore() + " is greater/equal than reqd. min. score of 30.");
      value = component.evaluate(app);
    }
    else {
      System.out.println("MCAT score " + app.getMcatScore() + " is less than 30. Hence rejected.");
    }
    System.out.println("Exiting Medical Decorator");
    return value;
  }
}
