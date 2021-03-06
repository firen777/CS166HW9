package decorator;

/**
 * Applicant Class
 *
 */
public class Student
{
  private String name;
  private String city;
  private int c;
  private double gpa;
  private int gre;
  private int toefl;
  private int mcat;
  private int lsat;
  private boolean asdfBool;
  private double asdfDouble;
  private boolean xkcdBool;
  
  /** Constructor
 * @param inName Name
 * @param inCity City
 * @param paramInt1 ID# (?)
 * @param inGPA GPA
 * @param inGRE GRE
 * @param inTOEFL TOEFL
 * @param inMCAT MCAT
 * @param inLSAT LSAT
 * @param paramBoolean (?)
 * @param paramDouble2 (?)
 */
public Student(String inName, String inCity, int paramInt1, double inGPA, int inGRE, int inTOEFL, int inMCAT, int inLSAT, boolean paramBoolean, double paramDouble2)
  {
    name = inName;
    city = inCity;
    c = paramInt1;
    gpa = inGPA;
    gre = inGRE;
    toefl = inTOEFL;
    mcat = inMCAT;
    lsat = inLSAT;
    asdfBool = paramBoolean;
    asdfDouble = paramDouble2;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getGRE()
  {
    return gre;
  }
  
  public int getTOEFL()
  {
    return toefl;
  }
  
  public int getMCAT()
  {
    return mcat;
  }
  
  public int getLSAT()
  {
    return lsat;
  }
  
  public double getGPA()
  {
    return gpa;
  }
  
  public void setXKCD(boolean paramBoolean)
  {
    xkcdBool = paramBoolean;
  }
  
  public boolean getXKCD()
  {
    return xkcdBool;
  }
  
  public boolean getNotASDFBool()
  {
    return !asdfBool;
  }
}
