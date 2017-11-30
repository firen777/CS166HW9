public class Application {
  public String name;
  public String address;
  public int id;
  public double GPA;
  public int GRE;
  public int TOEFL;
  public int MCAT;
  public int LSAT;
  public boolean CAResident;
  public double income;
  public boolean accepted;
  
  public Application(String name, String address, int id, double GPA, int GRE, int TOEFL, int MCAT, int LSAT, boolean CAResident, double income) { this.name = name;
    this.address = address;
    this.id = id;
    this.GPA = GPA;
    this.GRE = GRE;
    this.TOEFL = TOEFL;
    this.MCAT = MCAT;
    this.LSAT = LSAT;
    this.CAResident = CAResident;
    this.income = income;
  }
  
  public String getName() { return name; }
  
  public int getGreScore() {
    return GRE;
  }
  
  public int getToeflScore() { return TOEFL; }
  
  public int getMcatScore() {
    return MCAT;
  }
  
  public int getLsatScore() { return LSAT; }
  
  public double getGPAScore() {
    return GPA;
  }
  
  public void setAcceptance(boolean value) { accepted = value; }
  
  public boolean getAcceptance() {
    return accepted;
  }
  
  public boolean getForeignResident() { return !CAResident; }
}
