public abstract class AdmissionsDecorator implements AdmissionEvaluator {
  public AdmissionEvaluator component;
  
  public AdmissionsDecorator(AdmissionEvaluator evaluator) { component = evaluator; }
  
  public boolean evaluate(Application app) {
    return component.evaluate(app);
  }
}
