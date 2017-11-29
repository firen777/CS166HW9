package decorator;

/**
 * Applicant Class
 *
 */
public class Applicant
{
  private String name;
  private String city;
  private int c;
  private double gpa;
  private int gre;
  private int toefl;
  private int mcat;
  private int lsat;
  private boolean i;
  private double j;
  private boolean k;
  
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
public Applicant(String inName, String inCity, int paramInt1, double inGPA, int inGRE, int inTOEFL, int inMCAT, int inLSAT, boolean paramBoolean, double paramDouble2)
  {
    name = inName;
    city = inCity;
    c = paramInt1;
    gpa = inGPA;
    gre = inGRE;
    toefl = inTOEFL;
    mcat = inMCAT;
    lsat = inLSAT;
    i = paramBoolean;
    j = paramDouble2;
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
  
  public void setK(boolean paramBoolean)
  {
    k = paramBoolean;
  }
  
  public boolean getK()
  {
    return k;
  }
  
  public boolean getNotI()
  {
    return !i;
  }
}
