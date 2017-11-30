public class AdmissionCalculator {
  public AdmissionEvaluator evaluator;
  
  public AdmissionCalculator(AdmissionEvaluator e) { evaluator = e; }
  
  public boolean evaluate(Application app) {
    return evaluator.evaluate(app);
  }
}
