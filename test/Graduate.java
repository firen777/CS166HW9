import java.io.PrintStream;

public class Graduate extends AdmissionsDecorator { public Graduate(AdmissionEvaluator evaluator) { super(evaluator); }
  
  public boolean evaluate(Application app) {
    boolean value = false;
    System.out.println("Inside Graduate Decorator ");
    if (app.getGreScore() >= 1200) {
      System.out.println("GRE score " + app.getGreScore() + " is greater/equal than reqd. min. score of 1200.");
      value = component.evaluate(app);
    }
    else {
      System.out.println("GRE score " + app.getGreScore() + " is less than 1200. Hence rejected.");
    }
    System.out.println("Exiting Graduate Decorator ");
    return value;
  }
}
