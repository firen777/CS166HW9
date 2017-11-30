import java.io.PrintStream;

public class GPAEvaluator implements AdmissionEvaluator { public GPAEvaluator() {}
  
  public boolean evaluate(Application app) { System.out.println("Inside Concrete Class of GPAEvaluator ");
    boolean admitted = false;
    if (app.getGPAScore() >= 3.5D) {
      System.out.println("GPA score " + app.getGPAScore() + " is greater/equal than reqd. min. score of 3.5. Hence accepted");
      admitted = true;
    }
    else {
      System.out.println("GPA score " + app.getGPAScore() + " is less than 3.5. Hence rejected.");
    }
    System.out.println("Exiting Concrete Class of GPAEvaluator ");
    return admitted;
  }
}
