import java.util.Scanner;
public class govSectorApp {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

long familyID;
String race, state;
int numOfChild;
double famIncome,totalCh = 0,totalM = 0,totalI = 0, totalO = 0;

govSector govS[] = new govSector[3];
for(int i = 0; i < govS.length;i++) {

System.out.print("\nFamily ID: ");
familyID = scanner.nextLong();
scanner.nextLine();
System.out.print("Race(M,C,I,O): ");
race = scanner.nextLine();
System.out.print("Number of Children: ");
numOfChild = scanner.nextInt();
System.out.print("Family's income per month: RM");
famIncome = scanner.nextLong();
scanner.nextLine();
System.out.print("State of residence: ");
state = scanner.nextLine();

govS[i] = new govSector(familyID, race, state,
numOfChild, famIncome);

if(govS[i].getRace().equalsIgnoreCase("M")) {
totalM = totalM + govS[i].getFamIncome();
}
else if(govS[i].getRace().equalsIgnoreCase("C")) {
totalCh = totalCh + govS[i].getFamIncome();
}
else if(govS[i].getRace().equalsIgnoreCase("I")) {
totalI = totalI + govS[i].getFamIncome();
}
else {
totalO = totalO + govS[i].getFamIncome();
}
}

String searchState;
System.out.println();
System.out.print("Enter state to search: ");
searchState = scanner.nextLine();
System.out.println("\n____Display the information on families in the state "+searchState+"____");

for(int i = 0; i < govS.length;i++) {

if(govS[i].getState().equalsIgnoreCase(searchState)) {
System.out.println(govS[i].toString());
}
}

System.out.println("Total income for Malay: RM" +totalM);
System.out.println("Total income for Chinese: RM " +totalCh);
System.out.println("Total income for Indian: RM" +totalI);
System.out.println("Total income for Others: RM" +totalO);
}
}


