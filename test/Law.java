import java.io.PrintStream;

public class Law extends AdmissionsDecorator { public Law(AdmissionEvaluator evaluator) { super(evaluator); }
  
  public boolean evaluate(Application app) {
    boolean value = false;
    System.out.println("Inside Law Decorator");
    if (app.getLsatScore() >= 160) {
      System.out.println("LSAT score " + app.getLsatScore() + " is greater/equal than reqd. min. score of 160.");
      value = component.evaluate(app);
    }
    else {
      System.out.println("LSAT score " + app.getLsatScore() + " is less than 160. Hence rejected.");
    }
    System.out.println("Exiting Law Decorator");
    return value;
  }
}
