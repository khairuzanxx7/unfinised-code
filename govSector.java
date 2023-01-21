public class govSector { //task 1 labC Vs Java csc305

  private long familyID;
  private String race; 
  private String state;
  private int numOfChild;
  private double famIncome;

public govSector(long familyID, String race, String
state, int numOfChild, double famIncome) {

this.familyID = familyID;
this.race = race;
this.state = state;
this.numOfChild = numOfChild;
this.famIncome = famIncome;
}

public long getFamilyID() {
return familyID;
}
public String getRace() {
return race;
}
public String getState() {
return state;
}
public int getNumOfChild() {
return numOfChild;
}
public double getFamIncome() {
return famIncome;
}

double incomePerC() {
double AincomePerC = famIncome / numOfChild;
return AincomePerC;
}

public String toString() {
return "\n" + "\nFamily ID: " +familyID+ "\n"+"Race: " +race+ 
       "\n" + "Number Of Children: " +numOfChild+ "\n" + 
       "Family's Income per month: RM "+ famIncome+ "\n" +
       "State of residence: " +state+ "\n\nAverage income per child: RM " +incomePerC();
}
}


