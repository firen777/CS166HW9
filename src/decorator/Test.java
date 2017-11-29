package decorator;

import java.io.PrintStream;

public class Test
{
  public Test() {}
  
  public static void main(String[] paramArrayOfString)
  {
    System.out.println("\n\nCreating new Application of Kamlesh with GPA 3.5, GRE 1250, TOEFL 105, LSAT 165. He's a foreign student.");
    Student localD = new Student("Kamlesh", "Fremont", 124, 3.5D, 1250, 105, 0, 165, false, 20000.0D);
    Object localObject = new LSATDecorator(new GraduateDecorator(new ForeignDecorator(new GPAEvaluator()))); //delegation chain
    checkAccept(localD, (Evaluator)localObject);
    
    System.out.println("\n\nCreating new Application of Deepika with GPA 3.7, GRE 1310, TOEFL 112, MCAT 35. She's a foreign student.");
    localD = new Student("Deepika", "Fremont", 125, 3.7D, 1310, 112, 35, 0, false, 10000.0D);
    localObject = new MCATDecorator(new GraduateDecorator(new ForeignDecorator(new GPAEvaluator())));
    checkAccept(localD, (Evaluator)localObject);
    
    System.out.println("\n\nCreating new Application of Puja with GPA 3.7, GRE 1200, MCAT 25. She's not a foreign student.");
    localD = new Student("Puja", "Delaware", 126, 3.7D, 1200, 0, 25, 0, true, 10000.0D);
    localObject = new GraduateDecorator(new MCATDecorator(new GPAEvaluator()));
    checkAccept(localD, (Evaluator)localObject);
    
    System.out.println("\n\nCreating new Application of Harsha with GPA 3.65, GRE 1350, LSAT 175. She's not a foreign student.");
    localD = new Student("Harsha", "Groton", 127, 3.65D, 1350, 0, 0, 175, true, 0.0D);
    localObject = new GraduateDecorator(new LSATDecorator(new GPAEvaluator()));
    checkAccept(localD, (Evaluator)localObject);
    
    System.out.println("\n\nCreating new Application of Samir with GPA 3.4, GRE 1210, TOEFL 100. He's a foreign student, graduate applicant neither for Law nor for Medical");
    localD = new Student("Samir", "Chicago", 128, 3.4D, 1210, 100, 0, 0, false, 0.0D);
    localObject = new GraduateDecorator(new ForeignDecorator(new GPAEvaluator()));
    checkAccept(localD, (Evaluator)localObject);
    
    System.out.println("\n\nCreating new Application of Ajay with GPA 3.5, GRE 1250, TOEFL 108, LSAT 162. He's a foreign student");
    localD = new Student("Ajay", "Chicago", 129, 3.5D, 1250, 108, 0, 162, true, 0.0D);
    localObject = new LSATDecorator(new GraduateDecorator(new ForeignDecorator(new GPAEvaluator())));
    checkAccept(localD, (Evaluator)localObject);
  }
  
  /**
 * @param student
 * @param paramH
 */
public static void checkAccept(Student student, Evaluator paramH)
  {
    f localF = new f(paramH);
    boolean accepted = localF.boolF(student);
    if (accepted) {
      System.out.println("Applicant " + student.getName() + " is accepted");
    } else {
      System.out.println("Applicant " + student.getName() + " is rejected");
    }
  }
}
