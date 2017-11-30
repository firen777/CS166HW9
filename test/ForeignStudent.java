import java.io.PrintStream;

public class ForeignStudent extends AdmissionsDecorator { public ForeignStudent(AdmissionEvaluator evaluator) { super(evaluator); }
  
  public boolean evaluate(Application app) {
    boolean value = false;
    System.out.println("Inside ForeignStudent Decorator");
    if (app.getToeflScore() >= 100) {
      System.out.println("TOEFL score " + app.getToeflScore() + " is greater/equal than reqd. min. score of 100.");
      value = component.evaluate(app);
    }
    else {
      System.out.println("TOEFL score " + app.getToeflScore() + " is less than 100. Hence rejected.");
    }
    System.out.println("Exiting ForeignStudent Decorator");
    return value;
  }
}
